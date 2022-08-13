# Write your MySQL query statement below
SELECT 
date_id, make_name, count(DISTINCt(lead_id)) AS unique_leads, count(Distinct(partner_id)) AS unique_partners
FROM DailySales Group By date_id, make_name;