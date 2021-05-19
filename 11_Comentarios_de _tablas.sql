/*
Descripci�n: Comentarios de la tabla 'PERSON'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE person IS 'Esta tabla almacena la informacion de todas las personas registradas en el sistema.';
COMMENT ON COLUMN  person.id_person IS 'N�mero que identifica a la persona.';
COMMENT ON COLUMN  person.identification_card IS 'N�mero de identificaci�n de la persona.';
COMMENT ON COLUMN  person.first_name IS 'Primer nombre de la persona.';
COMMENT ON COLUMN  person.second_name IS 'Segundo nombre de la persona.';
COMMENT ON COLUMN  person.first_lastname IS 'Primer apelido de la persona.';
COMMENT ON COLUMN  person.second_lastname IS 'Segundo apellido de la persona.';
COMMENT ON COLUMN  person.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN  person.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN  Person.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN  Person.last_update_user IS '�ltima usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'PHONE'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE phone IS 'Esta tabla almacena la informacion de todos los numeros de telefono registrados en el sistema.';
COMMENT ON COLUMN phone.id_phone IS 'Id del n�mero de telefono.';
COMMENT ON COLUMN phone.phone_number IS 'N�mero de telefono.';
COMMENT ON COLUMN phone.id_person IS 'ID de la persona a la que pertence el n�mero de telefono. Llave for�nea';
COMMENT ON COLUMN phone.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN phone.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN phone.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN phone.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'EMAIL'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE email IS 'Esta tabla almacena la informaci�n de todos los correos electr�nicos registrados en el sistema.';
COMMENT ON COLUMN email.id_email IS 'Id del email.';
COMMENT ON COLUMN email.email IS 'Direccion de correo.';
COMMENT ON COLUMN email.id_person IS 'ID de la persona a la que pertence el correo. Llave for�nea';
COMMENT ON COLUMN email.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN email.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN email.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN email.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'CATEGORY'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE category IS 'Esta tabla almacena la informacion de todos las categorias de personas registradas en el sistema.';
COMMENT ON COLUMN category.id_category IS 'Id de la categor�a.';
COMMENT ON COLUMN category.category IS 'Nombre de la categor�a.';
COMMENT ON COLUMN category.description IS 'Descripci�n de la categor�a. ';
COMMENT ON COLUMN category.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN category.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN category.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN category.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'BORROWER LIST'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE borrower_list IS 'Esta tabla almacena los datos del prestamista y de la persona a la que se le presto el objeto en un prestamo registrado en el sistema.';
COMMENT ON COLUMN borrower_list.id_borrower_list IS 'Id de la lista de personas a las que se les presto un objeto.';
COMMENT ON COLUMN borrower_list.id_category IS 'Id de la categoria. Llave for�nea.';
COMMENT ON COLUMN borrower_list.id_borrower IS 'Id de de la persona que toma prestado. Llave foranea.';
COMMENT ON COLUMN borrower_list.id_lender IS 'Id de de la persona que toma prestado. Llave foranea.';
COMMENT ON COLUMN borrower_list.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN borrower_list.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN borrower_list.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN borrower_list.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'USER_PERSON'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE user_person IS 'Esta tabla almacena los datos de los usuarios registrados en el sistema.';
COMMENT ON COLUMN user_person.id_user IS 'Id del usuario.';
COMMENT ON COLUMN user_person.user_person IS 'Nombre de usuario.';
COMMENT ON COLUMN user_person.password IS 'Contrase�a del usuario. ';
COMMENT ON COLUMN user_person.id_person IS 'Id de la persona a la que pertenece el usuario. Llave foranea.';
COMMENT ON COLUMN user_person.alert_days IS 'D�as de alerta que configura el usuario.';
COMMENT ON COLUMN user_person.loan_days IS 'D�as de prestamo que configura el usuario.';
COMMENT ON COLUMN user_person.days_tolerance IS 'D�as de tolerancia para un prestamo que configura el usuario.';
COMMENT ON COLUMN user_person.administrator_user IS 'Usuario administrador';
COMMENT ON COLUMN user_person.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN user_person.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN user_person.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN user_person.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'CLASSIFICATION'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE classification IS 'Esta tabla almacena las clasificaciones de objetos registradas en el sistema.';
COMMENT ON COLUMN classification.id_classification IS 'Id de la clasificaci�n.';
COMMENT ON COLUMN classification.classification IS 'Nombre de la clasificaci�n.';
COMMENT ON COLUMN classification.description IS 'Descripci�n de la clasificacion.';
COMMENT ON COLUMN classification.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN classification.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN classification.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN classification.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'ITEM'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE item IS 'Esta tabla almacena la informacion de los objetos registrados en el sistema. ';
COMMENT ON COLUMN item.id_item IS 'Id del objeto.';
COMMENT ON COLUMN item.item IS 'Nombre del objeto.';
COMMENT ON COLUMN item.description IS 'Descripci�n del objeto.';
COMMENT ON COLUMN item.available IS 'Identifica si un objeto esta disponible o no.';
COMMENT ON COLUMN item.id_user IS 'ID del usuario duenno del objeto. Llave for�nea.';
COMMENT ON COLUMN item.cover_picture IS 'Foto de portada para el objeto.';
COMMENT ON COLUMN item.id_classification IS 'ID de la clasificacion del objeto. Llav foranea.';
COMMENT ON COLUMN item.calification IS 'Calificacion del objeto.';
COMMENT ON COLUMN item.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN item.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN item.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN item.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'TYPE'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE type IS 'Esta tabla almacena los tipos de bitacora registrados en el sistema.';
COMMENT ON COLUMN type.id_type IS 'Id del tipo.';
COMMENT ON COLUMN type.type IS 'Nombre del tipo.';
COMMENT ON COLUMN type.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN type.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN type.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN type.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'BINNACLE'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE binnacle IS 'Esta tabla almacena la informacion de las bitacoras registradas en el sistema.';
COMMENT ON COLUMN binnacle.id_binnacle IS 'Id de la bit�cora.';
COMMENT ON COLUMN binnacle.id_user IS 'ID del usuario que hizo el cambio. Llave foranea.';
COMMENT ON COLUMN binnacle.name_object IS 'Nombre del objeto de la bit�cora.';
COMMENT ON COLUMN binnacle.table_name IS 'Nombre de la tabla de la bit�cora.';
COMMENT ON COLUMN binnacle.date_binnacle IS 'Fecha de la bit�cora.';
COMMENT ON COLUMN binnacle.id_type IS 'ID del tipo. Llave for�nea. ';
COMMENT ON COLUMN binnacle.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN binnacle.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN binnacle.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN binnacle.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'Parameter'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE parameter IS 'Esta tabla almacena los datos de un parametro enviado por el usuario desde la interfaz.';
COMMENT ON COLUMN parameter.id_parameter IS 'Id del par�metro.';
COMMENT ON COLUMN parameter.value IS 'Valor num�rico del par�metro.';
COMMENT ON COLUMN parameter.parameter IS 'Texto del par�metro. ';
COMMENT ON COLUMN parameter.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN parameter.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN parameter.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN parameter.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'AUTHOR'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE author IS 'Esta tabla almacena los datos de los autores registrados en el sistema.';
COMMENT ON COLUMN author.id_author IS 'Id del autor.';
COMMENT ON COLUMN author.first_name IS 'Primer nombre del autor.';
COMMENT ON COLUMN author.second_name IS 'Segundo nombre del autor.';
COMMENT ON COLUMN author.first_lastname IS 'Primer apellido del autor.';
COMMENT ON COLUMN author.second_lastname IS 'Segundo apellido del autor.';
COMMENT ON COLUMN author.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN author.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN author.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN author.last_update_user IS '�ltimo usuario que lo modific�.';


/*
Descripci�n: Comentarios de la tabla 'EDITORIAL'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE editorial IS 'Esta tabla almacena los datos de las editoriales registradas en el sistema.';
COMMENT ON COLUMN editorial.id_editorial IS 'Id de la editorial.';
COMMENT ON COLUMN editorial.editorial IS 'Nombre de la editorial.';
COMMENT ON COLUMN editorial.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN editorial.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN editorial.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN editorial.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'Book'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE book IS 'Esta tabla almacena los libros registrados en el sistema.';
COMMENT ON COLUMN book.id_item IS 'Id del libro/objeto. Llave for�nea.';
COMMENT ON COLUMN book.isbn IS 'ISBN del libro.';
COMMENT ON COLUMN book.edition IS 'N�mero de edici�n dle libro.';
COMMENT ON COLUMN book.id_editorial IS 'ID de la editorial del libro. Llave for�nea.';
COMMENT ON COLUMN book.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN book.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN book.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN book.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'AUTHOR_FOR_BOOK'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE author_for_book IS 'Esta tabla almacena la relacion registrada en el sistema entre un libro y su autor.';
COMMENT ON COLUMN author_for_book.id_author IS 'Id del autor. Llave for�nea.';
COMMENT ON COLUMN author_for_book.id_book IS 'Id del libro. Llave for�nea.';
COMMENT ON COLUMN author_for_book.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN author_for_book.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN author_for_book.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN author_for_book.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'DEVELOPER'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE developer IS 'Esta tabla almacena la informacion de los desarrolladores registrados en el sistema.';
COMMENT ON COLUMN developer.id_developer IS 'Id del desarrollador.';
COMMENT ON COLUMN developer.developer IS 'Nombre del desarrollador.';
COMMENT ON COLUMN developer.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN developer.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN developer.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN developer.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'GAME'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE game IS 'Esta tabla almacena la informacion de los juegos registrados en el sistema.';
COMMENT ON COLUMN game.id_item IS 'Id del juego/objeto. Llave for�nea.';
COMMENT ON COLUMN game.date_game IS 'Fecha de lanzamiento del juego.';
COMMENT ON COLUMN game.id_developer IS 'Id del desarrollador del juego. Llave for�nea.';
COMMENT ON COLUMN game.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN game.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN game.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN game.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'MAGAZINE'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE magazine IS 'Esta tabla almacena la informacion de las revistas registradas en el sistema.';
COMMENT ON COLUMN magazine.id_item IS 'Id del la revista/objeto. Llave for�nea.';
COMMENT ON COLUMN magazine.date_magazine IS 'Fecha de publicacion de la revista.';
COMMENT ON COLUMN magazine.registry_number IS 'N�mero de registro de la revista';
COMMENT ON COLUMN magazine.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN magazine.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN magazine.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN magazine.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'MAGAZINE'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE film IS 'Esta tabla almacena la informacion de las peliculas registradas en el sistema.';
COMMENT ON COLUMN film.id_item IS 'Id de la pelicula. Llave for�nea.';
COMMENT ON COLUMN film.release_date IS 'Fecha de lanzamiento de la pel�cula.';
COMMENT ON COLUMN film.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN film.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN film.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN film.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'LOAN'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/

COMMENT ON TABLE loan IS 'Esta tabla almacena la informacion de los prestamos registrados en el sistema. ';
COMMENT ON COLUMN loan.id_loan IS 'Id del pr�stamo.';
COMMENT ON COLUMN loan.loan_date IS 'Fecha de inicio del pr�stamo.';
COMMENT ON COLUMN loan.repayment IS 'Fecha de final del pr�stamo.';
COMMENT ON COLUMN loan.id_item IS 'Id del objeto prestado. Llave for�nea.';
COMMENT ON COLUMN loan.id_person IS 'Id de la persona a la que se le presta. Llave for�nea.';
COMMENT ON COLUMN loan.creation_date IS 'Fecha que se cre�.';
COMMENT ON COLUMN loan.creation_user IS 'Usuario que lo cre�.';
COMMENT ON COLUMN loan.last_update_date IS '�ltima fecha que se mod�fic�.';
COMMENT ON COLUMN loan.last_update_user IS '�ltimo usuario que lo modific�.';

/*
Descripci�n: Comentarios de la tabla 'CURRENT_USER'.
Fecha Creaci�n: 18/05/2021
Autor Principal: Junior A. L�pez Aguirre.
*/
COMMENT ON TABLE current_user IS 'Esta tabla almacena la informacion de la sesion actual.';
COMMENT ON COLUMN current_user.id_current IS 'N�mero que identifica el id de sesion.';
COMMENT ON COLUMN current_user.id_user IS 'Id del usuario en la sesion actual. Llave for�nea.';
