package com.luis.prueba41.controller;

import com.luis.prueba41.model.Feriado;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RestClient
{
    private static final String GET_FERIADOS = "https://feriados-cl-api.herokuapp.com/feriados";
    private static final String POST_FERIADOS = "http://localhost:8080/feriado/create";

    static RestTemplate restTemplate = new RestTemplate();

    public static void main( String[] args )
    {
        getFeriadosAPI();
    }

    private static void getFeriadosAPI()
    {
        Feriado fer = new Feriado();
        List<Feriado> feriadoList;

        HttpEntity<Feriado> request = new HttpEntity( fer );

        ResponseEntity<Feriado[]> result = restTemplate.exchange(GET_FERIADOS, HttpMethod.GET, request, Feriado[].class);

        feriadoList = Arrays.stream( Objects.requireNonNull( result.getBody() ) ).collect( Collectors.toList());

        for ( Feriado f : feriadoList )
        {
            createFeriado( f );
        }
    }

    private static void createFeriado( Feriado f )
    {
        ResponseEntity<Feriado> feri = restTemplate.postForEntity( POST_FERIADOS, f, Feriado.class );
    }
}
