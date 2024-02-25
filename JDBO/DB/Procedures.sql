use  HotelDB;

CREATE PROCEDURE requestQuartos
    @ID int
AS
BEGIN
		SELECT * FROM  quartos WHERE id_hotel = @ID    
END;

create PRocedure requestH
as
begin 
	select * from hotel ;
end;

drop procedure requisicaoUnica;


CREATE PROCEDURE setHot
    @ID int,
    @Nome varchar(255),
    @Endereco varchar(255)
AS
BEGIN
    INSERT INTO hotel (id_hotel, Nome, endereco)
    VALUES (@ID, @Nome, @Endereco);
END;

CREATE PROCEDURE setQ
	@Num int,
	@Preco double,
	@IDHot int 
AS
BEGIN 
	insert into quartos
	values(@Num,@Preco, @IDHot)
END



CREATE PROCEDURE UpdateHotel
    @ID int,
    @Endereco varchar(255),
    @Nome varchar(255)
AS
BEGIN
    IF @Endereco IS NOT NULL
    BEGIN
        UPDATE hotel
        SET endereco = @Endereco
        WHERE id_hotel = @ID;
    END

    IF @Nome IS NOT NULL
    BEGIN
        UPDATE hotel
        SET Nome = @Nome
        WHERE id_hotel = @ID;
    END
END;

CREATE PROCEDURE UpdateQuarto
    @ID int,
	@ID_Quarto int,
    @Preco int
AS
BEGIN
    IF @Preco IS NOT NULL
    BEGIN
        UPDATE quartos
        SET preco = @Preco
        WHERE id_hotel = @ID and  Numero_quarto = @ID_Quarto;
    END
END;


CREATE PROCEDURE DELETAR
    @ID int,
    @Numero int
AS
BEGIN 
    IF @Numero <> 40404040
    BEGIN 
		DELETE FROM quartos WHERE id_hotel = @ID and Numero_quarto = @Numero;
    END
    ELSE
    BEGIN 
         DELETE FROM hotel WHERE id_hotel = @ID ;
		delete from quartos where id_hotel = @ID;
    END;
END;
	


USE HotelDB; 

CREATE LOGIN aj WITH PASSWORD = 'aj'; 

ALTER SERVER ROLE sysadmin ADD MEMBER aj;

use master;
ALTER ROLE db_owner ADD MEMBER aj;
CREATE USER aj FOR LOGIN aj;

drop table hotel;
drop table quartos;

select * from hotel;
select * from quartos;
drop procedure DELETAR;