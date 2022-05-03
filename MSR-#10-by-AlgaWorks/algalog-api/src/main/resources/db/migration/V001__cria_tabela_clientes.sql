USE algalog;

CREATE TABLE clientes (
    id      BIGINT NOT NULL AUTO_INCREMENT,
    name    VARCHAR(255) NOT NULL,
    phone   VARCHAR(255) NOT NULL,
    email   VARCHAR(255) NOT NULL,

    PRIMARY KEY(id)
)