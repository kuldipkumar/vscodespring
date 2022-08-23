CREATE TABLE Item (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(256),
    price NUMBER(5,2) NOT NULL,
    url VARCHAR(256),
    availability BOOLEAN NOT NULL
    PRIMARY KEY (id)
);

