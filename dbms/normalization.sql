SELECT * FROM c2514_db.customers;
use c2514_db;
#Convert the following table into 1NF:
      #- Table: Orders
         #- Columns: `OrderID`, `CustomerName`, `ProductNames` (where `ProductNames` might contain multiple product names separated by commas)

create table Customer(customer_id int primary key AUTO_INCREMENT,
						Customer_name VARCHAR(100) NOT NULL,
                        Product_name varchar(300) not null
					);
INSERT INTO Customer (Customer_name, Product_name)
VALUES ('Anandu', 'Apple, Orange, Eggs'),
		('Ashik', 'Banana, Grape');

select * from Customer;

CREATE TABLE Orderss (
    customer_id int,
    Customer_name varchar(50),
    foreign key(customer_id)references Customer(customer_id)
);

insert into Orderss values(1,"Anandu"),
							(2,"Ashik");
                            
select * from Orderss;

create table product(
				customer_id int,
                product_name varchar(200),
                foreign key(customer_id) references Customer(customer_id)
                );
insert into product values(1,"Apple"),
							(1,"Orange"),(1,"Eggs"),
                            (2,"Banana"),(2,"Grape");
                            
select * from product;

#----------------------------------------------------------#

#Normalize the following table to 2NF:
      #- Table: Student_Courses
         #- Columns: `StudentID`, `StudentName`, `CourseID`, `CourseName`, `InstructorID`, `InstructorName`
         
CREATE TABLE Student_Courses (
    Student_id INT,
    Student_name VARCHAR(500),
    Course_id INT,
    Course_name VARCHAR(500),
    Instructor_id INT,
    Instructor_name VARCHAR(500)
);

INSERT INTO Student_Courses (Student_id, Student_name, Course_id, Course_name, Instructor_id, Instructor_name) VALUES
(1, 'Edwin', 101, 'Information technology', 1, 'Dr.Deepthi'),
(2, 'Paul', 102, 'Computer Science', 2, 'Rejin');

select * from student_Courses;

#Student table
create table Students(
					Student_id int primary key,
                    Student_name varchar(500)
				);
		
insert into Students values(1,"Edwin"),(2,"Paul");

select * from Students;

#Course table
create table Course(
					Course_id int primary key,
                    Course_name varchar(200),
                    Instructor_id int
				);
                
insert into Course values(101,'Information Technology',1),
							(102,'Computer Science',2);
	
    select * from Course;

#Instructor table
create table Instructor(
						Instructor_id int primary key,
                        Instructor_name varchar(100)
					);
                    
insert into Instructor values(1,'Dr Deepthhi'),
                    (2,'Rejin');
                    
select * from Instructor;


#enrollement table
create table Enrollment(
						Student_id int,
                        Course_id int,
                        foreign key(Student_id) references Students(Student_id),
                        foreign key(Course_id) references Course(Course_id)
						);
                        
insert into Enrollment values(1,101),(2,102);

select * from Enrollment;

#-----------------------------------------------------------------------------#


#3. Normalize the following table to 3NF:
      #- Table: Sales
         #- Columns: `SalesID`, `ProductID`, `ProductName`, `CategoryID`, `CategoryName`, `SaleDate`


CREATE TABLE Sales (
    Sales_id INT PRIMARY KEY,
    Product_id INT,
    Product_name VARCHAR(50),
    Category_id INT,
    Category_name VARCHAR(50),
    Sale_date DATE
);

Insert into Sales values(1,001,"Milk",101,"Food",'2024-09-11'),
					(2,002,"Cake",102,"Food",'2024-09-14');
                    
select * from Sales;

create table sales_3nf(
					Sales_id int,
                    Product_id int,
                    Sales_date date,
                    foreign key(Product_id)references productts(Product_id)
                    );
                    
		insert into sales_3nf values(1,001,'2024-09-11'),
									(2,002,'2024-09-14');
        
        
        
        
create table productts(
					Product_id int primary key,
                    Product_name varchar(200),
                    Category_id int,
                     foreign key(Category_id)references category(Category_id)
				);
               
               insert into productts values(001,"Milk",101),(002,"Cake",102);
        
        select * from productts;
                
create table category(
					Category_id int primary key,
                    Category_name varchar(100)
					);
                    
                    insert into category values(101,"Food"),(102,"Food");
                    
			select * from category;
            
#----------------------------------------------------------------------------------------------------------#

#Write an SQL statement to create a table in 1NF with the following information:
      #- Columns: `BookID`, `Title`, `Authors` (where each book can have multiple authors).
      
	CREATE TABLE Books (
    BookID INT primary key,
    Title VARCHAR(100),
    Author VARCHAR(50),
    PRIMARY KEY (BookID, Author)
);
insert into Books values(001,"The hobbit","Agatha,Rowling,Mark"),(002,"Romeo and juilet","Hitler,William,Dan");

select * from Books;

create table Books_1nf(tittle varchar(100),Author varchar(100));

insert into Books_1nf values("The hobbit","Agatha"),("The hobbit","Rowling"),("The hobbit","Mark"),
					("Romeo and juilet","Hitler"),("Romeo and juilet","William"),("Romeo and juilet","Dan");
                    
select * from Books_1nf;

#---------------------------------------------------------------------------------------------------------------#

#Given a 2NF table with columns `OrderID`, `ProductID`, `ProductName`, and `SupplierName`, write the SQL commands to normalize this table to 3NF.

create table orderCUS(order_id int primary key,
						product_id int
                        );

insert into orderCUS values(001,101),(002,102),(003,103);
          select * from orderCus;              
                        
create table productCUS(product_id int primary key,
						product_name varchar(50),
                        supplier_name varchar(50));
     
     drop table productCUS;
     insert into productCUS values(101,"Car","Sarathi"),(102,"bike","sarathi"),(103,"bus","Shuklas");
          
          select * from productCUS;
          
          
create table Supplier(supplier_id int,
						supplie_name varchar(100));
                        
		insert into Supplier values(201,"Sarathi"),(202,"sarathi"),(203,"shukla");
        
        select * from Supplier;