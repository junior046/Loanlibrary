CREATE DATABASE  IF NOT EXISTS `loanbrary` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `loanbrary`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: loanbrary
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping events for database 'loanbrary'
--

--
-- Dumping routines for database 'loanbrary'
--
/*!50003 DROP PROCEDURE IF EXISTS `proc_author_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_author_add`(
	IN p_first_name VARCHAR(25),
    IN p_second_name VARCHAR(25),
    IN p_first_lastname VARCHAR(25),
    IN p_second_lastname VARCHAR(25)
)
BEGIN
	INSERT INTO author(first_name, second_name, first_lastname, second_lastname)
    VALUES (p_first_name, p_second_name, p_first_lastname, p_second_lastname);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_author_for_book_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_author_for_book_add`(
	IN p_author INT,
    IN p_book INT
)
BEGIN
	DECLARE checkidA INT;
    DECLARE checkidB INT;
    
    DECLARE idA_notFound CONDITION FOR SQLSTATE '22014';
    DECLARE idB_notFound CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idA_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE AUTOR REGISTRADO CON ESE ID') AS Message;
	END;
    
    DECLARE EXIT HANDLER FOR idB_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE LIBRO REGISTRADO CON ESE ID') AS Message;
	END;
        
    SELECT COUNT(*)
    INTO checkidA
    FROM author
    WHERE id_author = p_author;
    IF checkid = 0 THEN 
		SIGNAL idA_notFound;
	END IF;
    
    SELECT COUNT(*)
    INTO checkidB
    FROM book
    WHERE id_item = p_book;
    IF checkidB = 0 THEN 
		SIGNAL idB_notFound;
	END IF;	
    
    INSERT INTO author_for_book(id_author, id_book)
    VALUES (p_author, p_book);
    COMMIT;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_binnacle_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_binnacle_add`(
	IN p_id_user INT,       
    IN p_name_object VARCHAR(70),   
    IN p_table VARCHAR(50),
    IN p_date DATE,
    IN p_id_type  INT 
)
BEGIN
	DECLARE checkidU INT;
    DECLARE checkidT INT;
    
    DECLARE idU_notFound CONDITION FOR SQLSTATE '22014';
    DECLARE idT_notFound CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idU_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL USUARIO CON ESE ID.') AS Message;
	END;
    
    DECLARE EXIT HANDLER FOR idT_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL TIPO CON ESE ID.') AS Message;
	END;
    
    SELECT COUNT(*)
    INTO checkidU
    FROM user_person
    WHERE id_user = p_id_user;
    IF checkidU = 0 THEN 
		SIGNAL idU_notFound;
	END IF;	
    
    SELECT COUNT(*)
    INTO checkidT
    FROM type
    WHERE id_type = p_id_type;
    IF checkidT = 0 THEN 
		SIGNAL idT_notFound;
	END IF;	
    
    INSERT INTO binnacle(id_user, name_object, table_name, date_binnacle, id_type)
    VALUES (p_id_user, p_name_object, p_table, p_date, p_id_type);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_book_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_book_add`(
	IN p_id_item INT,
    IN p_isbn INT,
    IN p_edition INT,
    IN p_id_editorial INT
)
BEGIN
	DECLARE checkidI INT;
    DECLARE checkidE INT;
    
    DECLARE idI_notFound CONDITION FOR SQLSTATE '22014';
	DECLARE idE_notFound CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idI_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL OBJETO.') AS Message;
	END;
    
    DECLARE EXIT HANDLER FOR idE_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE LA EDITORIAL.') AS Message;
	END;
    
	SELECT COUNT(*)
    INTO checkidI
    FROM item
    WHERE id_item = p_id_item;
    IF checkid = 0 THEN 
		SIGNAL idI_notFound;
	END IF;
    
	SELECT COUNT(*)
    INTO checkidE
    FROM editorial
    WHERE id_editorial = p_id_editorial;
    IF checkid = 0 THEN 
		SIGNAL idE_notFound;
	END IF;
    
    INSERT INTO book(id_item, isbn, edition, id_editorial)
    VALUES(p_id_item, p_isbn, p_edition, p_id_editorial);
    COMMIT;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_category_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_category_add`(
	IN p_category VARCHAR(25),
	IN p_description VARCHAR(50)
)
BEGIN
	INSERT INTO category(category, description)
    VALUES (p_category, p_description);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_classification_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_classification_add`(
	IN p_classification VARCHAR(25),
    IN p_description VARCHAR(50)
)
BEGIN
	INSERT INTO classification(classification, description)
    VALUES (p_classification, p_description);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_developer_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_developer_add`(
	IN p_developer VARCHAR(30)
)
BEGIN
	INSERT INTO developer(developer)
    VALUES (p_developer);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_editorial_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_editorial_add`(
	IN p_editorial VARCHAR(30)
)
BEGIN
	INSERT INTO editorial(editorial)
    VALUES (p_editorial);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_email_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_email_add`(
	IN p_email VARCHAR(70),
    IN p_id_person INT
)
BEGIN
	DECLARE checkid INT;
    DECLARE checkemail INT;
    
    DECLARE idP_notFound CONDITION FOR SQLSTATE '22014';
    DECLARE idE_Found CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idP_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE PERSONA REGISTRADA CON ESE ID') AS Message;
	END;
    
    DECLARE EXIT HANDLER FOR idE_Found
    BEGIN
		ROLLBACK;
		SELECT CONCAT('EL EMAIL YA HA SIDO REGISTRADO') AS Message;
	END;
        
    SELECT COUNT(*)
    INTO checkid
    FROM person
    WHERE id_person = p_id_person;
    IF checkid = 0 THEN 
		SIGNAL idP_notFound;
	END IF;
    
    SELECT COUNT(*)
    INTO checkemail
    FROM email
    WHERE email = p_email;
    IF checkemail = 1 THEN 
		SIGNAL idE_Found;
	END IF;
    
    INSERT INTO email(email, id_person)
    VALUES (p_email, p_id_person);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_film_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_film_add`(
	IN p_id_item INT,
    IN p_date DATE
)
BEGIN
	DECLARE checkid INT;
    
    DECLARE idI_notFound CONDITION FOR SQLSTATE '22014';
    
    DECLARE EXIT HANDLER FOR idI_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL OBJETO CON ESE ID.') AS Message;
	END;
    
    SELECT COUNT(*)
    INTO checkid
    FROM item
    WHERE id_item = p_id_item;
    IF checkidI = 0 THEN 
		SIGNAL idI_notFound;
	END IF;	
    
    INSERT INTO film(id_item, release_date)
    VALUES (p_id_item, p_date);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_game_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_game_add`(
	IN p_id_item INT,
    IN p_date DATE, 
    IN p_developer INT
)
BEGIN
	DECLARE checkidI INT;
    DECLARE checkidD INT;
    
    DECLARE idI_notFound CONDITION FOR SQLSTATE '22014';
	DECLARE idD_notFound CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idI_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL OBJETO CON ESE ID.') AS Message;
	END;
    
	DECLARE EXIT HANDLER FOR idD_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL DESARROLLADOR CON ESE ID.') AS Message;
	END;
    
    SELECT COUNT(*)
    INTO checkidI
    FROM item
    WHERE id_item = p_id_idtem;
    IF checkidI = 0 THEN 
		SIGNAL idI_notFound;
	END IF;	
    
    SELECT COUNT(*)
    INTO checkidD
    FROM developer
    WHERE id_developer = p_developer;
    IF checkidD = 0 THEN 
		SIGNAL idD_notFound;
	END IF;	
    
    INSERT INTO game(id_item, date_game, id_developer)
    VALUES (p_id_item, p_date, p_developer);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_item_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_item_add`(
	IN p_item VARCHAR(30),
    IN p_description VARCHAR(50),
    IN p_available CHAR(1),
    IN p_id_user INT,
    IN p_id_classification INT
)
BEGIN
	DECLARE checkidU INT;
    DECLARE checkidC INT;
    
    DECLARE idU_notFound CONDITION FOR SQLSTATE '22014';
    DECLARE idC_notFound CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idU_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE TAL USUARIO.') AS Message;
	END;

    DECLARE EXIT HANDLER FOR idC_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE TAL CLASIFICACION.') AS Message;
	END;
    
	SELECT COUNT(*)
    INTO checkidU
    FROM user_person
    WHERE id_user = p_id_user;
    IF checkid = 0 THEN 
		SIGNAL idU_notFound;
	END IF;
    
	SELECT COUNT(*)
    INTO checkidC
    FROM classification
    WHERE id_classification = p_id_user;
    IF checkid = 0 THEN 
		SIGNAL idU_notFound;
	END IF;
    
    INSERT INTO item(item, description, available, id_user, id_classification)
    VALUES (p_item, p_description, p_available, p_id_user, p_id_classification);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_magazine_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_magazine_add`(
	IN p_id_item INT,
    IN p_date DATE,
    IN p_registry_num INT
)
BEGIN
	DECLARE checkid INT;
    
    DECLARE idI_notFound CONDITION FOR SQLSTATE '22014';
    
    DECLARE EXIT HANDLER FOR idI_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE EL OBJETO CON ESE ID.') AS Message;
	END;
    
    SELECT COUNT(*)
    INTO checkid
    FROM item
    WHERE id_item = p_id_idtem;
    IF checkid = 0 THEN 
		SIGNAL idI_notFound;
	END IF;	
    
    INSERT INTO magazine(id_item, date_magazine, registry_number)
    VALUES (p_id_item, p_date, p_registry_num);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_parameter_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_parameter_add`(
	IN p_value INT,
    IN p_parameter VARCHAR(50)
)
BEGIN
	INSERT INTO parameter(value, parameter)
    VALUES (p_value, p_parameter);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_person_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_person_add`(
    IN p_identification_card INT,                     
    IN p_first_name      VARCHAR(25),                         
    IN p_second_name     VARCHAR(25),                         
    IN p_first_lastname     VARCHAR(25),                
    IN p_second_lastname    VARCHAR(25)                      
)
BEGIN
	DECLARE checkid INT;
    
    DECLARE idP_Found CONDITION FOR SQLSTATE '22014';
    
    DECLARE EXIT HANDLER FOR idP_Found
    BEGIN
		ROLLBACK;
		SELECT CONCAT('YA EXISTE UNA PERSONA CON ESE NUMERO DE IDENTIFICACION.') AS Message;
	END;
    
	SELECT COUNT(*)
    INTO checkid
    FROM person
    WHERE identification_card = p_identification_card;
    IF checkid = 0 THEN 
		SIGNAL idP_Found;
	END IF;
	
	INSERT INTO person(identification_card, first_name, second_name, first_lastname, second_lastname) VALUES (p_identification_card, p_first_name, p_second_name,p_first_lastname, p_second_lastname);    
    COMMIT;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_phone_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_phone_add`(
	IN p_phone INT,
    IN p_id_person INT
)
BEGIN
	DECLARE checkid INT;
    DECLARE checkphone INT;
    
    DECLARE idP_notFound CONDITION FOR SQLSTATE '22014';
    DECLARE idPH_Found CONDITION FOR SQLSTATE '22015';
    
    DECLARE EXIT HANDLER FOR idP_notFound
    BEGIN
		ROLLBACK;
		SELECT CONCAT('NO EXISTE PERSONA REGISTRADA CON ESE ID') AS Message;
	END;
    
    DECLARE EXIT HANDLER FOR idPH_Found
    BEGIN
		ROLLBACK;
		SELECT CONCAT('EL NUMERO DE TELEFONO YA HA SIDO REGISTRADO') AS Message;
	END;
        
    SELECT COUNT(*)
    INTO checkid
    FROM person
    WHERE id_person = p_id_person;
    IF checkid = 0 THEN 
		SIGNAL idP_notFound;
	END IF;
    
    SELECT COUNT(*)
    INTO checkphone
    FROM phone
    WHERE phone_number = p_phone;
    IF checkphone = p_phone THEN 
		SIGNAL idPH_Found;
	END IF;
    
    INSERT INTO phone(phone_number, id_person)
    VALUES (p_phone, p_id_person);
    COMMIT;	

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_type_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_type_add`(
	IN p_type VARCHAR(20)
)
BEGIN
	INSERT INTO type(type)
    VALUES (p_type);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `proc_user_add` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_user_add`(
	IN p_user VARCHAR(15),
    IN p_password VARCHAR(12),
    IN p_id_person INT,
    IN p_admin_user CHAR(1)
)
BEGIN
	DECLARE checkid INT;
    
    DECLARE idP_Found CONDITION FOR SQLSTATE '22014';
    
    DECLARE EXIT HANDLER FOR idP_Found
    BEGIN
		ROLLBACK;
		SELECT CONCAT('YA EXISTE UN USUARIO PARA ESTA PERSONA.') AS Message;
	END;
    
	SELECT COUNT(*)
    INTO checkid
    FROM user_person
    WHERE id_person = p_id_person;
    IF checkid = 0 THEN 
		SIGNAL idP_Found;
	END IF;
    
    INSERT INTO user_person(user_person, password, id_person, administrator_user)
    VALUES (p_user, p_password, p_id_person, p_admin_user);
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 20:10:07
