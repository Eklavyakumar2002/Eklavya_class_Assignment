show databases;
drop database eklavya;
Create database Employees_DB;
select database();
use Employees_DB;

Create table employees(
emp_id INT primary key,
emp_name varchar(80),
department varchar(100),
salary decimal(10,2),
email varchar(200),
joining_date DATE
);

SET SQL_SAFE_UPDATES = 0;

insert into Employees(emp_id,emp_name,department,salary,email,joining_date)
values
(101,'eklavya', 'IT',60000, 'eklavya@gmail.com','2026-05-11'),
(102, 'Sonu', 'IT', 60000, 'ek.corptrainer@gmail.com', '2026-06-22'),
(103, 'aaryan', 'IT', 60000, 'gk.corptrainer@gmail.com', '2026-06-22'),
(104, 'kumar', 'IT', 60000, 'raj.corptrainer@gmail.com', '2026-06-22'),
(105, 'gautam', 'IT', 60000, 'gkk.corptrainer@gmail.com', '2026-06-22');

DELETE FROM employees WHERE emp_id = 101;

select * from employees;

select * from employees where department='IT';
Create table employee(
emp_id INT primary key,
emp_name varchar(80),
department varchar(100),
salary decimal(10,2),
email varchar(200),
joining_date DATE
);


insert into emp2(emp_id,emp_name,department,salary,email,joining_date)
values
(101,'eklavya', 'IT',55000, 'eklavya@gmail.com','2026-05-11'),
(102, 'Sonu', 'HR', 45000, 'ek.corptrainer@gmail.com', '2026-06-22'),
(103, 'aaryan', 'SALES', 55000, 'gk.corptrainer@gmail.com', '2026-06-22'),
(104, 'kumar', 'MANAGER', 40000, 'raj.corptrainer@gmail.com', '2026-06-22'),
(105, 'gautam', 'TESTING', 55000, 'gkk.corptrainer@gmail.com', '2026-06-22'),
(106, 'Riya', 'HR', 45000, 'gkk.corptrainer@gmail.com', '2026-07-15');

select * from emp2;
show databases;
use emp2;
select * from emp2 where department='IT';

select * from emp2 
order by salary desc;
create database emp2;
update emp2
set salary=65000 where department='Testing';

delete from emp2
where emp_id=102;

select * from emp2 
order by salary desc limit 2;

select count(*) from emp2;

select AVG(salary) AS average_salary 
FROM emp2;

select MAX(salary) AS highest, MIN(salary) AS lowest 
from employees;

select department, count(*) from emp2
group by department;

SELECT * FROM emp2 
WHERE email IS NULL;

SELECT * FROM emp2 
WHERE emp_name LIKE 'R%';

SELECT * FROM Emp2 
WHERE salary BETWEEN 40000 AND 60000;

SELECT * FROM Emp2 
WHERE department IN ('HR', 'IT');

ALTER TABLE Emp2 
ADD COLUMN mobile_number VARCHAR(15);

ALTER TABLE Emp2 
CHANGE COLUMN emp_name employee_name VARCHAR(80);

ALTER TABLE Emp2
DROP COLUMN mobile_number;