package br.profigor.tarefasescolares.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TesteController {
    @GetMapping("/zero")
    public String hello(){
        return "teste";
    }
    @GetMapping("/um")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("teste");
        mv.addObject("resultado", 30);

        return mv;
    }
    @GetMapping("/dois")
    public String dois(Model model){
        model.addAttribute("resultado", 60);
        return "teste";
    }
    @GetMapping("/tres")
    public String tres(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("resultado", 90);
        return "teste";
    }
}
