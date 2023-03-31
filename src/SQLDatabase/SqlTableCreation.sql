use netbeansapp;

CREATE TABLE Users (
  userId INT NOT NULL AUTO_INCREMENT,
  firstName VARCHAR(50) NOT NULL,
  lastName VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(30) NOT NULL,
  phoneNumber VARCHAR(20) NOT NULL,
  birthdate DATE NOT NULL,
  gender VARCHAR(10),
  addressDetails VARCHAR(255) NOT NULL,
  city VARCHAR(50) NOT NULL,
  county VARCHAR(50) NOT NULL,
  PRIMARY KEY (userId)
);

CREATE TABLE Professors (
  userId INT NOT NULL,
  hireDate DATE NOT NULL,
  PRIMARY KEY (userId),
  FOREIGN KEY (userId) REFERENCES Users(userId)
);


CREATE TABLE Classes (
  classId INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  classMasterId INT,
  PRIMARY KEY (classId),
  FOREIGN KEY (classMasterId) REFERENCES Users(userId)
);

CREATE TABLE Students (
  userId INT NOT NULL,
  classId INT NOT NULL,
  matriculationNumber VARCHAR(50) NOT NULL,
  parentFirstName VARCHAR(50) NOT NULL,
  parentLastName VARCHAR(50) NOT NULL,
  parentPhoneNumber VARCHAR(20),
  parentEmail VARCHAR(255),
  PRIMARY KEY (userId),
  FOREIGN KEY (userId) REFERENCES Users(userId),
  FOREIGN KEY (classId) REFERENCES Classes(classId)
);

CREATE TABLE Subjects (
  subjectId INT NOT NULL AUTO_INCREMENT,
  subjectName VARCHAR(50) NOT NULL,
  PRIMARY KEY (subjectId)
);

CREATE TABLE ProfessorSubjects (
  userId INT NOT NULL,
  subjectId INT NOT NULL,
  PRIMARY KEY (userId, subjectId),
  FOREIGN KEY (userId) REFERENCES Users(userId),
  FOREIGN KEY (subjectId) REFERENCES Subjects(subjectId)
);

CREATE TABLE Courses (
  courseId INT NOT NULL AUTO_INCREMENT,
  starting_time_hour INT NOT NULL,
  starting_time_minute INT NOT NULL,
  subjectId INT NOT NULL,
  classId INT NOT NULL,
  professorId INT NOT NULL,
  day VARCHAR(20) NOT NULL,
  PRIMARY KEY (courseId),
  FOREIGN KEY (classId) REFERENCES Classes(classId),
  FOREIGN KEY (professorId) REFERENCES Users(userId),
  FOREIGN KEY (subjectId) REFERENCES Subjects(subjectId)
);

CREATE TABLE Grades (
  gradeId INT NOT NULL AUTO_INCREMENT,
  studentId INT NOT NULL,
  subjectId INT NOT NULL,
  grade DECIMAL(3,2) NOT NULL,
  PRIMARY KEY (gradeId),
  FOREIGN KEY (studentId) REFERENCES Users(userId),
  FOREIGN KEY (subjectId) REFERENCES Subjects(subjectId)
);

CREATE TABLE StudentAbsences (
  id INT NOT NULL AUTO_INCREMENT,
  studentId INT NOT NULL,
  subjectId INT NOT NULL,
  absence_date DATE NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (studentId) REFERENCES Users(userId),
  FOREIGN KEY (subjectId) REFERENCES Subjects(subjectId)
);

-- Inserts for Users table
INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Alexandru', 'Popescu', 'alexandru.popescu@example.com', 'parola123', '+40723123456', '1994-06-23', 'M', 'Str. Zorilor nr. 5', 'Cluj-Napoca', 'Cluj');

INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Andreea', 'Ionescu', 'andreea.ionescu@example.com', 'parola456', '+40723567890', '1998-02-17', 'F', 'Bd. Unirii nr. 10', 'Bucuresti', 'Ilfov');

INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Cristina', 'Dumitrescu', 'cristina.dumitrescu@example.com', 'parola789', '+40725901234', '1996-09-10', 'F', 'Str. Mihai Viteazu nr. 15', 'Brasov', 'Brasov');

INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Adrian', 'Gheorghe', 'adrian.gheorghe@example.com', 'parolaabc', '+40727345678', '1993-12-25', 'M', 'Str. Prunului nr. 7', 'Timisoara', 'Timis');

INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Elena', 'Radu', 'elena.radu@example.com', 'paroladef', '+40729789012', '1995-11-05', 'F', 'Bd. Stefan cel Mare nr. 20', 'Iasi', 'Iasi');
INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES ('Elena', 'Radu', 'test@test.com', '123456', '+40729789012', '1995-11-05', 'F', 'Bd. Stefan cel Mare nr. 20', 'Iasi', 'Iasi');

