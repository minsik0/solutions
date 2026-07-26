SELECT id
FROM points
WHERE x = (SELECT max(x) FROM points)
   OR y = (SELECT max(y) FROM points)
ORDER BY id asc

--https://solvesql.com/problems/max-row/