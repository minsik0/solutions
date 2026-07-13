SELECT quartet,
       round(avg(x), 2) as x_mean,
       round(var_samp(x), 2) as x_var,
       round(avg(y), 2) as y_mean,
       round(var_samp(y), 2) as y_var
FROM points
GROUP BY quartet

--https://solvesql.com/problems/group-by/