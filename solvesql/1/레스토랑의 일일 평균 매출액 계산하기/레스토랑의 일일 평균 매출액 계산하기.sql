SELECT round(sum(total_bill) / count(DISTINCT day), 2) as avg_sales
FROM tips

--https://solvesql.com/problems/sales-summary/