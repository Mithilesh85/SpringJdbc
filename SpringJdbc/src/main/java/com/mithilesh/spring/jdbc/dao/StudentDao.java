package com.mithilesh.spring.jdbc.dao;

import com.mithilesh.spring.jdbc.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
}
