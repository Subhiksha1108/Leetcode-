# Write your MySQL query statement below
# Write your MySQL query statement below

# Write your MySQL query statement below
select name as Employee 
from Employee e
where salary >(select salary from Employee e2 where e.managerId=e2.id)