/*
Descripción: Permisos de tablas para el esquema LOANLIBRARY.
Fecha Creación: 15/04/2021
Autor Principal: Viviana Vargas ortiz
*/

--DESDE SYSTEM
GRANT
    SELECT ANY TABLE,
    INSERT ANY TABLE,
    UPDATE ANY TABLE,
    DELETE ANY TABLE
TO loanlibrary;
/*
Descripción: Permisos de usuarios para el esquema LOANLIBRARY.
Fecha Creación: 15/04/2021
Autor Principal: Viviana Vargas Ortiz
*/

GRANT
    CREATE USER,
    ALTER USER,
    DROP USER
TO loanlibrary;

GRANT connect, resource TO loanlibrary;



/*SELECT
    grantee,
    granted_role,
    admin_option
FROM
    dba_role_privs
WHERE
    grantee = 'LOANLIBRARY';*/