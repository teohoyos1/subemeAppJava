package com.teohoyos.uma.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.teohoyos.uma.api.File;
import com.teohoyos.uma.rowmapper.FileRowMapper;

@Repository
public class FileDAOimp implements FileDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<File> listFiles() {
		
		String sql = "SELECT * FROM files_fi_file";
		List<File> fileListMap = jdbcTemplate.query(sql, new FileRowMapper());
		
		return fileListMap;
	}

}
