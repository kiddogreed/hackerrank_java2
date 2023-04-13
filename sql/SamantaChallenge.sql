-- Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, but did not realize her keyboard's  key was broken until after completing the calculation. She wants your help finding the difference between her miscalculation (using salaries with any zeros removed), and the actual average salary.

-- Write a query calculating the amount of error (i.e.:  average monthly salaries), and round it up to the next integer.

-- first solution
SELECT CEIL(AVG(SALARY) - AVG(REPLACE(SALARY, '0', '')))
FROM EMPLOYEES;


--different approach
---------------------------------------
---------------------------------------
SELECT 
CONVERT(INT,CEILING(AVG(CONVERT(FLOAT,SALARY))-
AVG(CONVERT(FLOAT,REPLACE(SALARY,0,'')))))
AS SALARY 
FROM EMPLOYEES;

---------------------------------------
---------------------------------------
--correct approach
SELECT 
CAST(CEILING(AVG(CAST(SALARY AS FLOAT)) - 
AVG(CAST(REPLACE(SALARY,'0','') AS FLOAT))) AS INT) 
AS SALARY
FROM EMPLOYEES
---------------------------------------
---------------------------------------