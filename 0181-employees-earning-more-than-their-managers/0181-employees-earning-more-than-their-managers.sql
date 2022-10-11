# Write your MySQL query statement below
SELECT E1.name as Employee From Employee As E1, Employee As E2 WHERE E1.salary > E2.salary And E1.managerId = E2.id;