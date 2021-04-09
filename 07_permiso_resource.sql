
--DESDE SYSTEM
GRANT
    SELECT ANY TABLE,
    INSERT ANY TABLE,
    UPDATE ANY TABLE,
    DELETE ANY TABLE
TO loanlibrary;

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