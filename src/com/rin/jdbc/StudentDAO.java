package com.rin.jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	public void setDataSource(DataSource dataSource);
	public void create(String name,int age,int marks,int year);
	public Students getStudent(int id);
	public List<Students> listStudents();
	public void delete(int id);
	public void update(int id, String name, int age);
}
