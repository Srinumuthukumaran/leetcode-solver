# Write your MySQL query statement below
SELECT id,
CASE 
    WHEN p_id IS NULL THEN 'Root'
    WHEN id IN (SELECT p_id FROM Tree) THEN 'Inner' 
    /*2 IN (2) --> id is present in p_id so,id is inner*/
    ELSE 'Leaf'
    /*3 IN (1) --> id is not present in p_id so,id is leaf*/
    END AS type
FROM Tree