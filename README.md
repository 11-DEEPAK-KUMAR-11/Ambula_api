# Ambula_api
### A spring boot project using Gradle User Location Problem  

#### with the following requirements

1. There is 2 users (ADMIN, READER).
2. ADMIN can perform CRUDE operations like POST, DELETE, PATCH, etc.
3. READER can perform only GET operation.
4. Created a REST API called create_data which creates a table in the database with the
name 'user_location'.
5. user_location will have three fields NAME, Latitude, and Longitude.
6. user can update the user_location table using another REST API called update_data
7. READER can call the get_users/N which returns the nearest N users from the location
(0,0).

E.g GET http://base_url/get_users/5 will return the nearest 5 users from (0,0);
created 3 rest API-
a) create_data
b) update_data
c) get_users/N

Note: Used HSQL in-memory database for the database work.This code is be able
to create a table with no manual script required.
