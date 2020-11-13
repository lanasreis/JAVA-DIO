package Java11;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class ClientHttp {
    static ExecutorService executorService = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread criada" + (thread.isDaemon() ? "daemon": "") + " Thread Group: " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {

        connectAkanaiHttp1Client();
        /*
            Um dos recursos que foram incluídos na próxima versão do JDK 11 é a API do cliente HTTP padronizada que visa substituir a classe HttpUrlConnction legada, que está presente no JDK desde os primeiros anos do Java.
            O problema com essa API antiga é descrito na propsota de aprimoramento, principalmente porque agora ela é considerada antiga e difícil de usar.

            A nova API suporta HTTP / 1.1 e HTTP / 2.
            A nova versão mais recente do protocolo HTTP foi rpojetada para melhorar o desempenho geral do envio de solicitações por um  cliente e do recebumento de  respostas do servidor.
            Isso  é conseguido através da introdução de várias alterações, como multiplexação de fluxo, compactação de cabeçalho e Push Promise.
            Além disso, o novo cliente HTTP também suporta nativamente WebSockets
        */


    }
    private static void connectAkanaiHttp1Client(){
        System.out.println("\n\n\nRunning HTTP/1.1 exemplo...\n\n");

        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Headers: " + response.headers());
            System.out.println("Response body: " + response.body());

            List<Future<?>> future = new ArrayList<>();

            System.out.println("\n\nIMAGES");
            response.body()
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='", line.indexOf("'/>'"))))
                    .forEach(image -> System.out.println(image));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://www.certus.inf.br/startups-unem-esforcos-e-ajudam-profissionais-a-ingressarem-na-area-de-tecnologia/"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Headers response: " + response.headers());
        System.out.println("Body response: " + response.body());
    }
}
