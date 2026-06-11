package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    // Adicionar Funcionario (CREATE)
    @PostMapping("/criar")
    public FuncionarioModel criarFuncionario(@RequestBody FuncionarioModel funcionario) {
        return funcionarioService.criarFuncionario(funcionario);
    }
    // Mostrar todos os Funcionarios (READ)
    @GetMapping("/listar")
    public List<FuncionarioModel> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    // Procurar Funcionario por id (CREATE)
    @GetMapping("/listar/{id}")
    public FuncionarioModel listarFuncionarioPorId(@PathVariable("id") Long id) {
        return funcionarioService.listarFuncionarioPorId(id);
    }

    // Alterar dados de Funcionario (UPDATE)
    @PutMapping("/alterarID")
    public String alterarFuncionarioID() {
        return "Funcionario alterado com sucesso!";
    }

    // Deletar Funcionario (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarFuncionarioPorId(@PathVariable("id") Long id) {
        funcionarioService.deletarFuncionarioPorId(id);
    }
}
