package com.kataokadev.CadastroFuncionarios.Funcionario;

import com.kataokadev.CadastroFuncionarios.Projeto.ProjetoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String cargo;
    private String email;
    private String cpf;
    private ProjetoModel projeto;

}
