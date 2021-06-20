create
    definer = root@localhost procedure Insert_Customer(IN first_name varchar(255), IN last_name varchar(255))
BEGIN
    INSERT INTO customers(firstName,lastName) VALUES (first_name,last_name);
END;
CALL Insert_Customer(?,?);
