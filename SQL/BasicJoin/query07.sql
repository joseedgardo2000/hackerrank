SELECT h.hacker_id, h.name, count(*) as numRetos
  FROM hackers h
  JOIN challenges c
    ON h.hacker_id = c.hacker_id
 GROUP BY h.hacker_id, h.name
       HAVING numRetos = (
                           SELECT COUNT(ci.challenge_id) as contadorI
                             FROM hackers hi
                             JOIN challenges ci
                               ON hi.hacker_id = ci.hacker_id
                            GROUP BY hi.hacker_id
                            ORDER BY contadorI DESC LIMIT 1
                         ) 
           OR numRetos NOT IN   (
                           SELECT COUNT(c2.challenge_id) 
                             FROM challenges c2 
                            GROUP BY c2.hacker_id 
                                  HAVING c2.hacker_id <> h.hacker_id
                    )
 ORDER BY numRetos DESC, h.hacker_id
   
;