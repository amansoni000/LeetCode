SELECT user_id, max(time_stamp) as last_stamp From Logins 
Where time_stamp >= '2020-01-01 00:00:00' And time_stamp <= '2020-12-31 23:59:59' Group By user_id;