public class AplicaçõesRest {
    /*
        HOW THE INTERNET WORKS
        -Quando digitamos o endereõ no navegador, o navegador faz uma requisição para internet usando o protocolo HTTP, e na internet algum servidor interplata a resquisição e vai mandar uma resposta para o browser.

        Request and responses

        HTTP - Hypertext Transfer Protocol (Protocolo de transferência), é um protocolo utiilizado para sistemas de informação de hipermídia, distribuídos e colaborativos. Ele é a base para a comunicação de dados de Internet.

        HTTP Request - GET(HTTP Method)  /hello(Path)  HTTP/1.1(HTTP version)

        HTTP Response - HTTP/1.1(HTTP version)  200 OK(HTTP status code)  Hello, Word!(HTTP response body)

        *********************************************
        REST - Representational State Transfer (Transferência de Estado Representacional)
        -É um estilo de arquitetura que define um  conjunto de restrições e propriedades baseado em HTTP.

        É uma das formas mais usadas para integrações de sistemas mordenos.
        Utiliza verbos, códigos, cabeçalhos e URIs para compor APIs Web

        *********************************************
        http-methods

        Também são chamados de verbos
        GET - solicitar um representação de um recurso específico
        POST - utilizado para submeter um novo recurso
        PUT - substitui todas as atuais representações de seu recurso alvo
        DELETE - remove um recurso específico
        PATCH - utilizado para aplicar modificações parciais em um recurso

        TRACE, HEAD, OPTIONS, CONNECT

        *********************************************
        status

        200 - OK ----------------------- Tudo certo!
        201 - Created ------------------ Recurso criado com sucesso
        204 - No Content --------------- Tudo certo, mas não tenho resposta

        304 - Not Modified ------------- Opa... isso está no cache. Sem mudanças!

        400 - Bad Request -------------- Calma! Não entendo a requisição
        401 - Unauthorized ------------- Primeiro quero ver as suas credenciais
        403 - Forbidden ---------------- Conheço você, mas não pode acessar esse recurso
        404 - Not Found ---------------- Não achei esse recurso não parça!

        500 - Internal Server Error ---- Vixi, deu ruim pra mim!
        503 - Service Unavilable ------- "...." I'm out!


        *********************************************
        resources

        São representações dos modelos e /ou coleções de modelos que serão expostos aos clientes

        GET /cities

        [
            {"id":1, "name": "Araraquara", "state": "SP"},
            {"id":2, "name": "Ibate", "state": "SP"},
            {"id":3, "name": "São Carlos", "state": "SP"},
        ]

        GET /cities/2

        {"id":1, "name": "Araraquara", "state": "SP"},


        *********************************************
        payload

        Payload é o conteúdo das requisições e respostas. Hora chamado de corpo(body). É onde os rescursos estão localizados e representados no protocolo

        Cuidados com a representação dos dados

        UserRequest                         |   UserEntity                              |   UserResponse
        {                                   |   {                                       |   {
            "name": "Guest",                |       "id":1,                             |       "id":1,
            "password": RE%$DA#DA           |       "name": "Guest",                    |       "name": "Guest",
        }                                   |       "admin": "true",                    |       "admin": "true",
                                            |       "salary": 1000                      |       "salary": 10000
                                            |       "password": RE%$DA#DA               |   }
                                            |   }                                       |
                                            |                                           |


        *********************************************
        json-and-xml

        Para representar os recurso. Pode-se usar JSON ou XML

        {                                       |   <character>
            "id": 123,                          |       <id>123</id>
            "name": "Han Solo"                  |       <name>Han Solo</name>
        }                                       |   <character>


        *********************************************
        headers

        Permite qu eo Clietne e Servidor troquem informações adicionais entre Requisições e Respostas.

        curl - X GET "http://localhost:808/v1/cities/1" -H "accept: application/json" -H "Authorizaation: Bearer 3beca038a248ff027d0445342fe285"

        Accept ---------------- Content negotiation ----------------- Accept: application/json
        Cache-Control --------- Caching ----------------------------- Cache-Control: max-age=100
        Authorizaton ---------- Authentication ---------------------- Authorizaton: Bearer 3beca038a248ff027d0445342fe285


        *********************************************
        GEt /practices?grom=net

        1. Use substantivos e não verbos
            a.  /getAllCars /createNewCar   /deleteAllRedCars

        2. Não altere o estoda de um recurso com GET
            a.  GET /users/2/activate       GET /users/2/enable

        3. Use Plural
            a.  /cars :)
            b.  /car  :(

        4. Use sub-resources para relacionamento entre Recursos
            a.  GET /books/33/pages/

        5. Toda sub-resource é um REcurso em potencial (Negócio)
            a.  GET /states/10/cities
            b.  GET /cities?region=north

        6. Pagincação, filtros e ordenação
            a.  GET /regions?page=0&size=1&sort=name,desc
            b.  GET /cities?page=0&size=10&sort=name,asc&stat_id=5

        7. Não quebre o contrato da API. Use versçoes
            a. curl -X GET /cities -H "accept: application/vnd.brazil.api-v1.0_json"
            b. curl -X GET /v1/cities
            c. curl -X GET /cities?api_version=1.0.0

        8. Escolha o HTTP Status Code corretamente

        9. Entende o seu domínio, como representá-lo e documente a API

        10. PESQUISE NA INTERNET



    */
}
