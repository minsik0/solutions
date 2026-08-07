SELECT *
FROM tips
WHERE (day, total_bill) in(
    SELECT day, max(total_bill)
FROM tips
GROUP BY day
    )

--https://solvesql.com/problems/restaurant-vip/
