SELECT r.customer_id
FROM rental as r
         JOIN customer as c on r.customer_id = c.customer_id
WHERE c.active = 1
GROUP BY r.customer_id
HAVING count(*) >= 35

--https://solvesql.com/problems/dvdrental-vip/