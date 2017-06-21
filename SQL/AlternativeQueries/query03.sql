SELECT LISTAGG(campo, '&') WITHIN GROUP (ORDER BY campo) 
  FROM 
        (SELECT level AS campo
           FROM DUAL 
        CONNECT BY level < 1000)  primerset
 WHERE campo > 1
   AND NOT EXISTS (
                   SELECT NULL 
                     FROM (SELECT level AS multiplo
                             FROM DUAL
                          CONNECT BY level < 100) 
                    WHERE multiplo > 1 
                      AND campo <> multiplo
                      AND MOD(campo, multiplo) = 0
                  );  