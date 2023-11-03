package com.example.postgreConnection;

import com.example.postgreConnection.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgreConnectionApplication implements CommandLineRunner {
    @Autowired
	private StudentDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(PostgreConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.studentDao.createTable();
		this.studentDao.insertStudent("Harsh","Dehradun");
		this.studentDao.insertStudent("Yash Tyagi","Delhi");
		this.studentDao.insertStudent("Yanika","Bombay");
		this.studentDao.insertStudent("Harshit","Ayodhya");
		this.studentDao.insertStudent("Brian","Goa");
		this.studentDao.updateStudent(4,"Prerna","Almora");
		this.studentDao.deleteStudent(1);

	}
}
