CREATE TABLE IF NOT EXISTS client (
	id INTEGER NOT NULL PRIMARY KEY,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20),
	patronymic VARCHAR (20),
	phone_number VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS mechanic (
	id INTEGER NOT NULL PRIMARY KEY,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20),
	patronymic VARCHAR (20),
	hourly_rate DECIMAL
);

CREATE TABLE IF NOT EXISTS 'order' (
	id INTEGER NOT NULL PRIMARY KEY,
	description VARCHAR(255) NOT NULL,
	client_id INTEGER,
	mechanic_id INTEGER NOT NULL,
	creation_date TIMESTAMP NOT NULL,
	completion_date TIMESTAMP,
	cost DECIMAL,
	status VARCHAR(20) NOT NULL
);