package com.djm.javalearning.springresttemplatedemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // An example using Spring Rest Template
        System.out.println( "Chuck Norris Demo!" );

        RestTemplate restTemplate = new RestTemplate();

        //Get full response
        System.out.println(restTemplate.getForObject("http://api.icndb.com/jokes/random", String.class));

        //Method 1 getForOnbject from URL
        Fact response1 = restTemplate.getForObject("http://api.icndb.com/jokes/random", Fact.class);
        System.out.println(response1.getType());
        System.out.println(response1.getValue().getId());
        System.out.println(response1.getValue().getJoke());

        //Method 2 getForEntity
        ResponseEntity<Fact> response = restTemplate.getForEntity("http://api.icndb.com/jokes/random", Fact.class);

        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().getValue().getId());
        System.out.println(response.getBody().getValue().getJoke());
    }
}
