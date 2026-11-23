# Write your MySQL query statement below
SELECT product_id,'store1' AS store,store1 AS price 
/*'store1' fills column with store1*/   /*store1 answer --> 0-95,1-70 */
FROM Products
WHERE store1 IS NOT NULL

UNION

SELECT product_id,'store2' AS store,store2 AS price
/*'store2' fills column with store2*/  /*store2 answer --> 0-100,1 ignores cause NULL */
FROM Products
WHERE store2 IS NOT NULL

UNION

SELECT product_id,'store3' AS store,store3 AS price
/*'store3' fills column with store3*/  /*store3 answer --> 0-105,1-80 */
FROM Products
WHERE store3 IS NOT NULL

/*Finally it performs UNION then all are combines*/