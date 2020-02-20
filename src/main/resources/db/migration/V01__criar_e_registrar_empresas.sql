CREATE TABLE empresa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	cnpj VARCHAR(18) NOT NULL,
	tipo_empresa char(1) NOT NULL,
	razao_social VARCHAR(100) NOT NULL,
	contato VARCHAR(50) NOT NULL,
	email VARCHAR(25) NOT NULL,
	logradouro VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO empresa (nome,cnpj,tipo_empresa,razao_social,contato,email,logradouro,complemento,bairro,cep,cidade,estado)
values('LOJAS RENNER S.A' , '92.754.738/0001-62', 'M' , 'LOJAS RENNER' , 'Fleury Filho' , 'FleuryFilho@renner.com','Porto Villa Nova', 'Sala 101', 'Sabia', '11.400-12', 'Ribeirão Preto', 'SP'  )