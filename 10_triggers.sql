-- PERSON TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.PersonBeforeInsert
BEFORE INSERT
ON loanlibrary.person
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END PersonBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.PersonBeforeUpdate
BEFORE UPDATE
ON loanlibrary.person
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END PersonBeforeUpdate;
/

-- PHONE TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.PhoneBeforeInsert
BEFORE INSERT
ON loanlibrary.phone
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END PhoneBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.PhoneBeforeUpdate
BEFORE UPDATE
ON loanlibrary.phone
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END PhoneBeforeUpdate;
/

-- EMAIL TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.EmailBeforeInsert
BEFORE INSERT
ON loanlibrary.email
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END EmailBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.EmailBeforeUpdate
BEFORE UPDATE
ON loanlibrary.email
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END EmailBeforeUpdate;
/

-- CATEGORY TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.CategoryBeforeInsert
BEFORE INSERT
ON loanlibrary.category
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END CategoryBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.


CREATE OR REPLACE TRIGGER loanlibrary.CategoryBeforeUpdate
BEFORE UPDATE
ON loanlibrary.category
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END CategoryBeforeUpdate;
/

-- BORROWER_LIST TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BorrowerListBeforeInsert
BEFORE INSERT
ON loanlibrary.borrower_list
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END BorrowerListBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BorrowerListBeforeUpdate
BEFORE UPDATE
ON loanlibrary.borrower_list
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END BorrowerListBeforeUpdate;
/

-- USER_PERSON TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.UserPersonBeforeInsert
BEFORE INSERT
ON loanlibrary.user_person
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END UserPersonBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.UserPersonBeforeUpdate
BEFORE UPDATE
ON loanlibrary.user_person
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END UserPersonBeforeUpdate;
/

-- CLASSIFICATION TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ClassificationBeforeInsert
BEFORE INSERT
ON loanlibrary.classification
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END ClassificationBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ClassificationBeforeUpdate
BEFORE UPDATE
ON loanlibrary.classification
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END ClassificationBeforeUpdate;
/

-- ITEM TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ItemBeforeInsert
BEFORE INSERT
ON loanlibrary.item
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END ItemBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ItemBeforeUpdate
BEFORE UPDATE
ON loanlibrary.item
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END ItemBeforeUpdate;
/

-- TYPE TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.TypeBeforeInsert
BEFORE INSERT
ON loanlibrary.type
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END TypeBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.TypeBeforeUpdate
BEFORE UPDATE
ON loanlibrary.type
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END TypeBeforeUpdate;
/

-- BINNACLE TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BinnacleBeforeInsert
BEFORE INSERT
ON loanlibrary.binnacle
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END BinnacleBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BinnacleBeforeUpdate
BEFORE UPDATE
ON loanlibrary.binnacle
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END BinnacleBeforeUpdate;
/

-- PARAMETER TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ParameterBeforeInsert
BEFORE INSERT
ON loanlibrary.parameter
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END ParameterBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.ParameterBeforeUpdate
BEFORE UPDATE
ON loanlibrary.parameter
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END ParameterBeforeUpdate;
/

-- AUTHOR TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.AuthorBeforeInsert
BEFORE INSERT
ON loanlibrary.author
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END AuthorBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.AuthorBeforeUpdate
BEFORE UPDATE
ON loanlibrary.author
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END AuthorBeforeUpdate;
/

-- EDITORIAL TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.
/

CREATE OR REPLACE TRIGGER loanlibrary.EditorialBeforeInsert
BEFORE INSERT
ON loanlibrary.editorial
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END EditorialBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.EditorialBeforeUpdate
BEFORE UPDATE
ON loanlibrary.editorial
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END EditorialBeforeUpdate;
/

-- BOOK TRIGGERS

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BookBeforeInsert
BEFORE INSERT
ON loanlibrary.book
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END BookBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.BookBeforeUpdate
BEFORE UPDATE
ON loanlibrary.book
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END BookBeforeUpdate;
/

-- AUTHOR_FOR_BOOK TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.AuthorBookBeforeInsert
BEFORE INSERT
ON loanlibrary.author_for_book
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END AuthorBookBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.AuthorBookBeforeUpdate
BEFORE UPDATE
ON loanlibrary.author_for_book
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END AuthorBookBeforeUpdate;
/

-- DEVELOPER TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.DeveloperBeforeInsert
BEFORE INSERT
ON loanlibrary.developer
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END DeveloperBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.DeveloperBeforeUpdate
BEFORE UPDATE
ON loanlibrary.developer
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END DeveloperBeforeUpdate;
/

-- GAME TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.GameBeforeInsert
BEFORE INSERT
ON loanlibrary.game
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END GameBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.GameBeforeUpdate
BEFORE UPDATE
ON loanlibrary.game
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END GameBeforeUpdate;
/

-- MAGAZINE TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.MagazineBeforeInsert
BEFORE INSERT
ON loanlibrary.magazine
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END MagazineBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.MagazineBeforeUpdate
BEFORE UPDATE
ON loanlibrary.magazine
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END MagazineBeforeUpdate;
/

-- FILM TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.FilmBeforeInsert
BEFORE INSERT
ON loanlibrary.film
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END FilmBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.FilmBeforeUpdate
BEFORE UPDATE
ON loanlibrary.film
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END FilmBeforeUpdate;
/

-- LOAN TRIGGER

-- Trigger that inserts the user and date information before 
-- there is an insertion in the table.

CREATE OR REPLACE TRIGGER loanlibrary.LoanBeforeInsert
BEFORE INSERT
ON loanlibrary.loan
For each row
BEGIN
    :new.creation_user:=USER;
    :new.creation_date:=SYSDATE;
END BLoanBeforeInsert;
/

-- Trigger that inserts the user and date information before 
-- there is an update in the table.

CREATE OR REPLACE TRIGGER loanlibrary.LoanBeforeUpdate
BEFORE UPDATE
ON loanlibrary.loan
For each row
BEGIN
    :new.last_update_user:=USER;
    :new.last_update_date:=SYSDATE;
END LoanBeforeUpdate;
/







