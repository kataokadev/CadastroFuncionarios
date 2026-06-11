package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;
    private final FuncionarioMapper funcionarioMapper;

    public FuncionarioService(FuncionarioRepository funcionarioRepository, FuncionarioMapper funcionarioMapper) {
        this.funcionarioRepository = funcionarioRepository;
        this.funcionarioMapper = funcionarioMapper;
    }

    // Listar todos os Funcionarios
    public List<FuncionarioDTO> listarFuncionarios() {
        List<FuncionarioModel> funcionarios = funcionarioRepository.findAll();
        return funcionarios.stream()
                .map(funcionarioMapper::map)
                .collect(Collectors.toList());
    }

    // Listar Funcionarios por Id
    public FuncionarioDTO listarFuncionarioPorId(Long id) {
       Optional<FuncionarioModel> funcionarioPorId= funcionarioRepository.findById(id);
       return  funcionarioPorId.map(funcionarioMapper::map).orElse(null);
    }

    // Criar um funcionario
    public FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO) {
        FuncionarioModel funcionario = funcionarioMapper.map(funcionarioDTO);
        funcionarioRepository.save(funcionario);
        return funcionarioMapper.map(funcionario);
    }

    // Deletar funcionario
    public void deletarFuncionarioPorId(Long id) {
        funcionarioRepository.deleteById(id);
    }

    // Atualizar Funcionario
    public FuncionarioDTO atualizarFuncionarioPorId(Long id, FuncionarioDTO funcionarioDTO) {
        Optional<FuncionarioModel> funcionarioModel = funcionarioRepository.findById(id);
        if(funcionarioModel.isPresent()) {
            FuncionarioModel funcionarioAtualizado = funcionarioMapper.map(funcionarioDTO);
            funcionarioAtualizado.setId(id);
            FuncionarioModel funcionarioSalvo = funcionarioRepository.save(funcionarioAtualizado);
            return funcionarioMapper.map(funcionarioSalvo);
        }
        return null;
    }
}
