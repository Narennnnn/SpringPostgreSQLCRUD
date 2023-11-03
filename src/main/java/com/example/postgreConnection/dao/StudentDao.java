package com.example.postgreConnection.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create the student table
    public void createTable() {
        String query = "CREATE TABLE student(id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, city VARCHAR(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println("Table created. Rows affected: " + update);
    }

    // Insert a new student
    public void insertStudent(String name, String city) {
        String query = "INSERT INTO student (name, city) VALUES (?, ?)";
        int update = this.jdbcTemplate.update(query, name, city);
        System.out.println("Student inserted. Rows affected: " + update);
    }

    // Update student details
    public void updateStudent(int id, String name, String city) {
        String query = "UPDATE student SET name = ?, city = ? WHERE id = ?";
        int update = this.jdbcTemplate.update(query, name, city, id);
        System.out.println("Student updated. Rows affected: " + update);
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        String query = "DELETE FROM student WHERE id = ?";
        int update = this.jdbcTemplate.update(query, id);
        System.out.println("Student deleted. Rows affected: " + update);
    }

}