INSERT INTO Users (firstName, lastName, email, password, phoneNumber, birthdate, gender, addressDetails, city, county)
VALUES
('Ana', 'Popescu', 'ana.popescu@example.com', 'password123', '+40721234567', '1995-06-15', 'F', 'Strada Florilor 14', 'Bucuresti', 'Ilfov'),
('Andrei', 'Ionescu', 'andrei.ionescu@example.com', 'password456', '+40723456789', '1998-09-22', 'M', 'Bulevardul Victoriei 23', 'Cluj-Napoca', 'Cluj'),
('Maria', 'Dumitrescu', 'maria.dumitrescu@example.com', 'password789', '+40725678901', '1997-12-10', 'F', 'Aleea Rozelor 7', 'Timisoara', 'Timis'),
('Ioan', 'Gheorghe', 'ioan.gheorghe@example.com', 'passwordabc', '+40727890123', '1996-03-29', 'M', 'Strada Mugurilor 9', 'Iasi', 'Iasi'),
('Mirela', 'Radu', 'mirela.radu@example.com', 'passworddef', '+40729012345', '1999-11-05', 'F', 'Bulevardul Dacia 15', 'Constanta', 'Constanta');


-- Inserts for Professors table
INSERT INTO Professors (userId, hireDate)
VALUES (6, '2015-01-01');

INSERT INTO Professors (userId, hireDate)
VALUES (7, '2016-02-01');

INSERT INTO Professors (userId, hireDate)
VALUES (8, '2010-06-01');

INSERT INTO Professors (userId, hireDate)
VALUES (9, '2020-03-01');

INSERT INTO Professors (userId, hireDate)
VALUES (10, '2012-12-01');


-- Inserts for Classes table
INSERT INTO Classes (name, classMasterId)
VALUES ('1A', 6);

INSERT INTO Classes (name, classMasterId)
VALUES ('2B', 7);

INSERT INTO Classes (name, classMasterId)
VALUES ('3C', 8);

INSERT INTO Classes (name, classMasterId)
VALUES ('9D', 9);

INSERT INTO Classes (name, classMasterId)
VALUES ('12A', 10);

-- Inserts for Students table
INSERT INTO Students (userId, classId, matriculationNumber, parentFirstName, parentLastName, parentPhoneNumber, parentEmail) 
VALUES (1, 1, '1234', 'John', 'Doe', '555-1234', 'john.doe@example.com');

INSERT INTO Students (userId, classId, matriculationNumber, parentFirstName, parentLastName, parentPhoneNumber, parentEmail) 
VALUES (2, 1, '5678', 'Jane', 'Smith', '555-5678', 'jane.smith@example.com');

INSERT INTO Students (userId, classId, matriculationNumber, parentFirstName, parentLastName, parentPhoneNumber, parentEmail) 
VALUES (3, 2, '9012', 'Robert', 'Johnson', '555-9012', 'robert.johnson@example.com');

INSERT INTO Students (userId, classId, matriculationNumber, parentFirstName, parentLastName, parentPhoneNumber, parentEmail) 
VALUES (4, 2, '3456', 'Emily', 'Davis', '555-3456', 'emily.davis@example.com');

INSERT INTO Students (userId, classId, matriculationNumber, parentFirstName, parentLastName, parentPhoneNumber, parentEmail) 
VALUES (5, 3, '7890', 'David', 'Garcia', '555-7890', 'david.garcia@example.com');

-- Inserts for Subjects table
INSERT INTO Subjects (subjectName)
VALUES
  ('Mathematics'),
  ('English'),
  ('Science'),
  ('Social Studies'),
  ('Art');
  
-- Inserts for ProfessorSubjects table
INSERT INTO ProfessorSubjects (userId, subjectId) VALUES
(10, 1),
(6, 2),
(7, 3),
(8, 4),
(9, 5);

-- Inserts for Courses table
INSERT INTO Courses (starting_time_hour, starting_time_minute, subjectId, classId, professorId, day) VALUES 
(9, 0, 1, 1, 10, 'Monday'),
(11, 30, 2, 2, 6, 'Tuesday'),
(13, 0, 3, 3, 7, 'Wednesday'),
(15, 30, 1, 4, 10, 'Thursday'),
(17, 0, 2, 5, 6, 'Friday');

-- Inserts for Grades table
INSERT INTO Grades (studentId, subjectId, grade) VALUES
(1, 1, 7.5),
(1, 2, 8.2),
(2, 3, 6.9),
(2, 4, 9.1),
(3, 2, 7.8),
(3, 4, 8.5),
(4, 1, 6.7),
(4, 3, 7.1),
(5, 1, 8.9),
(5, 3, 9.3);

-- Inserts for StudentAbsences table
INSERT INTO StudentAbsences (studentId, subjectId, absence_date)
VALUES 
(1, 2, '2022-01-10'),
(1, 4, '2022-02-22'),
(2, 1, '2022-01-15'),
(2, 3, '2022-03-01'),
(3, 2, '2022-02-10'),
(3, 5, '2022-03-10'),
(4, 1, '2022-02-15'),
(4, 3, '2022-03-08'),
(5, 4, '2022-02-28'),
(5, 5, '2022-03-15');

DROP TABLE IF EXISTS StudentAbsences, Grades, Courses, ProfessorSubjects, Subjects, Students, Classes, Professors, Users;