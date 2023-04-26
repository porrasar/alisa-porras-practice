
use classicmodels;

SELECT    orderNumber, orderlinenumber,
quantityOrdered * priceEach
FROM    orderdetails
ORDER BY   quantityOrdered * priceEach DESC;


SELECT
orderNumber,
orderLineNumber,
quantityOrdered * priceEach AS subtotal
FROM    orderdetails
ORDER BY subtotal DESC;


SELECT     firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo;

SELECT    firstName, lastName, reportsTo
FROM    employees
ORDER BY reportsTo DESC;


SELECT 
    orderNumber, SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY orderNumber;

select * from orderdetails where orderNumber=10101;

SELECT 
    Month(orderDate) AS month3, COUNT(orderNumber)
FROM
    orders
WHERE year(orderDate)=2004
GROUP BY month3;
















