create table IF NOT EXISTS OWNER(
	codOwner INT IDENTITY,
	nombreDueño varchar(25),
	dni varchar(25),
	PRIMARY KEY (codOwner)
);

create table IF NOT EXISTS PET(
	nombreMascota varchar(25),
	identificadorChip varchar(25),
	codOwner INT,
	PRIMARY KEY (nombreMascota),
	FOREIGN KEY (codOwner) REFERENCES OWNER(codOwner)
);