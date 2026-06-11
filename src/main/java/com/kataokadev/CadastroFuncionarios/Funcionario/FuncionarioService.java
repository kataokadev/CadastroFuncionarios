package com.kataokadev.CadastroFuncionarios.Funcionario;

import java.util.List;

public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // Listar todos os Funcionarios
    public List<FuncionarioModel> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }
}
