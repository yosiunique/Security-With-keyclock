package com.example.security.TestResource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class TestResourceController {
    @GetMapping("")

    public String test(){
    return "passed";
}


}
