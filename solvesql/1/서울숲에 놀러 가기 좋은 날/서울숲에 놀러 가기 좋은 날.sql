SELECT measured_at as good_day
FROM measurements
WHERE measured_at like '2022-12%' and pm2_5 <= 9
ORDER BY measured_at asc

--https://solvesql.com/problems/good-days-for-a-seoulforest-picnic/