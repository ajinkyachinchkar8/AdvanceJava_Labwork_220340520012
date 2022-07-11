use ajinkya;
create table tbl_customer(
 name varchar(40),
 email varchar(30),
 mobileno long,
 username varchar(20), 
 password varchar(20)
 );
 drop table tbl_customer;
 select * from tbl_customer;
 truncate table tbl_customer;
 
 insert into tbl_customer values ("Ajinkya", "ajinkya@gmail.com",456,"Avc",123);
 
 select count(*) from tbl_customer where email = "ajinkya@gmail.com";
 
 
 create table tbl_customer2(
 name varchar(40),
 email varchar(30),
 mobileno long,
 username varchar(20), 
 password varchar(20)
 );
 
  select * from tbl_customer2;
  
  create table Emp3(
  empid integer,
  empname varchar(20)
  );
  
   select * from Emp3;
   insert into Emp3 values(4,"Abc"),(7,"xyz");
   
   

  select * from tbl_emp;
 drop table tbl_emp;
    truncate table tbl_emp;
    select e.* from tbl_emp e;
    
    
    select * from tbl_cust;
	select * from tbl_addr;
    drop table  tbl_cust;
     
  select * from tbl_cust where email like '%gmail%';
   select * from tbl_cust where email like '%outlook%';

select name,city from tbl_cust,tbl_addr
where city='Mumbai';

create table temp2(
 empno int primary key auto_increment,
 name varchar(20),
 salary double
 );
 
 insert into temp2(name,salary) values ("Ajinkya",200000),("Arun",30000);

 select * from temp2;
 
 select * from tbl_person;
 select * from tbl_passport;
 
 drop table tbl_person;
 truncate table tbl_person;
  drop table tbl_passport;

 