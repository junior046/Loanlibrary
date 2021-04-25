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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
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
CREATE OR REPLACE PROCEDURE proc_classification_add (
    p_classification   IN                 classification.classification%TYPE,
    p_description      IN                 classification.description%TYPE
)IS
    exception_pk EXCEPTION;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_pk, -1 );
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    INSERT INTO classification (
        id_classification,
        classification,
        description
    ) VALUES (
        S_CLASSIFICATION.NEXTVAL,
        initcap(p_classification),
        upper(p_description)
    );

    dbms_output.put_line('CLASIFICACIÓN AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN exception_pk THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL ID');
        raise_application_error(-20018, 'YA EXISTE EL ID QUE SE QUIERE AGREGAR EN EL REGISTRO DE CLASIFICACIÓN');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20019, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20020, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_classification_add;
/
CREATE OR REPLACE PROCEDURE proc_email_add (
    p_email       IN            email.email%TYPE,
    p_id_person   IN            email.id_person%TYPE
) IS

    v_id_person email.id_person%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_person
    INTO v_id_person
    FROM
        person
    WHERE
        id_person = p_id_person;

    INSERT INTO email (
        id_email,
        email,
        id_person
    ) VALUES (
        s_email.NEXTVAL,
        lower(p_email),
        p_id_person
    );
    dbms_output.put_line('EMAIL AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
   WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('NO EXISTE UNA PERSONA REGISTRADA CON ESE ID');
       raise_application_error(-20021, 'NO EXISTE EL ID DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN DUP_VAL_ON_INDEX THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20022, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20023, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20024, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_email_add;
/
CREATE OR REPLACE PROCEDURE proc_phone_add (
    p_phone       IN            phone.phone_number%TYPE,
    p_id_person   IN            phone.id_person%TYPE
) IS

    v_id_person phone.id_person%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_person
    INTO v_id_person
    FROM
        person
    WHERE
        id_person = p_id_person;

    INSERT INTO phone (
        id_phone,
        phone_number,
        id_person
    ) VALUES (
        s_phone.NEXTVAL,
        p_phone,
        p_id_person
    );
    dbms_output.put_line('TELÉFONO AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
   WHEN NO_DATA_FOUND THEN
        dbms_output.put_line('NO EXISTE UNA PERSONA REGISTRADA CON ESE ID');
       raise_application_error(-20025, 'NO EXISTE EL ID DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN DUP_VAL_ON_INDEX THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20026, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20027, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20028, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_phone_add;
/
CREATE OR REPLACE PROCEDURE proc_user_add (
    p_user        IN            user_person.user_person%TYPE,
    p_password    IN            user_person.password%TYPE,
    p_id_person   IN            user_person.id_person%TYPE
) IS
    v_id_person user_person.id_person%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_person
    INTO v_id_person
    FROM
        person
    WHERE
        id_person = p_id_person;

    INSERT INTO user_person (
        id_user,
        user_person,
        password,
        id_person
    ) VALUES (
        s_user_person.NEXTVAL,
        p_user,
        p_password,
        p_id_person
    );

    dbms_output.put_line('USER AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UNA PERSONA REGISTRADA CON ESE ID');
        raise_application_error(-20029, 'NO EXISTE EL ID DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20030, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20031, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20032, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_user_add;
/
CREATE OR REPLACE PROCEDURE proc_item_add (
    p_item                IN                    item.item%TYPE,
    p_id_user             IN                    item.id_user%TYPE,
    p_id_classification   IN                    item.id_classification%TYPE,
    p_calification        IN                    NUMBER,
    p_description         IN                    item.description%TYPE
) IS

    v_id_user    item.id_user%TYPE;
    v_id_class   item.id_classification%TYPE;
    --cal          NUMBER(2, 1);
    exception_nn EXCEPTION;
    exception_ck EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
    PRAGMA exception_init ( exception_ck, -2290 );
BEGIN
    --cal := p_calification / 10;
    SELECT
        id_user
    INTO v_id_user
    FROM
        user_person
    WHERE
        id_user = p_id_user;

    SELECT
        id_classification
    INTO v_id_class
    FROM
        classification
    WHERE
        id_classification = p_id_classification;

    INSERT INTO item (
        id_item,
        item,
        description,
        id_user,
        id_classification,
        calification
    ) VALUES (
        s_item.NEXTVAL,
        upper(p_item),
        upper(p_description),
        p_id_user,
        p_id_classification,
        p_calification
    );

    dbms_output.put_line('ITEM AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UNA USUARIO REGISTRADA CON ESE ID');
        raise_application_error(-20033, 'NO EXISTE EL USUARIO DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20034, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20035, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN exception_ck THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, VERIRIQUE LA CALIFICACIÖN.');
        raise_application_error(-20037, 'LA CALIFICACIÖN DEBE SER UN ENTERO ENTRE 0 Y 10');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20036, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_item_add;