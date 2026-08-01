SELECT name
FROM companies
WHERE company_id in (
    SELECT publisher_id
    FROM games
    GROUP BY publisher_id
    HAVING count(distinct game_id) >= 10
)

--https://solvesql.com/problems/publisher-with-many-games/