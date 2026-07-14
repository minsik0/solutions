SELECT local, COUNT(station_id) as num_stations
FROM station
GROUP BY local
ORDER BY num_stations asc

--https://solvesql.com/problems/count-stations/