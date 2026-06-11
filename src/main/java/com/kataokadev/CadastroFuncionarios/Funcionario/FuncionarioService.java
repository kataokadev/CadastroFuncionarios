package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

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

    // Criar um funcionario
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    // Deletar funcionario
    public void deletarFuncionarioPorId(Long id) {
        funcionarioRepository.deleteById(id);
    }

    // Atualizar Funcionario
    public FuncionarioModel atualizarFuncionarioPorId(Long id, FuncionarioModel funcionarioAtualizado) {
        if(funcionarioRepository.existsById(id)){
            funcionarioAtualizado.setId(id);
            return funcionarioRepository.save(funcionarioAtualizado);
        }
        return null;
    }
}
