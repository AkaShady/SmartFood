show tables;
/*
 * DATABASE NAME = smartFood
 * AUTHOR : Will@IdeaPad
 * PROJECT NAME= SmartFood
 * 05/05/2019
 * APAGANDO AS TABELAS CASO NECESSARIO
 */
create database smartFood2;
use SmartFood;

drop table IF EXISTS pedidos;
drop table IF EXISTS clientes;
drop table IF EXISTS funcionarios;
drop table IF EXISTS filiais;
drop table IF EXISTS mesas;
drop table IF EXISTS cardapios;
drop table IF EXISTS empresas;
drop table IF EXISTS usuarios;



/*CRIANDO AS TABELAS*/

CREATE TABLE IF NOT EXISTS clientes(
id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
endereco VARCHAR(100) NOT NULL,
telefone VARCHAR(14) NOT NULL,
PRIMARY KEY(id)
);
--adicionar lugares classe enum
CREATE TABLE IF NOT EXISTS mesas(
id INT AUTO_INCREMENT,
disponibilidade BOOLEAN DEFAULT TRUE,
lugares int NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS cardapios(
id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS empresas(
id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
endereco VARCHAR(100),
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS filiais(
id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
endereco VARCHAR(100) NOT NULL,
empresa VARCHAR(100),
PRIMARY KEY(id)
);
--adicionar turno classe enum
CREATE TABLE IF NOT EXISTS funcionarios(
id INT AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
endereco VARCHAR(100) NOT NULL,
empresa VARCHAR (100),
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS usuarios(
id INT AUTO_INCREMENT,
email VARCHAR(100),
senha VARCHAR(8),
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS pedidos(
id INT AUTO_INCREMENT,
cardapio VARCHAR(100),
usuario VARCHAR(100),
mesa INT,
cliente VARCHAR(100),
funcionario VARCHAR(100),
PRIMARY KEY(id)
);










