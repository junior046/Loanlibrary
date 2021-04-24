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
        p_identification_card,
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
        raise_application_error(-20001, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE PERSONAS');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20003, 'NO PUEDEDEJAR VACÍO UN CAMPO OBLIGATORIO.');
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
        initcap(p_category),
        upper(p_description)
    );

    dbms_output.put_line('CATEGORÍA AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('EROOR DE INSERCIÓN, YA EXISTE EL ID');
        raise_application_error(-20004, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE CATEGORÍA');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20005, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_category_add;
/

CREATE OR REPLACE PROCEDURE proc_editorial_add (
    p_editorial   IN            editorial.editorial%TYPE
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

    dbms_output.put_line('EDITORIAL AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20004, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE EDITORIAL');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20005, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20006, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_editorial_add;
/

CREATE OR REPLACE PROCEDURE proc_developer_add (
    p_developer   IN            developer.developer%TYPE
) IS

    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO developer (
        id_developer,
        developer
    ) VALUES (
        s_developer.NEXTVAL,
        initcap(p_developer)
    );

    dbms_output.put_line('DESARROLADOR AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20007, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE DESARROLLADOR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20008, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20009, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_developer_add;
/

CREATE OR REPLACE PROCEDURE proc_parameter_add (
    p_parameter   IN            parameter.parameter%TYPE,
    p_value       IN            parameter.value%TYPE
) IS

    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO parameter (
        id_parameter,
        parameter,
        value
    ) VALUES (
        s_parameter.NEXTVAL,
        initcap(p_parameter),
        p_value
    );

    dbms_output.put_line('PARÁMETRO AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20009, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE PARÁMETRO');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20010, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20011, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_parameter_add;
/

CREATE OR REPLACE PROCEDURE proc_type_add (
    p_type   IN       type.type%TYPE
) IS

    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO type (
        id_type,
        type
    ) VALUES (
        s_type.NEXTVAL,
        initcap(p_type)
    );

    dbms_output.put_line('TIPO DE BITÁCORA AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20012, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE TIPO CAMBIO DE BITÁCORA');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20013, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20014, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_type_add;
/

CREATE OR REPLACE PROCEDURE proc_author_add(
    p_first_name            IN                      author.first_name%TYPE,
    p_second_name           IN                      author.second_name%TYPE,
    p_first_lastname        IN                      author.first_lastname%TYPE,
    p_second_lastname       IN                      author.second_lastname%TYPE
)IS
    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO author (
        id_author,
        first_name,
        second_name,
        first_lastname,
        second_lastname
    ) VALUES (
        s_author.NEXTVAL,
        initcap(p_first_name),
        initcap(p_second_name),
        initcap(p_first_lastname),
        initcap(p_second_lastname)
    );

    dbms_output.put_line('AUTOR AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('Error de inserción, ya existe el ID');
        raise_application_error(-20015, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE AUTOR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20016, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20017, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_author_add;
/
--CREATE OR REPLACE PROCEDURE proc_classification_add