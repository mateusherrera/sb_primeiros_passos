CREATE TABLE produto (
    id              VARCHAR(255)        NOT NULL        PRIMARY KEY,
    nome            VARCHAR(50)         NOT NULL,
    descricao       TEXT,
    preco           DECIMAL(18, 2)
);