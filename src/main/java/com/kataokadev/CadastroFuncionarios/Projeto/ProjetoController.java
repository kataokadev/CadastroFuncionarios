package com.kataokadev.CadastroFuncionarios.Projeto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projetos")
public class ProjetoController {

    @GetMapping("/listar")
    public String listarProjeto(){
        return "Projetos listados com sucesso";
    }

    @PostMapping("/criar")
    public String criarProjeto(){
        return "Projeto criado com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarProjeto(){
        return "Projeto alterado com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarProjeto(){
        return "Projeto deletado com sucesso";
    }
}
