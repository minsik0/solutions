SELECT customer_id
FROM records
WHERE order_date >= '2020-12-01' and order_date < '2021-01-01'
GROUP BY customer_id
HAVING sum(sales) >= 1000


--https://solvesql.com/problems/whales-of-december/