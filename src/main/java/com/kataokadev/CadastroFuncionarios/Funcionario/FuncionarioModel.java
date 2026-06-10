package com.kataokadev.CadastroFuncionarios.Funcionario;

import com.kataokadev.CadastroFuncionarios.Projeto.ProjetoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_cadastro")
public class FuncionarioModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cargo;

    @Column(unique = true)
    private String email;

    // @ManyToOne um funcionario tem um unico projeto
    @Column
    @ManyToOne
    @JoinColumn(name = "projeto_id") // Foreign key
    private ProjetoModel projeto;

}
