package com.example.springbootREST;

public class Definicao {


    /*
        FILTER
        -init(FilterConfig filterConfig);
        -Chamado pelo contêiner da web para indicar para um filtro que ele está sendo colocado em serviço

        -doFilter()
        -Método do Filtro é chamado pelo contêiner toda vez que um par de solicitação / resposta é passado pela cadeia devido a uma solicitação do cliente por um recurso no final da cadeia.
        -O FilterChain transmita a solicitação e a resposta para a próxima entidadae na cadeia

        -destroy();
        -Esse método é chamado apenas quando todos os threads no método doFilter do filtro tiverem saído ou após um período de tempo limite.
        -Depois que o contêiner da Web chamar esse método, ele não chamaŕa o método doFilter novamente nesta instância do filtro
        -limpar memória
    */
}
