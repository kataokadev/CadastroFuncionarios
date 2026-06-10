package com.kataokadev.CadastroFuncionarios.Projeto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projetos")
public class ProjetoController {

    @GetMapping("/listar")
    public String listarProjetos(){
        return "Projetos listados com sucesso";
    }

    @GetMapping("/listarID")
    public String listarProjeto(){
        return "Projeto listado com sucesso";
    }

    @PostMapping("/criar")
    public String criarProjeto(){
        return "Projeto criado com sucesso";
    }

    @PutMapping("/alterarID")
    public String alterarProjeto(){
        return "Projeto alterado com sucesso";
    }

    @DeleteMapping("/deletarID")
    public String deletarProjeto(){
        return "Projeto deletado com sucesso";
    }
}
