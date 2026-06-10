package com.kataokadev.CadastroFuncionarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rota")
public class Controller {

    @GetMapping
    public String boasVindas(){
        return "Seja Bem Vindo a minha rota";
    }
}
