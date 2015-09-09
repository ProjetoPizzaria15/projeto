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

insert  into `categoriaproduto`(`categoria`) values ('Refrigerante'),('testando');

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

insert  into `clientes`(`telefone`,`nome`,`cep`,`endereco`,`numero`,`complemento`,`cidade`,`uf`,`bairro`) values ('(11)    -   ','hhjgj','08080100','SUACUAPARA','121','jjgh','SAO PAULO','SP','PARQUE PAULISTANO'),('(11)1221-1221','aasda','08080100','SUACUAPARA','212','','SAO PAULO','SP','PARQUE PAULISTANO'),('(11)2585-8180','ghjghj','08081400','ALVARO COELHO','1','jgjhjg','SAO PAULO','SP','PARQUE PAULISTANO'),('20258316','Paulo','08081400','ALVARO COELHO','10','teste','SAO PAULO','SP','PARQUE PAULISTANO'),('25858180','Paulo','08080100','SUACUAPARA','11','sdsdfsdfs','SAO PAULO','SP','PARQUE PAULISTANO');

/*Table structure for table `contaspagar` */

DROP TABLE IF EXISTS `contaspagar`;

CREATE TABLE `contaspagar` (
  `notaFiscal` varchar(100) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `dataRecebimento` varchar(10) DEFAULT NULL,
  `dataEmissao` varchar(10) DEFAULT NULL,
  `dataVencimento` varchar(10) DEFAULT NULL,
  `valor` varchar(100) DEFAULT NULL,
  `juros` varchar(100) DEFAULT NULL,
  `multa` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`notaFiscal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contaspagar` */

insert  into `contaspagar`(`notaFiscal`,`descricao`,`dataRecebimento`,`dataEmissao`,`dataVencimento`,`valor`,`juros`,`multa`) values ('121','jghj','12/12/1212','12/12/1212','12/12/1212','1,00','1,00','1,00'),('123','ghgf123','21/22/2121','12/12/1212','12/12/1212','100,50','3,25','1,00'),('2113','hjghj','23/13/2213','12/31/2312','12/31/2313','2,00','2,00','2,00'),('321','mnmbnm','02/09/2013','02/09/2013','02/09/2013',' 1,00','1,50','1,30'),('5434534534','gdfgdfgfdgd','34/23/4243','34/23/4234','42/34/3242','R$ 3,00','3,00%','4,00%'),('63','sdfsfsf		','12/31/3131','34/34/3434','43/43/4343','R$ 1,00','1,00%','1,00%');

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
  PRIMARY KEY (`cnpjFor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`cnpjFor`,`cpfFor`,`nomeFantasia`,`endeFor`,`cidadeFor`,`nomeContato`,`emailFor`,`bairroFor`,`telFor`,`cepFor`,`celFor`,`estadualFor`,`numFor`,`tel2For`,`siteFor`,`tipopessoa`,`ufFor`) values ('  .   .   /    -  ','455.365.058-40','Paulo','SUACUAPARA','SAO PAULO','Paulo','a@a.com','PARQUE PAULISTANO','(12)2543-4554','08080100','(11)23463-7687','   .   .   .   ','11','(12)3435-4786','a.com.br                                ','Pessoa Fisica','SP'),(' 1.111.111/1111-11',NULL,'','','','','','','(  )    -    ','','(  )     -    ','0','','(  )    -    ','',NULL,NULL),('20.326.772/0001-25','   .   .   -  ','bgdghdfgd','SUACUAPARA','SAO PAULO','gfsgf','424245@a.com','PARQUE PAULISTANO','(12)2543-4554','08080100','(11)23463-7687','121.231.321.312','421','(12)3435-4786','asdasdadasdasda','Pessoa Juridica',''),('21.235.465/4313-21',NULL,'','','','','','','(  )    -    ','','(  )     -    ','0','','(  )    -    ','',NULL,NULL),('51.492.707/0001-01','   .   .   -  ','bgdghdfgd','SUACUAPARA','SAO PAULO','gfsgf','424245@a.com','PARQUE PAULISTANO','(12)2543-4554','08080100','(11)23463-7687','121.231.321.312','421','(12)3435-4786','                                        ','Pessoa Juridica','SP'),('53.747.727/0001-01','   .   .   -  ','bgdghdfgd','SUACUAPARA','SAO PAULO','gfsgf','a@a.com','PARQUE PAULISTANO','(52)7243-4645','08080100','(64)56464-6464','454.556.654.646','10','(64)5646-4565','   fgfgsgsg                             ','Pessoa Juridica','SP'),('61.452.562/0001-60','   .   .   -  ','Teste','SUACUAPARA','SAO PAULO','Teste','a@a.com','PARQUE PAULISTANO','(11)1124-5454','08080100','(21)34687-8635','234.523.543.245','1','(12)3436-8623','a.com.br                                ','Pessoa Juridica',NULL),('61.585.465/0001-46','   .   .   -  ','bgdghdfgd','SUACUAPARA','SAO PAULO','gfsgf','424245@a.com','PARQUE PAULISTANO','(12)2543-4554','08080100','(11)23463-7687','121.231.321.312','421','(12)3435-4786','asdasdadasdasda                         ','Pessoa Juridica','SP'),('70.823.212/0001-54','   .   .   -  ','gdgdf','','','','','','(  )    -    ','','(  )     -    ','112.312.321.312','','(  )    -    ','                                        ','Pessoa Juridica',NULL);

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
  `sexoFun` varchar(10) DEFAULT NULL,
  `setorFun` varchar(20) DEFAULT NULL,
  `expedidoFun` varchar(20) DEFAULT NULL,
  `ufFun` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`cpfFun`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`nomeFun`,`rgFun`,`cpfFun`,`nasciFun`,`endeFun`,`compleFun`,`bairroFun`,`cidadeFun`,`cepFun`,`numFun`,`telFun`,`celFun`,`sexoFun`,`setorFun`,`expedidoFun`,`ufFun`) values ('','  .   .   - ','   .   .   -  ','  /  /    ','','','','','','','(  )    -    ','(  )     -    ',NULL,'',NULL,NULL),('Paulo','48.695.431-6','057.045.958-39','29/01/1995','SUACUAPARA','sds','PARQUE PAULISTANO','SAO PAULO','08080100','     ','(11)2585-8180','(11)25813-1621','Feminino','balcao',NULL,'SP'),('Paulo','48.695.431-6','455.365.058-40','29/01/1995','SUACUAPARA','nada','PARQUE PAULISTANO','SAO PAULO','08080100','23','(11)2138-6634','(11)97445-1131','Masculino','balcao',NULL,'SP');

/*Table structure for table `produtos` */

DROP TABLE IF EXISTS `produtos`;

CREATE TABLE `produtos` (
  `tipoproduto` varchar(20) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `ingredientes` varchar(50) DEFAULT NULL,
  `unidmedida` varchar(2) DEFAULT NULL,
  `estocavel` varchar(3) DEFAULT NULL,
  `qtdeminima` varchar(6) DEFAULT NULL,
  `acabadoprima` varchar(25) DEFAULT NULL,
  `dataregistro` varchar(10) DEFAULT NULL,
  `valor` varchar(6) DEFAULT NULL,
  `qtdeestoque` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `produtos` */

insert  into `produtos`(`tipoproduto`,`descricao`,`ingredientes`,`unidmedida`,`estocavel`,`qtdeminima`,`acabadoprima`,`dataregistro`,`valor`,`qtdeestoque`) values ('Refrigerante','Coca Cola','	','LT','SIM','10','nullProduto Acabado',NULL,'5,30','15'),('testando','Teste','um pouco de teste	','CX','SIM','10','Produto Prima',NULL,'5,30','100'),('testando','Teste 2','Teste 264','CX','NAO','','Produto Prima',NULL,'','');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `codigo` int(30) DEFAULT NULL,
  `nome` varchar(60) DEFAULT NULL,
  `login` varchar(40) NOT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `permissao` varchar(4) DEFAULT NULL,
  `logado` char(2) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`codigo`,`nome`,`login`,`senha`,`permissao`,`logado`,`cpf`) values (NULL,NULL,'','','00','n',NULL),(NULL,NULL,'11','11','10','n',NULL),(NULL,NULL,'11111','11111',NULL,'n',NULL),(NULL,NULL,'123123','123123','01','s',NULL),(NULL,NULL,'4455','4545',NULL,'n',NULL),(NULL,NULL,'4545','4545',NULL,'n',NULL),(NULL,NULL,'caixa','caixa','10','n',NULL),(NULL,NULL,'caixa2','caixa2','10','n',NULL),(0,'paulo','paulo36','3636','111','n',NULL),(NULL,NULL,'teste2','teste2',NULL,'n',NULL),(NULL,NULL,'usuario3','3636',NULL,'n',NULL),(NULL,NULL,'usuario4','3636',NULL,'n',NULL),(NULL,NULL,'usuario5','3636',NULL,'n',NULL),(NULL,NULL,'youtuber','cash','00','n',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;