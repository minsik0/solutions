SELECT day, sum(total_bill) as revenue_daily
FROM tips
GROUP BY day
HAVING sum(total_bill) >= 1000
ORDER BY revenue_daily desc

--https://solvesql.com/problems/daily-revenue/