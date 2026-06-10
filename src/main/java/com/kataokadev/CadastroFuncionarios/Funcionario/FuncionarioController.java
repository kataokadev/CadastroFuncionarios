package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rota")
public class FuncionarioController {

    @GetMapping
    public String boasVindas(){
        return "Seja Bem Vindo a minha rota";
    }
}
