/*
Descripción: Creación del esquema de LoanLibrary.
Fecha Creación: 30/03/2021
Autor Principal: Junior A. López Aguirre
*/
----DESDE SYS
CREATE USER loanlibrary
       IDENTIFIED BY loanlibrary
       DEFAULT TABLESPACE LOANLIBRARY_Data
       QUOTA 10M ON LOANLIBRARY_Data
       TEMPORARY TABLESPACE temp
       QUOTA 5M ON system;
/*
Descripción: Permiso y conexión.
Fecha Creación: 30/03/2021
Autor Principal: Junior A. López Aguirre
*/      
GRANT CONNECT TO loanlibrary;
GRANT CREATE ANY TABLE TO loanlibrary;