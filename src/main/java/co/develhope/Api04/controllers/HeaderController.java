package co.develhope.Api04.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String header(@RequestHeader HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        return "Host name: " + host.getHostName() + " Port: " + host.getPort();
    }
}
