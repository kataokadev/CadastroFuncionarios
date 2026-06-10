-- V2: Migrations para adicionar a coluna CPF na TB_CADASTRO

ALTER TABLE tb_cadastro
ADD COLUMN cpf VARCHAR(11) UNIQUE;