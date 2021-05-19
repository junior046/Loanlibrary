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
            select p.id_person, p.identification_card, p.first_name,p.second_name, p.first_lastname, p.second_lastname,e.email, ph.phone_number
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
            from classification c;
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

-- 



