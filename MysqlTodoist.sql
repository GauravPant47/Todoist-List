create database Todoist;

USE Todoist;

CREATE Table Todoist(
    task_number int AUTO_INCREMENT PRIMARY KEY,
    task_tital VARCHAR(100) NOT NULL,
    add_Task VARCHAR(1000) NOT NULL,
    status VARCHAR(100) NOT NULL
);

SELECT * FROM Todoist;