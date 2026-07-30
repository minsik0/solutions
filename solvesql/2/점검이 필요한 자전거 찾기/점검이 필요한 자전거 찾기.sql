SELECT bike_id
FROM rental_history
WHERE rent_at >= '2021-01-01' and rent_at < '2021-02-01'
GROUP BY bike_id
HAVING sum(distance) >= 50000

--https://solvesql.com/problems/inspection-needed-bike/