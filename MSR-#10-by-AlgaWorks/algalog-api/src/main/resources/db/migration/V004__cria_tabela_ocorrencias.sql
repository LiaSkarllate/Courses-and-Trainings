USE algalog;

CREATE TABLE ocorrencias (
    id              BIGINT NOT NULL AUTO_INCREMENT,
    entrega_id      BIGINT NOT NULL,
    descricao       TEXT NOT NULL,
    data_ocorrencia DATETIME NOT NULL,

    PRIMARY KEY(id)
);

ALTER TABLE ocorrencias ADD CONSTRAINT fk_ocorrencia_entrega
FOREIGN KEY (entrega_id) references entregas(id);