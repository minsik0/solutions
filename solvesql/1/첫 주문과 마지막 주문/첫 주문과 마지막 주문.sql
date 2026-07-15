SELECT date(min(order_purchase_timestamp)) as first_order_date,
    date(max(order_purchase_timestamp)) as last_order_date
FROM olist_orders_dataset

--https://solvesql.com/problems/first-and-last-orders/