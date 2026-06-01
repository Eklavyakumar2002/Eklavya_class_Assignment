-- Create Database
create database company_db;
SET SQL_SAFE_UPDATES = 0;
-- Use Database
use company_db;

-- Create Employee Table
create table employee(
    emp_id int primary key,
    emp_name varchar(50),
    username varchar(50),
    password varchar(50),
    department varchar(50),
    salary int,
    created_date date
);

insert into employee values
(1,'Rahul Kumar','rahul123','rahul@123','Testing',35000,'2026-05-05'),
(2,'Priya Sharma','priya12','priya@123','Developer',50000,'2026-05-07'),
(3,'Aman Verma','aman45','aman@123','HR',30000,'2026-05-01'),
(4,'Sneha Singh','sneha99','sneha@123','Testing',40000,'2026-05-09'),
(5,'Rohit Yadav','rohit07','rohit@123','Developer',55000,'2026-05-10');


-- 1. Validate login using username and password


select * from employee
where username='rahul123'
and password='rahul@123';


-- 2. Fetch records created in last 7 days


select * from employee
where created_date >= curdate() - interval 7 day;


-- 3. Find total number of records grouped by department


select department, count(*) as total_employee
from employee
group by department;


-- 4. Update salary based on condition


update employee
set salary = salary + 5000
where department='Testing';

select * from employee;

show databases;
use company_db;
select * from employee;