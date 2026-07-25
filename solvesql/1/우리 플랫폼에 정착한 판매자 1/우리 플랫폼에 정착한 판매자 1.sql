SELECT seller_id, count(DISTINCT order_id) as orders
FROM olist_order_items_dataset
GROUP BY seller_id
HAVING orders >= 100

--https://solvesql.com/problems/settled-sellers-1/