SELECT year(purchased_at) as year, sum(total_price - discount_amount) as net_sales
FROM transactions
WHERE is_returned = 0
GROUP BY year
ORDER BY year asc

--https://solvesql.com/problems/yearly-net-sales/