-- Database export via SQLPro (https://www.sqlprostudio.com/)
-- Exported by coasterleung at 27-02-2024 00:23.
-- WARNING: This file may contain descructive statements such as DROPs.
-- Please ensure that you are running the script at the proper location.


-- BEGIN TABLE book
DROP TABLE IF EXISTS book;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `intro` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserting 1 row into book
-- Insert batch #1
INSERT INTO book (id, name, author, intro) VALUES
(1, 'high speed train', '', '');

-- END TABLE book

