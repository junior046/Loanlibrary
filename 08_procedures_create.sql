CREATE OR REPLACE PROCEDURE proc_person_add (
    p_identification_card   IN                      person.identification_card%TYPE,
    p_first_name            IN                      person.first_name%TYPE,
    p_second_name           IN                      person.second_name%TYPE,
    p_first_lastname        IN                      person.first_lastname%TYPE,
    p_second_lastname       IN                      person.second_lastname%TYPE
) IS

    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO person (
        id_person,
        identification_card,
        first_name,
        second_name,
        first_lastname,
        second_lastname
    ) VALUES (
        s_person.NEXTVAL,
        initcap(p_identification_card),
        initcap(p_first_name),
        initcap(p_second_name),
        initcap(p_first_lastname),
        initcap(p_second_lastname)
    );

    dbms_output.put_line('PERSONA AGREGADA CON �XITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserci�n, ya existe el ID');
        raise_application_error(-20001, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE PERSONAS');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCI�N, NO PUEDEDEJAR VAC�O UN CAMPO OLIGATORIO.');
        raise_application_error(-20003, 'NO PUEDEDEJAR VAC�O UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20002, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_person_add;
/
CREATE OR REPLACE PROCEDURE proc_category_add (
    p_category      IN              category.category%TYPE,
    p_description   IN              category.description%TYPE
) IS
    exception_pk EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
BEGIN
    INSERT INTO category (
        id_category,
        category,
        description
    ) VALUES (
        s_category.NEXTVAL,
        p_category,
        p_description
    );

    dbms_output.put_line('CATEGOR�A AGREGADA CON �XITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('EROOR DE INSERCI�N, YA EXISTE EL ID');
        raise_application_error(-20004, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE CATEGOR�A');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20005, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_category_add;
/
create or replace PROCEDURE proc_editorial_add (
    p_editorial            IN                      editorial.editorial%TYPE
) IS

    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO editorial (
        id_editorial,
        editorial
        
    ) VALUES (
        s_editorial.NEXTVAL,
        initcap(p_editorial)
    );

    dbms_output.put_line('EDITORIAL AGREGADA CON �XITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserci�n, ya existe el ID');
        raise_application_error(-20004, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE EDITORIAL');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCI�N, NO PUEDEDEJAR VAC�O UN CAMPO OLIGATORIO.');
        raise_application_error(-20005, 'NO PUEDE DEJAR VAC�O UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20006, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_editorial_add;
/