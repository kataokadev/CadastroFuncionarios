package com.kataokadev.CadastroFuncionarios.Funcionario;

import java.util.List;
import java.util.Optional;

public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // Listar todos os Funcionarios
    public List<FuncionarioModel> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    // Listar Funcionarios por Id
    public FuncionarioModel listarFuncionarioPorId(Long id) {
       Optional<FuncionarioModel> funcionarioPorId= funcionarioRepository.findById(id);
       return  funcionarioPorId.orElse(null);
    }
}
