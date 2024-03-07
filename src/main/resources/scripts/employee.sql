USE empdb;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20)
);

INSERT INTO empdb.employee (first_name, last_name, email, phone)
VALUES 
    ('Vinay', 'Kumar', 'vinay.123@example.com', '123-456-7890'),
    ('Hima', 'Bindhu', 'hima.456@example.com', '987-654-3210'),
    ('Yuva', 'Krishna', 'yuva.789@example.com', '555-123-4567');