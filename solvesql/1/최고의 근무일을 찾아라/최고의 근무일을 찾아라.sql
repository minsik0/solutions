SELECT day, round(sum(tip), 2) as tip_daily
FROM tips
GROUP BY day
ORDER BY tip_daily desc
LIMIT 1;

--https://solvesql.com/problems/best-working-day/
