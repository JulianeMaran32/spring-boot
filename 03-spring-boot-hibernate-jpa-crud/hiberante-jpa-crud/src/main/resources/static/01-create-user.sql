-- Drop user first if they exist 
DROP USER IF EXISTS 'springstudent'@'localhost';

-- DROP USER IF EXISTS 'name database'@'localhost';

-- Now create user with prop privileges 
CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';

-- CREATE USER 'user id'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'localhost';

-- GRANT ALL PRIVILEGES ON * . * TO 'name database'@'localhost';