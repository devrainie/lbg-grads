################## QUESTION 1

select first_name, last_name
from actor;

################## QUESTION 2

select first_name, last_name
from actor
where first_name = "John";

################### QUESTION 3

select first_name, last_name 
from actor
where last_name = "Neeson";

################### QUESTION 4

select actor_id, first_name, last_name
from actor
where mod(actor_id, 10) = 0;

################### QUESTION 5

select film_id, title, description
from film
where film_id = 100;
#Description is "A Beautiful Drama of a Dentist And a Composer who must Battle a Sumo Wrestler in The First Manned Space Station"

################### QUESTION 6

select film_id, title, rating
from film
where rating = "R";





