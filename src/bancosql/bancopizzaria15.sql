/*
SQLyog Ultimate v9.51 
MySQL - 5.6.26-log : Database - pizzaria15
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pizzaria15` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pizzaria15`;

/*Table structure for table `categoriaproduto` */

DROP TABLE IF EXISTS `categoriaproduto`;

CREATE TABLE `categoriaproduto` (
  `categoria` varchar(20) NOT NULL,
  PRIMARY KEY (`categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `categoriaproduto` */

insert  into `categoriaproduto`(`categoria`) values ('Massa'),('Refrigerante');

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `telefone` varchar(13) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `numero` varchar(6) DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`telefone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clientes` */

insert  into `clientes`(`telefone`,`nome`,`cep`,`endereco`,`numero`,`complemento`,`cidade`,`uf`,`bairro`) values ('11343485','Paulo','08080300','FIGUEIREDO PIMENTEL','10','dfsfds','SAO PAULO','SP','PARQUE PAULISTANO'),('34344534','Paulo','08080100','SUACUAPARA','10','aaaa','SAO PAULO','SP','PARQUE PAULISTANO');

/*Table structure for table `contaspagar` */

DROP TABLE IF EXISTS `contaspagar`;

CREATE TABLE `contaspagar` (
  `notaFiscal` varchar(100) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `dataRecebimento` varchar(10) DEFAULT NULL,
  `dataEmissao` varchar(10) DEFAULT NULL,
  `dataVencimento` varchar(10) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  `juros` varchar(10) DEFAULT NULL,
  `multa` varchar(10) DEFAULT NULL,
  `fornecedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`notaFiscal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contaspagar` */

insert  into `contaspagar`(`notaFiscal`,`descricao`,`dataRecebimento`,`dataEmissao`,`dataVencimento`,`valor`,`juros`,`multa`,`fornecedor`) values ('121','jghj','12/12/1212','12/12/1212','12/12/1212','1,00','1,00','1,00',NULL),('123','ghgf123','21/22/2121','12/12/1212','12/12/1212','100,50','3,25','1,00',NULL),('2113','hjghj','23/13/2213','12/31/2312','12/31/2313','2,00','2,00','2,00',NULL),('321','mnmbnm','02/09/2013','02/09/2013','02/09/2013',' 1,00','1,50','1,30',NULL),('5434534534','gdfgdfgfdgd','34/23/4243','34/23/4234','42/34/3242','R$ 3,00','3,00%','4,00%',NULL),('545354535435','3433','43/53/5435','45/34/5453','54/35/4433','3,00','4,00','3,00','Paulo'),('63','sdfsfsf		','12/31/3131','34/34/3434','43/43/4343','R$ 1,00','1,00%','1,00%',NULL);

/*Table structure for table `contasreceber` */

DROP TABLE IF EXISTS `contasreceber`;

CREATE TABLE `contasreceber` (
  `telefone` varchar(13) DEFAULT NULL,
  `Cliente` varchar(50) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `valor` varchar(10) DEFAULT NULL,
  `juros` varchar(10) DEFAULT NULL,
  `multa` varchar(10) DEFAULT NULL,
  `tipopagamento` varchar(20) DEFAULT NULL,
  `nparcela` varchar(1) DEFAULT NULL,
  `dtrecebimento` varchar(10) DEFAULT NULL,
  `dtemissao` varchar(10) DEFAULT NULL,
  `dtvencimento` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contasreceber` */

insert  into `contasreceber`(`telefone`,`Cliente`,`descricao`,`valor`,`juros`,`multa`,`tipopagamento`,`nparcela`,`dtrecebimento`,`dtemissao`,`dtvencimento`) values ('2113','2312312','1312312','0,00','0,00','0,00','Cartão de Crédito','3','31/23/2313','31/23/1231','  /  /    '),('45345','4535','1312312','0,00','0,00','0,00','Cartão de Crédito','3','31/23/2313','31/23/1231','  /  /    '),('1','1','1312312','0,00','0,00','0,00','Cartão de Débito','5','31/23/2313','31/23/1231','  /  /    '),('43','343','45345','5,00','5,00','5,00','Cartão de Débito','2','53/45/4354','45/33/4534','  /  /    '),('545','6565','7876','78,00','7,00','7,00','Cartão de Débito','1','56/54/6546','45/65/4654','56/65/6546');

/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `cnpjFor` varchar(20) NOT NULL,
  `cpfFor` varchar(15) DEFAULT NULL,
  `nomeFantasia` varchar(50) DEFAULT NULL,
  `endeFor` varchar(50) DEFAULT NULL,
  `cidadeFor` varchar(30) DEFAULT NULL,
  `nomeContato` varchar(50) DEFAULT NULL,
  `emailFor` varchar(30) DEFAULT NULL,
  `bairroFor` varchar(30) DEFAULT NULL,
  `telFor` varchar(15) DEFAULT NULL,
  `cepFor` varchar(13) DEFAULT NULL,
  `celFor` varchar(14) DEFAULT NULL,
  `estadualFor` varchar(15) DEFAULT NULL,
  `numFor` varchar(6) DEFAULT NULL,
  `tel2For` varchar(15) DEFAULT NULL,
  `siteFor` varchar(40) DEFAULT NULL,
  `tipopessoa` varchar(17) DEFAULT NULL,
  `ufFor` varchar(2) DEFAULT NULL,
  `tipoproduto` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`cnpjFor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`cnpjFor`,`cpfFor`,`nomeFantasia`,`endeFor`,`cidadeFor`,`nomeContato`,`emailFor`,`bairroFor`,`telFor`,`cepFor`,`celFor`,`estadualFor`,`numFor`,`tel2For`,`siteFor`,`tipopessoa`,`ufFor`,`tipoproduto`) values ('  .   .   /    -  ','455.365.058-40','Paulo','SUACUAPARA','SAO PAULO','Paulo','a@a.com','PARQUE PAULISTANO','(12)3132-3243','08080100','(23)12312-4124','   .   .   .   ','10','(12)3111-2312','a.com.br','Pessoa Fisica','SP','Massa'),('63.312.206/0001-77','   .   .   -  ','Extra','SUACUAPARA','SAO PAULO','Roberto','a@a.com','PARQUE PAULISTANO','(12)2334-4324','08080100','(11)23432-4213','867.545.524.534','2','(23)1323-1243','a.com.br','Pessoa Juridica','SP','Refrigerante');

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `nomeFun` varchar(50) DEFAULT NULL,
  `rgFun` varchar(15) DEFAULT NULL,
  `cpfFun` varchar(15) NOT NULL,
  `nasciFun` varchar(10) DEFAULT NULL,
  `endeFun` varchar(100) DEFAULT NULL,
  `compleFun` varchar(100) DEFAULT NULL,
  `bairroFun` varchar(50) DEFAULT NULL,
  `cidadeFun` varchar(20) DEFAULT NULL,
  `cepFun` varchar(15) DEFAULT NULL,
  `numFun` varchar(5) DEFAULT NULL,
  `telFun` varchar(15) DEFAULT NULL,
  `celFun` varchar(15) DEFAULT NULL,
  `sexoFun` varchar(10) NOT NULL,
  `setorFun` varchar(20) DEFAULT NULL,
  `ufFun` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`cpfFun`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`nomeFun`,`rgFun`,`cpfFun`,`nasciFun`,`endeFun`,`compleFun`,`bairroFun`,`cidadeFun`,`cepFun`,`numFun`,`telFun`,`celFun`,`sexoFun`,`setorFun`,`ufFun`) values ('Paulo','48.695.431-6','057.045.958-39','29/01/1995','SUACUAPARA','sds','PARQUE PAULISTANO','SAO PAULO','08080100',' 10','(11)2585-8180','(11)25813-1621','Masculino','balcao','SP'),('Paulo','48.695.431-6','455.365.058-40','29/01/1995','SUACUAPARA','sds','PARQUE PAULISTANO','SAO PAULO','08080100',' 10','(11)2585-8180','(11)25813-1621','Masculino','balcao','SP');

/*Table structure for table `produtos` */

DROP TABLE IF EXISTS `produtos`;

CREATE TABLE `produtos` (
  `codigoproduto` varchar(5) NOT NULL,
  `tipoproduto` varchar(20) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `ingredientes` varchar(50) DEFAULT NULL,
  `unidmedida` varchar(2) DEFAULT NULL,
  `estocavel` varchar(3) DEFAULT NULL,
  `qtdeminima` int(6) DEFAULT NULL,
  `acabadoprima` varchar(25) DEFAULT NULL,
  `dataregistro` varchar(10) DEFAULT NULL,
  `valor` float(6,2) DEFAULT NULL,
  `qtdeestoque` int(6) DEFAULT NULL,
  `produtovenda` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`codigoproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `produtos` */

insert  into `produtos`(`codigoproduto`,`tipoproduto`,`descricao`,`ingredientes`,`unidmedida`,`estocavel`,`qtdeminima`,`acabadoprima`,`dataregistro`,`valor`,`qtdeestoque`,`produtovenda`) values ('','testando','testando int float','massa, tomate, oleo, queijo','UN','SIM',10,'Produto Acabado',NULL,12.30,100,'SIM'),('123','Massa','massa para pizza','trigo	','UN','SIM',11,'Produto Acabado',NULL,10.00,11,'SIM'),('5566','','343','45435','UN','SIM',4,'Produto Acabado',NULL,323.00,43,'SIM');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(30) DEFAULT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `login` varchar(40) NOT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `permissao` varchar(4) DEFAULT NULL,
  `logado` char(2) DEFAULT NULL,
  `cpfFun` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`,`cpfFun`) values (NULL,NULL,'1','1','01','s','455.365.058-40'),(NULL,NULL,'pedro','pedro','01','n','057.045.958-39'),(NULL,NULL,'teste','teste','00','n','563.553.262-43');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
