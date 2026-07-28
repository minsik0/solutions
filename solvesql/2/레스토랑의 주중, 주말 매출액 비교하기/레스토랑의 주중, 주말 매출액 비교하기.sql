SELECT
    CASE
        WHEN day in('Sat', 'Sun') THEN 'weekend'
ELSE 'weekday'
END as week,
sum(total_bill) as sales
FROM tips
GROUP BY week
ORDER BY sales desc

--https://solvesql.com/problems/revenue-weekday-weekend/