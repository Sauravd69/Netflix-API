--DROP TABLE IF EXISTS movies;
 
CREATE TABLE IF NOT EXISTS movies (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  type VARCHAR(50) NOT NULL,
  genre VARCHAR(50) NOT NULL,
  publish_year INT NOT NULL,
  rating DOUBLE NOT NULL
);
 
--INSERT INTO movies (name, type, genre, publish_year, rating) VALUES
--  ('Dont Look Up', 'Movie', 'Sci-Fi', 2021, 4.50);