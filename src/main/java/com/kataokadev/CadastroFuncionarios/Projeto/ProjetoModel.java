package com.kataokadev.CadastroFuncionarios.Projeto;

import com.kataokadev.CadastroFuncionarios.Funcionario.FuncionarioModel;
import jakarta.persistence.*;

import java.util.List;

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
    @Column
    @OneToMany(mappedBy = "projeto")
    private List<FuncionarioModel> funcionario;

    public ProjetoModel() {
    }

    public ProjetoModel(String nome, String prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
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

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        prioridade = prioridade;
    }
}
