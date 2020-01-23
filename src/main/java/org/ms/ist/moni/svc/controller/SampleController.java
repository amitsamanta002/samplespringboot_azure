package org.ms.ist.moni.svc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping("/")
    public String sample(){
        return "hello test";
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable("name") final String name){
        return "hello !" + name;
    }
}
