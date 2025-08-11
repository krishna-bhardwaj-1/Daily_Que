-- Last updated: 12/08/2025, 00:19:24
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary 
from employee
where salary not in(select max(salary)
from employee);
