CREATE TABLE occurrences (
  Id int(11) NOT NULL AUTO_INCREMENT,
  CustomerId varchar(5) NOT NULL,
  CustomerName varchar(100) NOT NULL,
  CustomerEmail varchar(50) NOT NULL,
  Debit double NOT NULL,
  PRIMARY KEY (Id)
);

INSERT INTO occurrences (CustomerId, CustomerName, CustomerEmail,Debit) VALUES 
  ('A9999', 'Bob','bob@gmail.com',9000),
  ('A8888', 'Meg','meg@gmail.com',8000),
  ('A7777', 'Bill','bill@gmail.com',7000),
  ('A6666', 'joe','joe@gmail.com',6000);
  
