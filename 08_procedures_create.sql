/*
Descripción: Procedure para inserción de la tabla 'PERSON'.
Fecha Creación: 17/04/2021
Autor Principal: Junior A. López Aguirre.
*/

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

/*
Descripción: Procedure para inserción de la tabla 'CATEGORY'.
Fecha Creación: 17/04/2021
Autor Principal: Junior A. López Aguirre.
*/

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
/*
Descripción: Procedure para inserción de la tabla 'EDITORIAL'.
Fecha Creación: 17/04/2021
Autor Principal: Junior A. López Aguirre.
*/
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
/*
Descripción: Procedure para inserción de la tabla 'DEVELOPER'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_developer_add (
    p_developer   IN            developer.developer%TYPE
) IS
    exception_nn EXCEPTION;
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
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20049, 'EL ID O DESARROLLADOR YA FUERON AGREGADOS ANTERIORMENTE.');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20008, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20009, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_developer_add;
/
/*
Descripción: Procedure para inserción de la tabla 'PARAMETER'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

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

/*
Descripción: Procedure para inserción de la tabla 'TYPE'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

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

/*
Descripción: Procedure para inserción de la tabla 'AUTHOR'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_author_add (
    p_first_name        IN                  author.first_name%TYPE,
    p_second_name       IN                  author.second_name%TYPE,
    p_first_lastname    IN                  author.first_lastname%TYPE,
    p_second_lastname   IN                  author.second_lastname%TYPE
) IS

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

/*
Descripción: Procedure para inserción de la tabla 'CLASSIFICATION'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_classification_add (
    p_classification   IN                 classification.classification%TYPE,
    p_description      IN                 classification.description%TYPE
) IS

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
        s_classification.NEXTVAL,
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

/*
Descripción: Procedure para inserción de la tabla 'EMAIL'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/


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
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UNA PERSONA REGISTRADA CON ESE ID');
        raise_application_error(-20021, 'NO EXISTE EL ID DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
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

/*
Descripción: Procedure para inserción de la tabla 'PHONE'.
Fecha Creación: 24/04/2021
Autor Principal: Junior A. López Aguirre.
*/


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
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UNA PERSONA REGISTRADA CON ESE ID');
        raise_application_error(-20025, 'NO EXISTE EL ID DE LA PERSONA QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
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

/*
Descripción: Procedure para inserción de la tabla 'USER'.
Fecha Creación: 18/04/2021
Autor Principal: Junior A. López Aguirre.
*/

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

/*
Descripción: Procedure para inserción de la tabla 'ITEM'.
Fecha Creación: 25/04/2021
Autor Principal: Junior A. López Aguirre.
*/


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
        dbms_output.put_line('NO EXISTE UN USUARIO REGISTRADA CON ESE ID');
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
/

/*
Descripción: Procedure para inserción de la tabla 'BOOK'.
Fecha Creación: 25/04/2021
Autor Principal: Junior A. López Aguirre.
*/


CREATE OR REPLACE PROCEDURE proc_book_add (
    p_id_item     IN            book.id_item%TYPE,
    p_isbn        IN            book.isbn%TYPE,
    p_editorial   IN            book.id_editorial%TYPE,
    p_edition     IN            book.edition%TYPE
) IS

    v_id_item        book.id_item%TYPE;
    v_id_editorial   book.id_editorial%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_editorial
    INTO v_id_editorial
    FROM
        editorial
    WHERE
        id_editorial = p_editorial;

    SELECT
        id_item
    INTO v_id_item
    FROM
        item
    WHERE
        id_item = p_id_item;

    INSERT INTO book (
        id_item,
        isbn,
        edition,
        id_editorial
    ) VALUES (
        p_id_item,
        p_isbn,
        p_edition,
        p_editorial
    );

    dbms_output.put_line('LIBRO AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UN ELEMENTO O EDITORIAL REGISTRADA CON ESE ID');
        raise_application_error(-20033, 'NO EXISTE EL UN ELEMENTO O EDITORIAL QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20034, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20035, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20036, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_book_add;
/

/*
Descripción: Procedure para inserción de la tabla 'AUTHOR FOR BOOK'.
Fecha Creación: 25/04/2021
Autor Principal: Junior A. López Aguirre.
*/


CREATE OR REPLACE PROCEDURE proc_author_for_book_add (
    p_book     IN         author_for_book.id_book%TYPE,
    p_author   IN         author_for_book.id_author%TYPE
) IS

    v_id_book     author_for_book.id_book%TYPE;
    v_id_author   author_for_book.id_author%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_item
    INTO v_id_book
    FROM
        book
    WHERE
        id_item = p_book;

    SELECT
        id_author
    INTO v_id_author
    FROM
        author
    WHERE
        id_author = p_author;

    INSERT INTO author_for_book (
        id_author,
        id_book
    ) VALUES (
        p_author,
        p_book
    );

    dbms_output.put_line('AUTHOR ASIGNADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE EL AUTOR O LIBRO REGISTRADA CON ESE ID');
        raise_application_error(-20037, 'NO EXISTE EL AUTOR O LIBRO QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20038, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20039, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20040, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_author_for_book_add;
/


/*
Descripción: Procedure para inserción de la tabla 'FILM'.
Fecha Creación: 25/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_film_add (
    p_id_item   IN          film.id_item%TYPE,
    p_date      IN          film.release_date%TYPE
) IS
    v_id_item film.id_item%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_item
    INTO v_id_item
    FROM
        item
    WHERE
        id_item = p_id_item;

    INSERT INTO film (
        id_item,
        release_date
    ) VALUES (
        p_id_item,
        p_date
    );

    dbms_output.put_line('PELÍCULA AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UN ELEMENTO REGISTRADO CON ESE ID');
        raise_application_error(-20041, 'NO EXISTE EL UN ELEMENTO QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20042, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20043, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20044, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_film_add;
/

/*
Descripción: Procedure para inserción de la tabla 'MAGAZINE'.
Fecha Creación: 29/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_magazine_add (
    p_id_item        IN               magazine.id_item%TYPE,
    p_date           IN               magazine.date_magazine%TYPE,
    p_registry_num   IN               magazine.registry_number%TYPE
) IS
    v_id_item magazine.id_item%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_item
    INTO v_id_item
    FROM
        item
    WHERE
        id_item = p_id_item;

    INSERT INTO magazine (
        id_item,
        date_magazine,
        registry_number
    ) VALUES (
        p_id_item,
        p_date,
        p_registry_num
    );

    dbms_output.put_line('REVISTA AGREGADA CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UN ELEMENTO REGISTRADO CON ESE ID');
        raise_application_error(-20045, 'NO EXISTE EL UN ELEMENTO QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20046, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20047, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20048, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_magazine_add;
/

/*
Descripción: Procedure para inserción de la tabla 'GAME'.
Fecha Creación: 29/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_game_add (
    p_id_item     IN            game.id_item%TYPE,
    p_date        IN            game.date_game%TYPE,
    p_developer   IN            game.id_developer%TYPE
) IS

    v_id_item        game.id_item%TYPE;
    v_id_developer   game.id_developer%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_item
    INTO v_id_item
    FROM
        item
    WHERE
        id_item = p_id_item;

    SELECT
        id_developer
    INTO v_id_developer
    FROM
        developer
    WHERE
        id_developer = p_developer;

    INSERT INTO game (
        id_item,
        date_game,
        id_developer
    ) VALUES (
        p_id_item,
        p_date,
        p_developer
    );

    dbms_output.put_line('JUEGO AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE UN ELEMENTO O DESARROLLADOR REGISTRADO CON ESE ID');
        raise_application_error(-20050, 'NO EXISTE EL UN ELEMENTO O DESARROLLADOR QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20051, 'YA EXISTE EL VALOR Y NO SE PUEDE DUPLICAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20052, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20053, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_game_add;
/

/*
Descripción: Procedure para inserción de la tabla 'BINNACLE'.
Fecha Creación: 29/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_binnacle_add (
    p_id_user       IN              binnacle.id_user%TYPE,
    p_name_object   IN              binnacle.name_object%TYPE,
    p_table         IN              binnacle.table_name%TYPE,
    p_id_type       IN              binnacle.id_type%TYPE
) IS

    v_id_user   binnacle.id_user%TYPE;
    v_id_type   binnacle.id_type%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_user
    INTO v_id_user
    FROM
        user_person
    WHERE
        id_user = p_id_user;

    SELECT
        id_type
    INTO v_id_type
    FROM
        type
    WHERE
        id_type = p_id_type;

    INSERT INTO binnacle (
        id_binnacle,
        id_user,
        name_object,
        table_name,
        date_binnacle,
        id_type
    ) VALUES (
        s_binnacle.NEXTVAL,
        p_id_user,
        p_name_object,
        p_table,
        SYSDATE,
        p_id_type
    );

    dbms_output.put_line('EL REGISTRO DE BITÁCORA HA SIDO AGREGADO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE EL TIPO O USUARIO REGISTRADO CON ESE ID');
        raise_application_error(-20054, 'NO EXISTE EL UN ELEMENTO O DESARROLLADOR QUE SE QUIERE VINCULAR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20055, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20056, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_binnacle_add;
/

/*
Descripción: Procedure para inserción de la tabla 'CURRENT USER'.
Fecha Creación: 30/04/2021
Autor Principal: Junior A. López Aguirre.
*/

CREATE OR REPLACE PROCEDURE proc_current_user_upd (
    p_id_user   IN          current_user.id_user%TYPE
) IS

    v_id_user      current_user.id_user%TYPE;
    verification   NUMBER(1);
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        id_user
    INTO v_id_user
    FROM
        user_person
    WHERE
        id_user = p_id_user;

    SELECT
        COUNT(id_current)
    INTO verification
    FROM
        current_user;

    IF ( verification = 0 ) THEN
        INSERT INTO current_user VALUES (
            1,
            p_id_user
        );

    ELSE
        UPDATE current_user
        SET
            id_user = p_id_user
        WHERE
            id_current = 1;

    END IF;

    dbms_output.put_line('ITEM AGREGADO CON ÉXITO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        IF ( p_id_user IS NOT NULL ) THEN
            dbms_output.put_line('NO EXISTE UN USUARIO REGISTRADA CON ESE ID');
            raise_application_error(-20058, 'NO EXISTE EL USUARIO DE LA PERSONA QUE SE QUIERE VINCULAR');
        ELSE
            SELECT
                COUNT(id_current)
            INTO verification
            FROM
                current_user;

            IF ( verification = 0 ) THEN
                INSERT INTO current_user (id_current, id_user)VALUES (
                    1,
                    NULL
                );

            ELSE
                UPDATE current_user
                SET
                    id_user = NULL
                WHERE
                    id_current = 1;

            END IF;

        END IF;
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20059, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20060, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_current_user_upd;
/

/*
Descripción: Procedure para inserción de la tabla 'BORROWER lIST'.
Fecha Creación: 30/04/2021
Autor Principal: Junior A. López Aguirre.
*/


CREATE OR REPLACE PROCEDURE proc_borrower_list_add (
    p_borrower   IN           borrower_list.id_borrower%TYPE,
    p_lender     IN           borrower_list.id_lender%TYPE,
    p_category   IN           borrower_list.id_category%TYPE
) IS

    v_id_borrower   borrower_list.id_borrower%TYPE;
    v_id_lender     borrower_list.id_lender%TYPE;
    v_id_category   category.id_category%TYPE;
    exception_nn EXCEPTION;
    exception_ck EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
    PRAGMA exception_init ( exception_ck, -2290 );
BEGIN
    SELECT
        id_person
    INTO v_id_borrower
    FROM
        person
    WHERE
        id_person = p_borrower;

    SELECT
        id_person
    INTO v_id_lender
    FROM
        person
    WHERE
        id_person = p_lender;

    SELECT
        id_category
    INTO v_id_category
    FROM
        category
    WHERE
        id_category = p_category;

    IF p_borrower = p_lender THEN
        dbms_output.put_line('EL PRESTATARIO NO PUEDE SER EL MISMO QUE EL PRESTADOR');
        raise_application_error(-20999, 'EL PRESTATARIO NO PUEDE SER EL MISMO QUE EL PRESTADOR');
    END IF;

    INSERT INTO borrower_list (
        id_borrower_list,
        id_category,
        id_borrower,
        id_lender
    ) VALUES (
        s_borrower_list.NEXTVAL,
        p_category,
        p_borrower,
        p_lender
    );

    dbms_output.put_line('EL REGISTRO DE PRESTATARIO HA SIDO AGREGADO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE lA CATEGORÍA O UNA DE LAS PERSONAS QUE SE QUIERE VINCULAR');
        raise_application_error(-20063, 'NO EXISTE lA CATEGORÍA O UNA DE LAS PERSONAS  QUE SE QUIERE VINCULAR');
    WHEN dup_val_on_index THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, YA EXISTE EL VALOR');
        raise_application_error(-20064, 'YA EXISTE EL VALOR, NO PUEDE AGREGARSE UN PRESTATARIO DOS VECES A UN PRESTADOR');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20061, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20062, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_borrower_list_add;
/


/*
Descripción: Procedure para inserción de la tabla 'LOAN'.
Fecha Creación: 30/04/2021
Autor Principal: Junior A. López Aguirre.
*/


CREATE OR REPLACE PROCEDURE proc_loan_add (
    p_id_person   IN            loan.id_person%TYPE,
    p_id_item     IN            loan.id_item%TYPE
) IS

    v_id_item    loan.id_item%TYPE;
    v_person     loan.id_person%TYPE;
    v_lender     person.id_person%TYPE;
    v_borrower   person.id_person%TYPE;
    v_status     item.available%TYPE;
    exception_nn EXCEPTION;
    PRAGMA exception_init ( exception_nn, -1400 );
BEGIN
    SELECT
        i.available,
        p.id_person
    INTO
        v_status,
        v_lender
    FROM
        item          i
        INNER JOIN user_person   p ON i.id_user = p.id_user
    WHERE
        i.id_item = p_id_item;

    IF v_status = 'N' THEN
        dbms_output.put_line('EL ARTÍCULO NO ESTÁ DISPONIBLE');
        raise_application_error(-20998, 'EL ITEM NO ESTÁ DISPONIBLE');
    END IF;

    SELECT
        id_person
    INTO v_person
    FROM
        person
    WHERE
        id_person = p_id_person;

  /* SELECT
        P.id_person
    INTO v_lender
    FROM
        item I INNER JOIN USER_PERSON P ON I.ID_USER = P.ID_PERSON
    WHERE
        id_item = p_id_item;*/

    SELECT
        id_item
    INTO v_id_item
    FROM
        item
    WHERE
        id_item = p_id_item;

    dbms_output.put_line('Lender es: ' || v_lender);
    dbms_output.put_line('Borrower es: ' || p_id_person);
    SELECT
        id_borrower_list
    INTO v_borrower
    FROM
        borrower_list
    WHERE
        id_lender = v_lender
        AND id_borrower = p_id_person;

    dbms_output.put_line('AUTORIZADO EL PRÉSTAMO');
    INSERT INTO loan (
        id_loan,
        loan_date,
        id_item,
        id_person
    ) VALUES (
        s_loan.NEXTVAL,
        SYSDATE,
        p_id_item,
        p_id_person
    );

    UPDATE item
    SET
        available = 'N'
    WHERE
        id_item = p_id_item;

    dbms_output.put_line('EL REGISTRO DE PRESTAMO HA SIDO AGREGADO');
    COMMIT;
EXCEPTION
    WHEN no_data_found THEN
        dbms_output.put_line('NO EXISTE LA PERSONA EN LISTA PRESTATARIO DISPONIBLES O EL ITEM NO ESTÁ REGISTRADO');
        raise_application_error(-20065, 'NO EXISTE LA PERSONA EN LISTA PRESTATARIO DISPONIBLES O EL ITEM NO ESTÁ REGISTRADO');
    WHEN exception_nn THEN
        dbms_output.put_line('ERROR DE INSERCIÓN, NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
        raise_application_error(-20066, 'NO PUEDE DEJAR VACÍO UN CAMPO OBLIGATORIO.');
    WHEN OTHERS THEN
        dbms_output.put_line('CODIGO:' || sqlcode);
        dbms_output.put_line('MENSAJE:' || sqlerrm);
        raise_application_error(-20067, 'HA OCURRIDO UN ERROR, VERIFIQUE LOS DATOS');
END proc_loan_add;