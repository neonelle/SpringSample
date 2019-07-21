package com.example.demo.trySpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	public Map<String, Object> findOne(int id){

		//SELECT文
		String query = "SELECT "
                + " employee_id,"
                + " employee_name,"
                + " age "
                + "FROM employee "
                + "WHERE employee_id=?";

	Map<String, Object>employee = JdbcTemplate.queryForMap(query, id);

	return employee;

	}



}
