use library_management;

create table Books(
	book_id int primary key auto_increment,
    tittle varchar(500),
    author_id int,
    publication_year year,
    price decimal(10,2),
    foreign key(author_id) references Authors(author_id)
);

create  table Authors(
	author_id int primary key auto_increment,
    first_name varchar(300),
    last_name varchar(300)
);

create table Borrowers(
	borrower_id int primary key auto_increment,
    first_name varchar(300),
    last_name varchar(300),
    email varchar(600) unique,
    dob date
);

create table Loans(
	loan_id int primary key auto_increment,
    loan_date date,
    return_date date,
    borrower_id int,
    book_id int,
    foreign key(borrower_id) references Borrowers(borrower_id),
    foreign key(book_id) references Books(book_id)
);

insert into Authors values(001,"John","Grisham"),
							(002,"Roald","Dahl"),
                            (003,"Ralph","Wald"),
                            (004,"Arundhathi","Roy"),
                            (005,"Vikram","Seth");
					
insert into Books values(101,"Adventure in wonderland",001,2002,200.00),
						(102,"Wuthering heights",002,2001,400.00),
                        (103,"Pride and Prejudice",003,2005,10.00),
                        (104,"Moby Dick",004,2006,100.00),
                        (105,"Wuthering heights",005,2008,40.00);
                        
insert into Borrowers values(201,"Anandu","Raj","ananduraj@gamil.com",'2024-02-10'),
							(202,"Aswin","G","aswing@gamil.com",'2024-07-01'),
                            (203,"Rivin","Jude","rivin@gamil.com",'2023-01-06'),
                            (204,"Hisham","Thaju","hisham@gamil.com",'2023-09-08'),
                            (205,"Amal","CK","amalck@gamil.com",'2024-05-01');
                            
update Borrowers set dob='1990-05-09' where borrower_id=202;
update Borrowers set dob='1998-06-16' where borrower_id=201;
update Borrowers set dob='2000-05-09' where borrower_id=203;
update Borrowers set dob='2001-07-22' where borrower_id=204;
update Borrowers set dob='1994-06-08' where borrower_id=205;

insert into Loans values(301,'2024-02-16','2024-03-18',202,101),
						(302,'2024-03-22','2024-05-16',201,102),
                        (303,'2024-02-16','2024-03-18',203,103),
                        (304,'2023-12-25','2024-03-09',204,104),
                        (305,'2022-02-27','2023-01-05',205,105);
                        

update Books set tittle="The great gatsby" where book_id=102;


select * from Books;

select tittle,price,publication_year from Books where price>20;

select first_name,last_name,email from Borrowers where borrower_id in(select borrower_id from Loans where loan_date>'2024-01-01');

update Books set price=25 where tittle="The great gatsby";

delete from Loans where book_id=104;
delete from Books where tittle="Moby Dick" ;

alter table Books add genre varchar(200);

select count(borrower_id) from Borrowers;

select sum(price) from Books;

select avg(price ) from Books;

select * from Books where book_id in
				(select book_id from Loans where borrower_id in
															(select borrower_id from borrowers
                                                            where timestampdiff(year,dob,CURDATE()) >30));





							




