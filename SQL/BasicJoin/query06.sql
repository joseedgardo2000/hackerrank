SELECT w.id, wp.age, w.coins_needed, w.power 
  FROM wands w
  JOIN wands_property wp
    ON w.code = wp.code
 WHERE wp.is_evil = 0
   AND w.coins_needed = (
                            SELECT MIN(coins_needed)
                              FROM wands wi
                              JOIN wands_property wpi
                                ON wi.code = wpi.code
                             WHERE w.code = wi.code
                               AND wp.age = wpi.age
                               AND w.power = wi.power
                        )
 ORDER BY w.power DESC, age DESC
 

  ;