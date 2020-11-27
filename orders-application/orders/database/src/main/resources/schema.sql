DROP TABLE PUBLIC.orders IF EXISTS;
CREATE TABLE PUBLIC.orders  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    inventoryId BIGINT NOT NULL,
    name VARCHAR(64)
);

DROP TABLE PUBLIC.inventory IF EXISTS;
CREATE TABLE PUBLIC.inventory  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    amount BIGINT NOT NULL,
    name VARCHAR(32)
);

alter table PUBLIC.orders
	add constraint ORDERS_INVENTORY_ID_FK
		foreign key (inventoryId) references PUBLIC.inventory (id);



INSERT INTO PUBLIC.inventory (id, amount, name) VALUES (1, 10, 'Computer');
INSERT INTO PUBLIC.orders (id, inventoryId, name) VALUES (1, 1, 'Computer for some user');