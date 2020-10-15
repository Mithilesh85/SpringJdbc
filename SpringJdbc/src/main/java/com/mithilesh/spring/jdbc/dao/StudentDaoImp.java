package com.mithilesh.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mithilesh.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		
//		String query="insert into student(id,name,city)values(?,?,?)";
		int r = this.jdbcTemplate.update("insert into student(id,name,city)values(student.getId(),student.getName(),student.getCity())");
		
		return r;
	}
	
	
	public int change(Student student) {
		//updating the data
		
		String query="update student set name=?, city=? where id=? ";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return r;
	}
	
	public int delete(int studentId) {
		// delete
		
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		
		return r;
	}

	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	

	
}
