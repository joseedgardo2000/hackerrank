SELECT ROUND(principal.lat_n,4) mediana 
  FROM station principal 
 WHERE EXISTS 
         (SELECT COUNT(*) AS contador FROM station paridad HAVING MOD(contador,2)<>0) -- Si es impar el número de elementos
   AND
         (SELECT COUNT(lat_n) FROM station izquierda WHERE izquierda.lat_n < principal.lat_n ) -- Acercamiento por la IZQ
       = 
         (SELECT COUNT(lat_n) FROM station derecha   WHERE derecha.lat_n   > principal.LAT_N);  -- Acercamiento por la DER