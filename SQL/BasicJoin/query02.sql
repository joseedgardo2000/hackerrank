SELECT city.name
  FROM country
 INNER JOIN city
    ON country.code = city.countrycode
 WHERE continent = 'Africa';