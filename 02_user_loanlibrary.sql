/*
Descripci�n: Creaci�n del esquema de LoanLibrary.
Fecha Creaci�n: 30/03/2021
Autor Principal: Junior A. L�pez Aguirre
*/
----DESDE SYS
CREATE USER loanlibrary
       IDENTIFIED BY loanlibrary
       DEFAULT TABLESPACE LOANLIBRARY_Data
       QUOTA 10M ON LOANLIBRARY_Data
       TEMPORARY TABLESPACE temp
       QUOTA 5M ON system;
/*
Descripci�n: Permiso y conexi�n.
Fecha Creaci�n: 30/03/2021
Autor Principal: Junior A. L�pez Aguirre
*/      
GRANT CONNECT TO loanlibrary;
GRANT CREATE ANY TABLE TO loanlibrary;