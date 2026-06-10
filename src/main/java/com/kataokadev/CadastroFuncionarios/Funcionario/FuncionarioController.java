package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    // Adicionar Funcionario (CREATE)
    @PostMapping("criar")
    public String criarFuncionario() {
        return "Funcionario criado com sucesso!";
    }

    // Mostrar todos os Funcionarios (READ)
    @GetMapping("/listar")
    public String todosFuncionarios() {
        return "Funcionarios todos";
    }

    // Procurar Funcionario por id (CREATE)
    @GetMapping("listarID")
    public String todosFuncionariosID() {
        return "Funcionarios ID";
    }

    // Alterar dados de Funcionario (UPDATE)
    @PutMapping("alterarID")
    public String alterarFuncionarioID() {
        return "Funcionario alterado com sucesso!";
    }

    // Deletar Funcionario (DELETE)
    @DeleteMapping("deletarID")
    public String deletarFuncionarioID() {
        return "Funcionario deletado com sucesso!";
    }
}
