    # Write your MySQL query statement below
SELECT person_name FROM(
    SELECT *,SUM(weight) OVER(ORDER BY turn) AS run_weight 
    FROM Queue
    ) q
    WHERE run_weight <=1000
    ORDER BY run_weight DESC
    LIMIT 1;