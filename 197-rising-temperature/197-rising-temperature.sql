# # Write your MySQL query statement below
SELECT w1.id FROM Weather as w1 , Weather as w2
Where DATEDIFF(w1.Recorddate,w2.Recorddate) = 1 AND w1.temperature > w2.temperature ;
# SELECT * From Weather Order by recordDate;