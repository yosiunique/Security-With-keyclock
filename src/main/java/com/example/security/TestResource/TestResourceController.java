package com.example.security.TestResource;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

import java.security.cert.Certificate;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class TestResourceController {
    @GetMapping("")

    public String test(){
    return "passed";
}





}
