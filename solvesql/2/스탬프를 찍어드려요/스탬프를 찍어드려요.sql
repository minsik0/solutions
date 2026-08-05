SELECT (
           CASE
               WHEN total_bill >= 25 THEN 2
               WHEN total_bill >= 15 THEN 1
               ELSE 0
               END
           ) as 'stamp',
    count(*) as 'count_bill'
FROM tips
GROUP BY stamp
ORDER BY stamp asc

--https://solvesql.com/problems/count-stamps/