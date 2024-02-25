Create database HotelDB;

use HotelDb;


create table hotel(
id_hotel int primary key,
Nome varchar (255) not null,
endereco varchar(255) not null);

create table quartos(
Numero_quarto int ,
preco float  ,
id_hotel int not null,
foreign key (id_hotel) references hotel(id_hotel) 
);

--******************************************************************************************************************************************************************--


USE master;
GO






CREATE PROCEDURE setQ
    @Num int,
    @Preco float,
    @IDHot int 
AS
BEGIN 
    INSERT INTO quartos (Numero_quarto, preco, id_hotel)
    VALUES (@Num, @Preco, @IDHot);
END;

drop table quartos;

drop procedure setQ;

