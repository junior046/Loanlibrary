/*
Descripcion: Consultas de informacion en la
base de datos.
Fecha de creacion: 18/05/2021
Autor: Viviana Vargas Ortiz
*/

-- PERSON

CREATE OR REPLACE FUNCTION  lookup_person
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select p.id_person, p.identification_card, p.first_name,p.second_name, p.first_last_name, p.second_lastname,e.email, ph.phone_number
            from person p
            inner join email e on e.id_person=p.id_person
            inner join phone ph on ph.id_person=p.id_person;
            return l_return;
END;

-- PHONE

CREATE OR REPLACE FUNCTION  lookup_phone
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select ph.id_phone, ph.phone_number, ph.id_person
            from phone ph 
            inner join person p on p.id_person=ph.id_person;
            return l_return;
END;

-- EMAIL

CREATE OR REPLACE FUNCTION  lookup_email
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select e.id_email, e.email, e.id_person
            from email e
            inner join person p on p.id_person=e.id_person;
            return l_return;
END;

-- CATEGORY

CREATE OR REPLACE FUNCTION  lookup_category
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select c.id_category, c.catgory, c.description
            from category c;
            return l_return;
END;

-- BORROWER_LIST

CREATE OR REPLACE FUNCTION  lookup_borrower_list
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select bl.id_borrower_list, bl.id_category, bl.id_borrower, bl.id_lender
            from borrower_list bl
            inner join person p on p.id_person=bl.id_borrower
            inner join person p on p.id_person=bl.id_lender;
            return l_return;
END;

-- USER_PERSON

CREATE OR REPLACE FUNCTION  lookup_user_person
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select up.id_user, up.user_person, up.password, up.id_person, up.alert_days, up.loan_days, up.days_tolerance
            from user_person up
            inner join person p on p.id_person=up.id_person;
            return l_return;
END;

-- CLASSIFICATION

CREATE OR REPLACE FUNCTION  lookup_classification
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select c.id_classification, c.classification, c.description
            from classification c
            return l_return;
END;

-- ITEM

CREATE OR REPLACE FUNCTION  lookup_item
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select i.id_item, i.item, i.description, i.available, i.id_user, i.cover_picture, i.id_classification, i.calification
            from item i
            inner join user_person up on up.id_user=i.id_user
	    inner join classification c on c.id_classification=i.id_classification;
            return l_return;
END;

-- TYPE

CREATE OR REPLACE FUNCTION  lookup_type
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select t.id_type, t.type
            from type t;
            return l_return;
END;

-- BINNACLE

CREATE OR REPLACE FUNCTION  lookup_binnacle
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select b.id_binnacle, b.id_user, b.name_object, b.table_name, b.date_binnacle, b.id_type
            from binnacle b
	    inner join user_person up on up.id_user=b.id_user
	    inner join type t on t.id_type=b.id_type;
            return l_return;
END;

-- PARAMETER

CREATE OR REPLACE FUNCTION  lookup_parameter
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select p.id_parameter, p.value, p.parameter
            from parameter p;
            return l_return;
END;

-- AUTHOR

CREATE OR REPLACE FUNCTION  lookup_author
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select a.id_author, a.first_name, a.second_name, a.first_lastname, a.second_lastname
            from author a;
            return l_return;
END;

-- EDITORIAL

CREATE OR REPLACE FUNCTION  lookup_editorial
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select e.id_editorial, e.editorial
            from editorial e;
            return l_return;
END;

--  BOOK

CREATE OR REPLACE FUNCTION  lookup_book
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select b.id_item, b.isbn, b.edition, b.id_editorial
            from book b
	    inner join item i on i.id_item=b.id_item
	    inner join editorial e on e.id_editorial=b.id_editorial;
            return l_return;
END;

-- AUTHOR_FOR_BOOK

CREATE OR REPLACE FUNCTION  lookup_author_for_book
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select afb.id_author, afb.id_book
            from author_for_book afb
	    inner join author a on a.id_author=afb.id_author
	    inner join book b on b.id_item=afb.id_book;
            return l_return;
END;

-- DEVELOPER

CREATE OR REPLACE FUNCTION  lookup_developer
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select d.id_developer, d.developer
            from developer d;
            return l_return;
END;

-- GAME

CREATE OR REPLACE FUNCTION  lookup_game
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select g.id_item, g.date_game, g.id_developer
            from bgame g
	    inner join item i on i.id_item=g.id_item
	    inner join developer d on d.id_developer=g.id_developer;
            return l_return;
END;

-- MAGAZINE

CREATE OR REPLACE FUNCTION  lookup_magazine
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select m.id_item, m.datemagazine, m.registry_number
            from magazine m
	    inner join item i on i.id_item=m.id_item;
            return l_return;
END;

-- FILM

CREATE OR REPLACE FUNCTION  lookup_film
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select f.id_item, f.release_date
            from film f
	    inner join item i on i.id_item=f.id_item;
            return l_return;
END;

-- LOAN

CREATE OR REPLACE FUNCTION  lookup_loan
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select l.id_loan, l.loan_date, l.repayment, l.id_item, l.id_person
            from loan l
	    inner join item i on i.id_item=l.id_item
	    inner join person p on p.id_person=l.id_person;
            return l_return;
END;

-- CURRENT_USER

CREATE OR REPLACE FUNCTION  lookup_current_user
     RETURN SYS_REFCURSOR
  IS
     l_return   SYS_REFCURSOR;
BEGIN
            open l_return for
            select cu.id_current, cu.id_user
            from current_user
	    inner join user_person up on up.id_user=cu.id_user;
            return l_return;
END;



