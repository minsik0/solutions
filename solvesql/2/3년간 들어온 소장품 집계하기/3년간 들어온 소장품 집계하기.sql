SELECT classification,
       count(case when acquisition_date like '2014%' then artwork_id end) as '2014',
    count(case when acquisition_date like '2015%' then artwork_id end) as '2015',
    count(case when acquisition_date like '2016%' then artwork_id end) as '2016'
FROM artworks
GROUP BY classification
ORDER BY classification asc

--https://solvesql.com/problems/summary-of-artworks-in-3-years/