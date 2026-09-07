# Write your MySQL query statement below
SELECT u.name,coalesce(SUM(R.distance),0) as travelled_distance
FROM Users u
LEFT JOIN Rides R ON u.id = R.user_id
GROUP BY u.id,u.name
ORDER BY travelled_distance DESC,u.name ASC;
