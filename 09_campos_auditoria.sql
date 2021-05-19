--MODIFICAR TABLAS CON CAMPOS DE AUDITORIA

ALTER TABLE person ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE phone ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE email ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE category ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE borrower_list ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE user_person ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE classification ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE item ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE type ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE binnacle ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE parameter ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE author ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE editorial ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE book ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE author_for_book ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE developer ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE game ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE magazine ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE film ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);

ALTER TABLE loan ADD
(
    creation_date       DATE,
    creation_user       VARCHAR2(30),
    last_update_date    DATE,
    last_update_user    VARCHAR2(30)
);




















