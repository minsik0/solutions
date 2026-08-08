SELECT ROUND(
               SUM(CASE WHEN LOWER(credit) LIKE '%gift%' THEN 1 ELSE 0 END)
                   * 100.0 / COUNT(DISTINCT artwork_id), 3)
           AS ratio
FROM artworks;

--https://solvesql.com/problems/ratio-of-gifts/