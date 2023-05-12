CREATE database Estacionamento;

use Estacionamento;

create table Carro(
placa char(7) not null primary key, 
cor varchar(20),
descricao varchar (100),
ano varchar (5)
);

select * from Carro;

drop table Carro;

