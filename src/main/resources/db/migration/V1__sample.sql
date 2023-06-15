CREATE TABLE sample (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255),
   created_at TIMESTAMP,
   updated_at TIMESTAMP,
   CONSTRAINT pk_sample PRIMARY KEY (id)
);