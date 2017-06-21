SELECT RPAD('*', contador*2, ' *') 
  FROM (
         SELECT level AS contador 
           FROM DUAL
        CONNECT BY LEVEL <= 20
       ) ORDER BY 1 DESC
;
 