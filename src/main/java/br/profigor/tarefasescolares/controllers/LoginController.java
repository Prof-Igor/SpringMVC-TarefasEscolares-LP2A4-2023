package br.profigor.tarefasescolares.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/helloView")
    public String hello(){
        return "helloView";
    }
}
