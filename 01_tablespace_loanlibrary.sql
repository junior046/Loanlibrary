/*
Descripción: Tablespace de La Base de Datos LoanLibrary
Fecha Creación: 30/03/2021
Autor Principal: Junior A. López Aguirre
*/
------Desde SYS
CREATE TABLESPACE LOANLIBRARY_Data
DATAFILE 'C:\app\Junior\oradata\orcl\LOANLIBRARY01.dbf'
SIZE 10M
REUSE
AUTOEXTEND ON
NEXT 512k
MAXSIZE 200M;
--
-- PE: Index
--
/*
Descripción: Tablespace de los índices de La Base de Datos LoanLibrary
Fecha Creación: 30/03/2021
Autor Principal: Junior A. López Aguirre
*/
CREATE TABLESPACE LOANLIBRARY_Ind
       DATAFILE 'C:\app\Junior\oradata\orcl\LOANLIBRARY_IND01.dbf'
       SIZE 10M
       REUSE
       AUTOEXTEND ON
       NEXT 512k
       MAXSIZE 200M;