# Write your MySQL query statement below
Select T.email As Email From Person T Group By Email having count(Email) > 1; 