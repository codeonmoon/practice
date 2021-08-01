DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  age INT NULL

);

INSERT INTO student (name, email, age) VALUES
  ('Krishna', 'Krishna@world.com', 15)
