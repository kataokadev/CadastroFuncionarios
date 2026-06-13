package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/funcionarios/ui")
public class FuncionarioControllerUi {

    private final FuncionarioService funcionarioService;

    public FuncionarioControllerUi(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/listar")
    public String listarFuncionarios(Model model) {
        List<FuncionarioDTO> funcionarios = funcionarioService.listarFuncionarios();
        model.addAttribute("funcionarios", funcionarios);
        return "ListarFuncionarios";
    }

    @GetMapping("/deletar/{id}")
    public String deletarFuncionarioPorId(@PathVariable("id") Long id) {
        funcionarioService.deletarFuncionarioPorId(id);
        return "redirect:/funcionarios/ui/listar";
    }
}
