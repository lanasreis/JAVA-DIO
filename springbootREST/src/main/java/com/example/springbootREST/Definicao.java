package com.example.springbootREST;

public class Definicao {
    /*
        REST JAX-RS
        -A necessidade de trocar informaçõesentre aplicações motivou diferentes abordagens para "integração de dados".
        -E hoje vamos aprender a solução de integração denominada Webservices, que é relativamente simples de implementar, e é a mais utilizada hoje em dia

        JAX-RS é uma especificação que permite criar RESTful webservices.
        O JAX_RS foca bastante URIs e nos detalhes do protocolo HTTP para se beneficiar de seus recursos


        Para acessar os recursos do nosso servidor são utilizados diversas anotações correspondentes aos verbos HTTP, onde os mais utilizados são os:
        GET: Buscar dados.
        POST: Utilizado para criar novas informações
        PUT: Utilizado para alterar informações
        DELETE: Remover dados

        *Extraindo valores:
        @PathVariable: especifica que o valor do parâmetro,  será indicado na URI. Ex: meusite.com.br/usuario/{id}
        @RequestParam: Extrai o valor do parâmetro da URI. EX: ?idade=10&uf=RS
        @RequestBody: recebe so valores no corpo da requisição


        ResponseEntity: Representa toda resposta HTTP. Você pode controlar qualquer coisa que aconteça, código de status, cabeçalhos e corpo.

    */
}
