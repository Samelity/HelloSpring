package com.rin.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Students> {

	@Override
	public Students mapRow(ResultSet res, int rowNum) throws SQLException {
		Students students = new Students();
		students.setId(res.getInt("id"));
		students.setName(res.getString("name"));
		students.setAge(res.getInt("age"));
		students.setMarks(res.getInt("marks"));
		students.setYear(res.getInt("year"));
		students.setSid(res.getInt("sid"));
		return students;
	}

}
