DELIMITER $$
DROP PROCEDURE IF EXISTS p_insert_into_size;
CREATE PROCEDURE p_insert_into_size()
BEGIN
	DECLARE running INT DEFAULT 1;
    DECLARE max_size_val INT DEFAULT 10;
    DECLARE size_name VARCHAR(50);
    DECLARE is_female BIT(1);
    
    DELETE FROM T12_SIZE;
    
    WHILE running <= max_size_val DO
        SET is_female := running <= 5;
        SET size_name := elt(if(is_female, running, running - 5), 'S', 'M', 'L', 'XL', 'XXL');
		INSERT INTO T12_SIZE(C12_SIZE_ID, C12_SIZE_NAME, C12_GENDER, C12_SIZE_DESC)
		VALUES(
			running, 
            size_name, 
            if(is_female, 0, 1),
            concat("Size '", size_name  ,"' cho ", if(is_female, 'Nữ', "Nam")));
		SET running := running + 1;    
    END WHILE;
    
END $$