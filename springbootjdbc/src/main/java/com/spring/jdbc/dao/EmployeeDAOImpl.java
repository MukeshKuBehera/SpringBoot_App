package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM springbootjdbc.tbl_employees;",new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("SELECT * FROM springbootjdbc.tbl_employees WHERE id=?",new BeanPropertyRowMapper<Employee>(Employee.class),id);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE FROM springbootjdbc.tbl_employees WHERE id=?",id);
	}

	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO springbootjdbc.tbl_employees(name,location,department) VALUES(?,?,?)",new Object[] {
				e.getName(),e.getLocation(),e.getDepartment()});
	}

	@Override
	public int update(Employee e, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE tbl_employees SET name = ?, location = ?, department = ? WHERE id = ?",new Object[] {e.getName(),e.getLocation(),e.getDepartment()});
	}

}
