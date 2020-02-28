package com.rin.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Students getStudent(int id) {
		String sql = "select * from Student, Marks where Student.id=Marks.sid and id = ?";
		Students students = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
		return students;
	}

	@Override
	public List<Students> listStudents() {
		String sql = "select * from Student, Marks where Student.id=Marks.sid";
		List<Students> students = jdbcTemplate.query(sql, new StudentMapper());
		return students;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from Student where id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("删除的ID = " + id );
	    return;
	}

	@Override
	public void update(int id, String name, int age) {
		String sql = "update Student set name=?,age=? where id =?;";
		jdbcTemplate.update(sql,name,age,id);
		System.out.println("更新的ID = " + id );
		return;
	}


	@Override
	public void create(String name, int age, int marks, int year) {
		try {
			String sql1 = "insert into Student(name,age) values(?,?);";
			jdbcTemplate.update(sql1,name,age);
			String sql2 = "select max(id) from Student;";
			int sid = jdbcTemplate.queryForObject(sql2, Integer.class);
			String  sql3 = "insert into Marks(sid,marks,year) values(?,?,?);";
			jdbcTemplate.update(sql3,sid,marks,year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			throw new RuntimeException("模拟错误。");
		} catch (Exception e) {
			System.out.println("数据处理异常，回滚。");
			throw e;
		}
	}

}
