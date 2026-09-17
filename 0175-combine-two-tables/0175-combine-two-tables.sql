# Write your MySQL query statement below
SELECT  Person.firstName , Person.lastName, Address.city , Address.state
From Person
Left join Address
On Person.personId = Address.personId ;