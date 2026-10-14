(SELECT name AS RESULTS
FROM MovieRating JOIN Users using(user_id)
GROUP BY name
ORDER BY COUNT(*) DESC,name
LIMIT 1)

UNION ALL

(SELECT title AS RESULTS
FROM MovieRating JOIN Movies using(movie_id)
WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY title
ORDER BY AVG(rating) DESC,title
LIMIT 1);