SELECT *
FROM tips
WHERE total_bill > (
    SELECT avg(total_bill)
    FROM tips
)

--https://solvesql.com/problems/find-tables-with-high-bill/