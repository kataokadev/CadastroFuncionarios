package com.kataokadev.CadastroFuncionarios.Projeto;

import com.kataokadev.CadastroFuncionarios.Funcionario.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}
