SELECT CEILING(AVG(salary - REPLACE(salary, '0', '')))  FROM employees;