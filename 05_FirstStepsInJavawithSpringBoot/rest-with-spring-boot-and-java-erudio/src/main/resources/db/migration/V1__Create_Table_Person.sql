CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `primeiro_nome` varchar(60) NOT NULL,
  `sobrenome` varchar(60) NOT NULL,
  `genero` varchar(6) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
);
