package devs.condominio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
}
