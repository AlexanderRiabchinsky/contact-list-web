CREATE SCHEMA IF NOT EXISTS contacts_schema;

CREATE TABLE IF NOT EXISTS contacts_schema.contact
(
    id BIGINT PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL
)