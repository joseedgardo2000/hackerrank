SELECT DISTINCT city 
  FROM station 
 WHERE 
       SUBSTR(city, 1, 1) IN ('A', 'E', 'I', 'O', 'U') 
   AND SUBSTR(city, LENGTH(city), 1) IN ('a', 'e', 'i', 'o', 'u');   