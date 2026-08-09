SELECT a.id, a.name, group_concat(r.medal) as medals
FROM records as r
         JOIN athletes as a on r.athlete_id = a.id
         JOIN teams as t on r.team_id = t.id
         JOIN events as e on r.event_id = e.id
         JOIN games as g on r.game_id = g.id
WHERE e.event = 'Volleyball Women''s Volleyball'
  AND t.team = 'KOR'
  AND g.year <= 2016
  AND r.medal IS NOT NULL
GROUP BY a.id

--https://solvesql.com/problems/volleyball-players-with-medals/
