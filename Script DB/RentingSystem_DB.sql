#create the database

DROP database rentingsystem;
CREATE database RentingSystem;

USE RentingSystem;

#Admin Login Table creation
CREATE TABLE ADMIN_LOGIN (
    adminID varchar(50) PRIMARY KEY,
    adminPassword varchar(50) NOT NULL CHECK (adminPassword <> '')
	);

#insert admins manually
INSERT INTO ADMIN_LOGIN (adminID, adminPassword)
VALUES ("A12", "psw12");

INSERT INTO ADMIN_LOGIN (adminID, adminPassword)
VALUES ("A13", "psw13");

#DELETE FROM ADMIN_LOGIN where adminID = "A12";
#DELETE FROM ADMIN_LOGIN where adminID = "A13";

#Customers Information Table creation
CREATE table CUSTOMERS (
	custID varchar(50),
    custName varchar(50) NOT NULL CHECK (custName <> ''),
    custEmail varchar(50) NOT NULL CHECK (custEmail <> ''),
    custPhoneNo varchar(50) NOT NULL CHECK (custPhoneNo <> ''),
    PRIMARY KEY (custID)
    );

#CustomerLogin table creation
CREATE TABLE CUSTOMER_LOGIN (
	custID varchar(50)  PRIMARY KEY,
    custPassword varchar(50) NOT NULL CHECK (custPassword <> '')
    );

#Add Foreign Key Now to Customer login table on custID
ALTER TABLE `rentingsystem`.`customer_login` 
ADD CONSTRAINT `custID_FK_LOGIN`
  FOREIGN KEY (`custID`)
  REFERENCES `rentingsystem`.`customers` (`custID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

    
#Item table creation
CREATE TABLE ITEM_INVENTORY (
	itemID varchar(50) PRIMARY KEY,
    itemName varchar(100) NOT NULL CHECK (itemName <> ''),
    itemType varchar(5) NOT NULL CHECK (itemType <> ''),
    itemBrand varchar(100) NOT NULL CHECK (itemBrand <> ''),
    itemModel varchar(100) NULL CHECK (itemModel <> ''),
    itemPrice double NOT NULL
);

#Rent Table creation
CREATE TABLE RENT (
	rentID varchar(50) PRIMARY KEY NOT NULL,
    itemID varchar(50) NOT NULL,
    custID varchar(50) NOT NULL,
    rentTime Time NOT NULL,
    rentDate Date NOT NULL,
    returnDate Date NOT NULL, check (returnDate>rentDate),
    hasExceeded bool NOT NULL
);

#Add foreign key constraint to ItemID
ALTER TABLE `rentingsystem`.`rent` 
ADD INDEX `itemID_FK_RENT_idx` (`itemID` ASC) VISIBLE;
;
ALTER TABLE `rentingsystem`.`rent` 
ADD CONSTRAINT `itemID_FK_RENT`
  FOREIGN KEY (`itemID`)
  REFERENCES `rentingsystem`.`item_inventory` (`itemID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

#Add foreign key constraint to custID
ALTER TABLE `rentingsystem`.`rent` 
ADD INDEX `custID_FK_RENT_idx` (`custID` ASC) VISIBLE;
;
ALTER TABLE `rentingsystem`.`rent` 
ADD CONSTRAINT `custID_FK_RENT`
  FOREIGN KEY (`custID`)
  REFERENCES `rentingsystem`.`customers` (`custID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;


#Fine Table creation
CREATE TABLE FINE (
rentID varchar(50) PRIMARY KEY,
fineAmount double NOT NULL,
hasPaid bool NOT NULL
);

ALTER TABLE `rentingsystem`.`fine` 
ADD INDEX `rentID_FK_FINE_idx` (`rentID` ASC) VISIBLE;
;
ALTER TABLE `rentingsystem`.`fine` 
ADD CONSTRAINT `rentID_FK_FINE`
  FOREIGN KEY (`rentID`)
  REFERENCES `rentingsystem`.`rent` (`rentID`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

#INSERT INTO `rentingsystem`.`item_inventory` (`itemID`, `itemName`, `itemType`, `itemBrand`, `itemModel`, `itemPrice`) VALUES ('it1', 'Samsung Galaxy S20+ Ultra', 'cp1', 'Samsung', 'SM98', '1199.99');
#INSERT INTO `rentingsystem`.`item_inventory` (`itemID`, `itemName`, `itemType`, `itemBrand`, `itemModel`, `itemPrice`) VALUES ('it2', 'Iphone 11 pro max', 'cp1', 'Iphone', 'ID923', '1299.99');
#INSERT INTO `rentingsystem`.`rent` (`rentID`, `itemID`, `custID`, `rentTime`, `rentDate`, `returnDate`, `hasExceeded`) VALUES ('re1', 'it1', '4046', '15:50:00', '2017-06-15', '2017-06-18', '0');