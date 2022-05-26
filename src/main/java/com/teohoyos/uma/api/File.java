package com.teohoyos.uma.api;

public class File {

	private int id;
	private String fileTypeName;
	private String fileDescription;
	private String files;
	private String modified_date;
	private int fileType_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileTypeName() {
		return fileTypeName;
	}
	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}
	public String getFileDescription() {
		return fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public String getModified_date() {
		return modified_date;
	}
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
	public int getFileType_id() {
		return fileType_id;
	}
	public void setFileType_id(int fileType_id) {
		this.fileType_id = fileType_id;
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", fileTypeName=" + fileTypeName + ", fileDescription=" + fileDescription + ", files="
				+ files + ", modified_date=" + modified_date + ", fileType_id=" + fileType_id + "]";
	}
	
	
	
}

