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

################### QUESTION 7

select film_id, title, rating
from film
where rating != "R";

################### QUESTION 8

select film_id, title, length
from film 
order by length asc 
limit 10;

################### QUESTION 9

select film_id, title, length
from film
where length = 185
order by length desc;

################### QUESTION 9

select film_id, title, special_features
from film
where special_features = "Deleted Scenes";

################### QUESTION 10

select last_name, count(last_name) as surname_total
from actor
group by last_name
having surname_total = 1
order by last_name desc;

################### QUESTION 11

select

