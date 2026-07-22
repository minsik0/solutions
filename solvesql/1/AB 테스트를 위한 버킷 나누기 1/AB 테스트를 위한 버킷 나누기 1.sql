SELECT DISTINCT customer_id,
                CASE
                    WHEN MOD(customer_id, 10) = 0 THEN 'A'
                    ELSE 'B'
                    END AS bucket
FROM transactions
ORDER BY customer_id ASC;

--https://solvesql.com/problems/ab-testing-buckets-1/