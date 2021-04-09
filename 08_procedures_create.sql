CREATE OR REPLACE PROCEDURE proc_person_add (
    p_identification_card   IN                      person.identification_card%TYPE,
    p_first_name            IN                      person.first_name%TYPE,
    p_second_name           IN                      person.second_name%TYPE,
    p_first_lastname        IN                      person.first_lastname%TYPE,
    p_second_lastname       IN                      person.second_lastname%TYPE
) IS
    exception_pk EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
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

    dbms_output.put_line('PERSONA AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20001, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20002, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_person_add;
/