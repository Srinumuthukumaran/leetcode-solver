# Write your MySQL query statement below
SELECT score,DENSE_RANK() OVER(ORDER BY score DESC) AS 'rank'
/*DENSE_RANK -->1,2,3 || RANK() --> 1,1,3,4,5,5,7 */
FROM Scores
ORDER BY score DESC;