DROP TABLE PUBLIC.orders IF EXISTS;
CREATE TABLE PUBLIC.orders  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    inventory_id BIGINT NOT NULL,
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
		foreign key (inventory_id) references PUBLIC.inventory (id);



INSERT INTO PUBLIC.inventory (id, amount, name) VALUES (1, 10, 'Computer');
INSERT INTO PUBLIC.orders (id, inventory_id, name) VALUES (1, 1, 'Computer for some user');