# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE P1 FROM PERSON P1, Person P2
WHERE
P1.Email = P2.Email AND P1.id > P2.id;