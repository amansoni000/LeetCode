CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT DISTINCT E1.SALARY FROM EMPLOYEE E1 WHERE N-1 = (SELECT COUNT(DISTINCT(SALARY)) FROM EMPLOYEE E2 WHERE E2.SALARY > E1.SALARY)
      # Write your MySQL query statement below.
      
  );
END