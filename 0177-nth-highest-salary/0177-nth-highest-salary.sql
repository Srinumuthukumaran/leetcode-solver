CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1; 
/*-->300,200,100 --> N=2(2nd high salary) --> skip 300 --> 2-1=1 -->skip 1st element 300 */
  RETURN (
        SELECT DISTINCT(salary)
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET N   /* LIMIT 1 -->1 VALUE --> OFFSET (Values to skip)*/
  );
END