package com.kataokadev.CadastroFuncionarios.Projeto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kataokadev.CadastroFuncionarios.Funcionario.FuncionarioModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_projetos")
public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nome;

    @Column
    private String prioridade;

    // @OneToMany Um Projeto pode ter varios funcionarios
    @OneToMany(mappedBy = "projeto")
    @JsonIgnore
    private List<FuncionarioModel> funcionario;

}
