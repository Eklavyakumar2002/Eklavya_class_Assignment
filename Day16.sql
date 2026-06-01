show databases;
create database Assignment;
use Assignment;

create table users(
    user_id INT,
    username VARCHAR(50),
    email VARCHAR(100),
    status VARCHAR(20),
    last_login DATE
);

INSERT INTO users VALUES 
(1, 'Raju', 'ak@test.com', 'ACTIVE', NULL),
(2, 'Saloni', 'bob@test.com', 'ACTIVE', '2025-01-01'),
(3, 'Jitu', '67e@test.com', 'INACTIVE', NULL);

select username, email 
from users 
where status = 'ACTIVE' 
and last_login IS NULL;

select * from users;

-- question 2

create table customers (
    customer_id INT,
    customer_name VARCHAR(100)
);

create table orders (
    order_id INT,
    customer_id INT,
    order_amount DECIMAL(10, 2)
);

insert into  customers values 
(1, 'Acme Corp'), 
(2, 'Stark Ind');
insert into orders values
(101, 1, 20000), 
(102, 1, 35000), 
(103, 2, 10000);                









-- question no 3
create table employees(
emp_id int  primary key,
name varchar(60),
dept varchar(40),
salary decimal(8,2));

insert into employees values
(1, 'aryan', 'IT', 50000), 
(2, 'gautam', 'HR', 60000), 
(3, 'eklavya', 'IT', 90000), 
(4, 'Smith', 'Sales', 85000), 
(5, 'Leesa', 'IT', 88000);

select * from employees;
select name, salary  from employees
where salary > (select avg(salary) from employees)
order by salary desc limit 3;


-- question 4
create table employee(
    emp_id INT,
    name VARCHAR(100),
    department VARCHAR(50),
    joining_date DATE
);

insert into employee values
(1, 'A', 'IT', '2024-01-01'), 
(2, 'B', 'IT', '2024-01-02'), 
(3, 'c', 'IT', '2024-01-05'), 
(4, 'D', 'HR', '2024-01-01'), 
(5, 'E', 'HR', '2024-01-02');

select dept, COUNT(*) AS employee_count from employees
group by dept
having count(*) >= 3;

-- question 5
CREATE TABLE customer(
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100)
);

CREATE TABLE orderss(
    order_id INT,
    customer_id INT,
    order_amount DECIMAL(10, 2)
);

INSERT INTO customers VALUES (1, 'Alice'), 
(2, 'Bob');
INSERT INTO orders VALUES (101, 1, 100),
 (102, 2, 200),
 (103, 99, 150), 
 (104, NULL, 50);
 
SELECT order_id 
FROM orderss
WHERE customer_id NOT IN (
    SELECT customer_id FROM customers
)
AND customer_id IS NOT NULL;

-- question 6
CREATE TABLE employ (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    joining_date DATE
);

INSERT INTO employ VALUES 
(1, 'Alice', '2023-12-31'), 
(2, 'Bob', '2024-01-15'),  
(3, 'Charlie', '2024-06-20'),
(4, 'David', '2024-11-01'), 
(5, 'Eve', '2024-03-10'), 
(6, 'Frank', '2024-09-05'),
(7, 'Grace', '2024-05-15');

SELECT emp_id, name, joining_date 
FROM employ
WHERE YEAR(joining_date) = 2024
ORDER BY joining_date DESC
LIMIT 5;


-- question 6

CREATE TABLE user (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO users VALUES 
(1, 'ek', 'alice@test.com'),
(2, 'fk', 'bob@test.com'),
(3, 'dk', 'alice@test.com'),
(4, 'gk', 'david@test.com'),
(5, 'ak', 'alice@test.com');

SELECT email, COUNT(*) as count
FROM users
GROUP BY email
HAVING COUNT(*) > 1;