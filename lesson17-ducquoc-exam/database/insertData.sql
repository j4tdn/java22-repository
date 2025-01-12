USE test_database;
INSERT INTO class (name , teacher)
VALUES("12A","Ho Cong Trung"),
	("12B","Quang Tu Anh"),
    ("12C","Nguyen Van Tam");
INSERT INTO studens(name, gender,class_id)
VALUES("Dinh Thi Ngoc", "Female",2),
		("Nguyen Thanh Hung", "Male",1),
        ("Tran Mai Hoa ", "Female",2),
        ("Doan Quang Vinh", "Male",1),
        ("Cao Anh Dao", "Female",3),
        ("Tran Kim Tuyen", "Male",3);
INSERT INTO Result(studen_id,subject,score)
VALUES (1,"Math",8),
		(2,"Literature",7.5),
        (4,"Math",6.8),
        (3,"History",9.5),
        (5,"Literature",4.9),
        (6,"History",8.2),
        (3,"Math",9.8),
        (4,"Literature",7.2),
        (5,"History",8.8);
        

        
        
        
        