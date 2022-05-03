CREATE TABLE entregas(
    id      	        BIGINT              NOT NULL AUTO_INCREMENT,
    cliente_id	        BIGINT              NOT NULL,
    taxa   		        DECIMAL(10, 2)      NOT NULL,
    situacao 	        VARCHAR(20)         NOT NULL,
    data_pedido	        DATETIME            NOT NULL,
    data_finalizacao    DATETIME,
    
    destinatario_nome			VARCHAR(255) NOT NULL,
    destinatario_logradouro 	VARCHAR(255) NOT NULL,
    destinatario_numero			VARCHAR(255) NOT NULL,
    destinatario_complemento	VARCHAR(255) NOT NULL,
    destinatario_bairro			VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(id)
);

ALTER TABLE entregas ADD CONSTRAINT fk_entrega_cliente
FOREIGN KEY (cliente_id) references clientes(id);