package com.kataokadev.CadastroFuncionarios.Funcionario;

import com.kataokadev.CadastroFuncionarios.Projeto.ProjetoModel;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_cadastro")
@ToString(exclude = "projeto")
public class FuncionarioModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String cargo;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    // @ManyToOne um funcionario tem um unico projeto
    @ManyToOne
    @JoinColumn(name = "projeto_id") // Foreign key
    private ProjetoModel projeto;

}
