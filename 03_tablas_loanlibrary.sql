/*Tablas basadas en el modelo lógico de url : https://drive.google.com/file/d/1mm2V1134apR4pyHh1rfFIfHJ-qTI_dzo/view?usp=sharing
*/

/*
Descripción: Create de la tabla 'PERSON', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE person
(
    id_person                           NUMBER(6),
    identification_card                 NUMBER(9) CONSTRAINT person_identification_card_nn NOT NULL,
    CONSTRAINT person_identification_card_uk UNIQUE (identification_card),
    first_name                          VARCHAR2(25)CONSTRAINT person_first_name_nn NOT NULL,
    second_name                         VARCHAR2(25),--CONSTRAINT person_second_name_nn NOT NULL,
    first_lastname                      VARCHAR2(25)CONSTRAINT person_first_lastname_nn NOT NULL,
    second_lastname                     VARCHAR2(25)CONSTRAINT person_second_lastname_nn NOT NULL,
    CONSTRAINT person_pk PRIMARY KEY (id_person) 
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'PHONE', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE phone
(
    id_phone                           NUMBER(6),
    phone_number                       NUMBER(8) CONSTRAINT phone_phone_number_nn NOT NULL,
    CONSTRAINT phone_phone_number_uk UNIQUE (phone_number),
    id_person                          NUMBER(6) CONSTRAINT phone_person_id_nn NOT NULL,
    CONSTRAINT phone_person_id_fk
    FOREIGN KEY (id_person)
    REFERENCES person(id_person),
    CONSTRAINT phone_pk PRIMARY KEY (id_phone) 
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'EMAIL', con sus restricciónes, llave primariia y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE email
(
    id_email                          NUMBER(6) CONSTRAINT email_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    email                             VARCHAR2(70) CONSTRAINT  email_email_nn NOT NULL,
    CONSTRAINT email_email_uk UNIQUE (email),
    id_person                         NUMBER(6) CONSTRAINT email_person_id_nn NOT NULL,
    CONSTRAINT email_person_id_fk
    FOREIGN KEY (id_person)
    REFERENCES person(id_person)
);

/*
Descripción: Create de la tabla 'CATEGORY', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE category
(
    id_category                     NUMBER(6) CONSTRAINT category_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    category                        VARCHAR2(25) CONSTRAINT category_category__nn NOT NULL,
    CONSTRAINT category_category_uk UNIQUE (category),
    description                     VARCHAR2(50)
);

/*
Descripción: Create de la tabla 'BORROWER LIST', con sus restricciónes, llave primaria y foráneas.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE borrower_list
(
    id_borrower_list               NUMBER(6) CONSTRAINT borrower_list_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    id_category                    NUMBER(6) CONSTRAINT borrower_list_category_nn NOT NULL,
    CONSTRAINT borrower_list_category_fk FOREIGN KEY (id_category) REFERENCES category(id_category),
    id_borrower                    NUMBER(6) CONSTRAINT borrower_list_borrower_nn NOT NULL,
    CONSTRAINT borrower_list_borrower_fk FOREIGN KEY (id_borrower) REFERENCES person(id_person),
    id_lender                      NUMBER(6) CONSTRAINT borrower_list_lender_nn NOT NULL,
    CONSTRAINT borrower_list_lender_fk FOREIGN KEY (id_lender) REFERENCES person(id_person),
    CONSTRAINT borrower_uk UNIQUE (id_borrower ,id_lender )
);

/*
Descripción: Create de la tabla 'USER PERSON', con sus restricciónes, llave primaria y foráneas.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE user_person
(
    id_user                        NUMBER(6) CONSTRAINT user_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    user_person                    VARCHAR2(15) CONSTRAINT user_user_nn NOT NULL,
    CONSTRAINT user_user_uk UNIQUE (user_person),
    password                       VARCHAR(12) CONSTRAINT user_password_nn NOT NULL,
    id_person                      NUMBER(6) CONSTRAINT user_person_nn NOT NULL,
    CONSTRAINT user_person_uk UNIQUE (id_person),
    CONSTRAINT user_person_fk FOREIGN KEY (id_person) REFERENCES person(id_person),
    alert_days                     NUMBER(2) DEFAULT 5 CONSTRAINT user_alert_nn NOT NULL,
    loan_days                      NUMBER(2) DEFAULT 15 CONSTRAINT user_loandays_nn NOT NULL,
    days_tolerance                 NUMBER(2) DEFAULT 7 CONSTRAINT user_daystolerance_nn NOT NULL,
    administrator_user             char(1)DEFAULT 'N' CONSTRAINT user_administrator_nn NOT NULL,
   CONSTRAINT user_administrator_ck check (administrator_user in ('Y','N'))
);

/*
Descripción: Create de la tabla 'CLASSIFICATION', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE classification
(
    id_classification            NUMBER(6) CONSTRAINT classification_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    classification              VARCHAR2(25) CONSTRAINT classification_class_nn NOT NULL,
    CONSTRAINT classification_class_uk UNIQUE (classification),
    description                 VARCHAR2(50)
);

/*
Descripción: Create de la tabla 'ITEM', con sus restricciónes, llave primaria y foráneas.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE item
(
   id_item                      NUMBER(6) CONSTRAINT item_pk PRIMARY KEY ,
   item                         VARCHAR2(30) CONSTRAINT item_item_nn NOT NULL,
   description                  VARCHAR2(50),
   available                     char(1) DEFAULT 'Y' CONSTRAINT item_available_nn NOT NULL,
   CONSTRAINT item_available_ck check (available in ('Y','N')),
   id_user                      NUMBER(6) CONSTRAINT item_user_nn NOT NULL,
   CONSTRAINT item_user_fk FOREIGN KEY (id_user) REFERENCES user_person(id_user),
   cover_picture               ORDSYS.ORDImage,
   id_classification            NUMBER(6) CONSTRAINT item_classification_nn NOT NULL,
   CONSTRAINT item_classification_fk FOREIGN KEY (id_classification) REFERENCES classification(id_classification),
   calification                 NUMBER(2) CONSTRAINT item_calification_nn NOT NULL,
   CONSTRAINT item_calification_ck check (calification >0 AND calification <=10)
);

/*
Descripción: Create de la tabla 'TYPE', con sus restricciónes, llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE type
(
    id_type                   NUMBER(6) CONSTRAINT type_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    type                      VARCHAR2(20) CONSTRAINT type_type_nn NOT NULL,
    CONSTRAINT type_type_uk UNIQUE (type)
);

/*
Descripción: Create de la tabla 'BINNACLE', con sus restricciónes, llave primaria, y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE binnacle
(
    id_binnacle               NUMBER(12) CONSTRAINT binnacle_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    id_user                   NUMBER(6) CONSTRAINT binnacle_user_nn NOT NULL,
    CONSTRAINT binnacle_user_fk FOREIGN KEY (id_user) REFERENCES user_person (id_user),
    name_object               VARCHAR2(70) CONSTRAINT binnacle_name_object_nn NOT NULL,
    table_name                VARCHAR2(50) CONSTRAINT binnacle_table_nn NOT NULL,
    date_binnacle             DATE CONSTRAINT binnacle_date_nn NOT NULL,
    id_type                   NUMBER(6) CONSTRAINT binnacle_type_nn NOT NULL,
    CONSTRAINT binnacle_type_fk FOREIGN KEY (id_type) REFERENCES type(id_type)
);

/*
Descripción: Create de la tabla 'PARAMETER', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE parameter
(
    id_parameter              NUMBER(6) CONSTRAINT parameter_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    value                     NUMBER(5) CONSTRAINT parameter_value_nn NOT NULL,
    parameter                      VARCHAR2(50) CONSTRAINT parameter_parameter_nn NOT NULL,
    CONSTRAINT parameter_parameter_uk UNIQUE (parameter)
);

/*
Descripción: Create de la tabla 'AUTHOR', con sus restricciónes y llave primaria
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/


CREATE TABLE author
(
    id_author                 NUMBER(6) CONSTRAINT author_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    first_name                VARCHAR2(25)CONSTRAINT author_first_name_nn NOT NULL,
    second_name               VARCHAR2(25),--CONSTRAINT author_second_name_nn NOT NULL,
    first_lastname            VARCHAR2(25)CONSTRAINT author_first_lastname_nn NOT NULL,
    second_lastname           VARCHAR2(25)CONSTRAINT author_second_lastname_nn NOT NULL
);

/*
Descripción: Create de la tabla 'EDITORIAL', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/



CREATE TABLE editorial
(
    id_editorial            NUMBER(6) CONSTRAINT editorial_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    editorial               VARCHAR2(30) CONSTRAINT editorial_editorial_nn NOT NULL,
    CONSTRAINT editorail_editorial_uk UNIQUE(editorial)
);


/*
Descripción: Create de la tabla 'BOOK', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/


CREATE TABLE book
(
    id_item                  NUMBER(6),
    isbn                    NUMBER(13) CONSTRAINT book_isbn_nn NOT NULL,
    CONSTRAINT book_isbn_uk UNIQUE(isbn),
    edition                 NUMBER(2) CONSTRAINT book_edition_nn NOT NULL,
    id_editorial            NUMBER(6) CONSTRAINT book_editorial_nn NOT NULL,
    CONSTRAINT book_item_fk 
    FOREIGN KEY (id_item) 
    REFERENCES item(id_item),
    CONSTRAINT book_editorial_fk 
    FOREIGN KEY (id_editorial) 
    REFERENCES editorial(id_editorial),
    CONSTRAINT book_pk PRIMARY KEY (id_item)
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'AUTHOR FOR BOOK', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE author_for_book
(
    id_author               NUMBER(6),
    id_book                 NUMBER(6),
    CONSTRAINT author_book_book_fk 
    FOREIGN KEY (id_book) 
    REFERENCES book(id_item),
    CONSTRAINT author_book_author_fk 
    FOREIGN KEY (id_author) 
    REFERENCES author(id_author),
    CONSTRAINT author_for_book_pk PRIMARY KEY (id_author, id_book)
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'DEVELOPER', con sus restricciónes y llave primaria.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE developer
(
    id_developer            NUMBER(6) CONSTRAINT developer_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    developer               VARCHAR2(30) CONSTRAINT developer_developer_nn NOT NULL,
    CONSTRAINT developer_developer_uk UNIQUE(developer)
);

/*
Descripción: Create de la tabla 'GAME', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE game
(
    id_item                 NUMBER(6),
    date_game               DATE CONSTRAINT game_date_nn NOT NULL,
    id_developer            NUMBER(6) CONSTRAINT game_developer_nn NOT NULL,
    CONSTRAINT game_developer_fk
    FOREIGN KEY (id_developer) 
    REFERENCES developer(id_developer),
    CONSTRAINT game_item_fk 
    FOREIGN KEY (id_item) 
    REFERENCES item(id_item),
    CONSTRAINT game_pk PRIMARY KEY (id_item) 
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'MAGAZINE', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE magazine
(
    id_item                 NUMBER(6),
    date_magazine           DATE CONSTRAINT magazine_date_nn NOT NULL,
    registry_number     NUMBER(6) CONSTRAINT  magazine_number_nn NOT NULL,
    CONSTRAINT registry_number_uk UNIQUE (registry_number),
    CONSTRAINT magazine_item_fk 
    FOREIGN KEY (id_item) 
    REFERENCES item(id_item),
    CONSTRAINT magazine_pk PRIMARY KEY (id_item) 
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'ITEM', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE film
(
    id_item                 NUMBER(6),
    release_date            DATE CONSTRAINT film_date_nn NOT NULL,
    CONSTRAINT film_item_fk 
    FOREIGN KEY (id_item) 
    REFERENCES item(id_item),
    CONSTRAINT film_pk PRIMARY KEY (id_item) 
    USING INDEX
    TABLESPACE loanlibrary_Ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0)
);

/*
Descripción: Create de la tabla 'LOAN', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE loan
(
    id_loan                  NUMBER(6)     CONSTRAINT loan_pk PRIMARY KEY USING INDEX TABLESPACE loanlibrary_Ind PCTFREE 20 STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0),
    loan_date                DATE  CONSTRAINT loan_date_nn NOT NULL,
    repayment                DATE,
    id_item                  NUMBER(6) CONSTRAINT loan_item_nn NOT NULL,
    id_person                 NUMBER(6) CONSTRAINT loan_person_nn NOT NULL,
    CONSTRAINT loan_item_fk 
    FOREIGN KEY (id_item) 
    REFERENCES item(id_item),
    CONSTRAINT loan_person_id_fk
    FOREIGN KEY (id_person)
    REFERENCES person(id_person)
);

/*
Descripción: Create de la tabla 'CURRENT_USER', con sus restricciónes, llave primaria y foránea.
Fecha Creación: 31/03/2021
Autor Principal: Junior A. López Aguirre
*/

CREATE TABLE current_user (
    id_current   NUMBER(1)CONSTRAINT id_current_ck CHECK ( id_current < 2 ),
    id_user      NUMBER(6),    
    CONSTRAINT current_user_user_fk 
    FOREIGN KEY ( id_user )
    REFERENCES user_person ( id_user ),
    CONSTRAINT current_user 
    PRIMARY KEY ( id_current )
    USING INDEX TABLESPACE loanlibrary_ind PCTFREE 20
    STORAGE ( INITIAL 10K NEXT 10K PCTINCREASE 0 )
);
/
