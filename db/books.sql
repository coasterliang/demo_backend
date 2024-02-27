-- Database export via SQLPro (https://www.sqlprostudio.com/)
-- Exported by coasterleung at 27-02-2024 13:43.
-- WARNING: This file may contain descructive statements such as DROPs.
-- Please ensure that you are running the script at the proper location.


-- BEGIN TABLE book
DROP TABLE IF EXISTS book;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL DEFAULT '',
  `intro` varchar(1000) NOT NULL DEFAULT '',
  `pub_year` int NOT NULL DEFAULT '0',
  `isbn` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Inserting 2 rows into book
-- Insert batch #1
INSERT INTO book (id, name, author, intro, pub_year, isbn) VALUES
(2, 'test123', '', '', 0, ''),
(6, '略略略', '空气', '弄哭', 2012, '空桶');

-- END TABLE book

