package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarFuncionario(@RequestBody FuncionarioDTO funcionario) {
        FuncionarioDTO novoFuncionario = funcionarioService.criarFuncionario(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario criado com sucesso! ID: " + novoFuncionario.getId());
    }
    // Mostrar todos os Funcionarios (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<FuncionarioDTO>> listarFuncionarios() {
        List<FuncionarioDTO> funcionarios = funcionarioService.listarFuncionarios();
        return ResponseEntity.ok(funcionarios);
    }

    // Procurar Funcionario por id (CREATE)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarFuncionarioPorId(@PathVariable("id") Long id) {
        FuncionarioDTO funcionario = funcionarioService.listarFuncionarioPorId(id);
        if(funcionario != null) {
            return ResponseEntity.ok(funcionario);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID: " + id + " não corresponde a nenhum funcionario");
        }


    }

    // Alterar dados de Funcionario (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarFuncionarioPorId(@RequestBody FuncionarioDTO funcionario, @PathVariable("id") Long id) {
        FuncionarioDTO funcionarioDTO = funcionarioService.atualizarFuncionarioPorId(id, funcionario);

        if(funcionarioDTO != null) {
            return ResponseEntity.ok(funcionarioDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID: " +  id + " não corresponde a nenhum funcionario");
        }
    }

    // Deletar Funcionario (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarFuncionarioPorId(@PathVariable("id") Long id) {

        if (funcionarioService.listarFuncionarioPorId(id) != null) {
            funcionarioService.deletarFuncionarioPorId(id);
            return ResponseEntity.ok("Funcionario com ID: " + id + ", deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Funcionario com esse ID não foi encontrado.");
        }


    }
}
