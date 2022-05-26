package com.teohoyos.uma.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teohoyos.uma.api.File;

public class FileRowMapper implements RowMapper<File>{

	@Override
	public File mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		File file = new File();
		
		file.setId(rs.getInt("id"));
		file.setFileTypeName(rs.getString("fileTypeName"));
		file.setFileDescription(rs.getString("fileDescription"));
		file.setFiles(rs.getString("files"));
		file.setModified_date(rs.getString("modified_date"));
		file.setFileType_id(rs.getInt("fileType_id"));
		
		//rs.getInt("id");
		//rs.getString("fileTypeName");
		//rs.getString("fileDescription");
		//rs.getString("files");
		//rs.getString("modified_data");
		//rs.getInt("fileType_id");
		
		return file;
	}
	
	

}
