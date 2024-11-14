
use hotel_reservation;

create table Customers(customer_id int primary key auto_increment,
						first_name varchar(100),
                        last_name varchar(100),
                        email varchar(500) unique,
                        phone_number char(12),
                        address varchar(500)
                        );

create table Rooms(room_id int primary key auto_increment,
					room_type varchar(100),
                    price_per_night int,
                    room_status varchar(100),
                    floor_number int
				);
                
create table Reservations(reservation_id int primary key auto_increment,
						customer_id int,
                        room_id int,
                        reservation_date date,
                        check_in_date date,
                        check_out_date date,
                        room_status varchar(200),
                        foreign key(customer_id) references Customers(customer_id),
                        foreign key(room_id) references Rooms(room_id)
							);
                            
create table Payments(payment_id int primary key auto_increment,
					reservation_id int,
                    payment_date date,
                    amount_paid int,
                    payment_method varchar(200),
                    foreign key(reservation_id) references Reservations(reservation_id)
					);
                    
create table Staff(staff_id int primary key auto_increment,
					first_name varchar(200),
                    last_name varchar(200),
                    s_role varchar(200),
                    hire_date date
					);
                    
create table Room_Assignment(assignment_id int primary key auto_increment,
							staff_id int,
                            room_id int,
                            assignment_date date,
                            task_description varchar(200),
                            foreign key(staff_id)references Staff(staff_id),
                            foreign key(room_id) references Rooms(room_id)
							);
                            
insert into Customers(first_name,last_name,email,phone_number,address) values("Aswin","Gopala","aswingopa@gmail.com",'6235798088',"aswin villa"),
																			("Ms","Dhoni","msd07@gmail.com",'6235778088',"ranchi"),
                                                                            ("virat","kohli","virat18@gmail.com",'9067798088',"delhi"),
                                                                            ("Rishabh","pant","rishabh@gmail.com",'8765498088',"pant villa"),
                                                                            ("Sanju","Samson","sanju@gmail.com",'9076543278',"Trivandrum");
															
select * from Customers;

insert into Rooms(room_type,price_per_night,room_status,floor_number) values("single",3000,"available",5),
																			("double",6000,"available",8),
                                                                            ("single",3000,"occupied",6),
                                                                            ("suite",9000,"occupied",5),
                                                                            ("double",6000,"under maintenance",7);
			select * from Rooms;
            use hotel_reservation;
            
            #1
            select * from Rooms where room_status="available" and floor_number=8;
            
            #2
            select c.first_name,c.last_name,c.email,r.reservation_id,r.check_in_date,r.check_out_date from customers c
            inner join reservations r on c.customer_id=r.customer_id order by r.check_in_date;
            
            #3
            select c.customer_id,c.first_name,c.last_name, DATEDIFF(r.check_out_date,r.check_in_date)
            from Reservations r inner join Customers c on r.customer_id=c.customer_id 
            where DATEDIFF(r.check_out_date,r.check_in_date)>5;
            
            
            #4 
            select reservation_id, SUM(amount_paid)  from Payments group by reservation_id;
            
            #5
            select room_type ,AVG(price_per_night) as avg_price from Rooms group by room_type;
            
            #6
            select SUM(amount_paid) as total_revenue from payments where 
            payment_date >= date_sub(CURDATE(), INTERVAL 1 MONTH);
            
            #7
            select s.staff_id,s.first_name,s.last_name,COUNT(a.assignment_id) as assignment_count from Staff s inner join Room_Assignment a on s.staff_id = a.staff_id
            where a.assignment_date >=DATE_SUB(curdate(),interval 1 month) group by s.staff_id;
            
            #8
            Select c.customer_id,c.first_name,r.reservation_date from Customers c
            inner join Reservations r on c.customer_id=r.customer_id
            where r.reservation_date=(select max(reservation_date) from Reservations
            where customer_id=c.customer_id) order by c.customer_id;
            
            select * from payments;
            
            
            #9
            delete from reservations where reservation_id=4;
            

                        