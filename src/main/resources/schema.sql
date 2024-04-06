-- Usunięcie tabel, jeśli istnieją
DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS post;

-- Tworzenie tabel post i comment
CREATE TABLE post (
   id BIGINT PRIMARY KEY AUTO_INCREMENT,
   title VARCHAR(400) NOT NULL,
   content VARCHAR(2000),
   created TIMESTAMP
);

CREATE TABLE comment (
   id BIGINT PRIMARY KEY AUTO_INCREMENT,
   post_id BIGINT NOT NULL,
   content VARCHAR(2000) NULL,
   created TIMESTAMP,
   FOREIGN KEY (post_id) REFERENCES post(id)
);



