package com.kataokadev.CadastroFuncionarios.Funcionario;

import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {

    public FuncionarioModel map(FuncionarioDTO funcionarioDTO) {
        FuncionarioModel funcionario = new FuncionarioModel();
        funcionario.setId(funcionarioDTO.getId());
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setCpf(funcionarioDTO.getCpf());
        funcionario.setEmail(funcionarioDTO.getEmail());
        funcionario.setCargo(funcionarioDTO.getCargo());
        funcionario.setProjeto(funcionarioDTO.getProjeto());

        return funcionario;
    }

    public FuncionarioDTO map(FuncionarioModel funcionarioModel) {
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setId(funcionarioModel.getId());
        funcionarioDTO.setNome(funcionarioModel.getNome());
        funcionarioDTO.setCpf(funcionarioModel.getCpf());
        funcionarioDTO.setEmail(funcionarioModel.getEmail());
        funcionarioDTO.setCargo(funcionarioModel.getCargo());
        funcionarioDTO.setProjeto(funcionarioModel.getProjeto());

        return funcionarioDTO;
    }
}
