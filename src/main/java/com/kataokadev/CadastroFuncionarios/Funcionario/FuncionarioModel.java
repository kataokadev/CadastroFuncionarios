package com.kataokadev.CadastroFuncionarios.Funcionario;

import com.kataokadev.CadastroFuncionarios.Projeto.ProjetoModel;
import jakarta.persistence.*;

import java.util.List;

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

    public FuncionarioModel() {
    }

    public FuncionarioModel(String nome, String cargo, String email) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
