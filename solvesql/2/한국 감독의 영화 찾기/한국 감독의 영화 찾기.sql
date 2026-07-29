SELECT c.name as artist, a.title
FROM artworks a
         JOIN artworks_artists b on a.artwork_id = b.artwork_id
         JOIN artists c on b.artist_id = c.artist_id
WHERE a.classification LIKE 'Film%' and c.nationality = 'Korean'

--https://solvesql.com/problems/find-movies-by-korean-artists/
