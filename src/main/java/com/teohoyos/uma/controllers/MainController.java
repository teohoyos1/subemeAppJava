package com.teohoyos.uma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teohoyos.uma.DAO.FileDAO;
import com.teohoyos.uma.DAO.FileDAOimp;
import com.teohoyos.uma.api.File;

@Controller
public class MainController {
	
	@Autowired
	private FileDAO filedao;
	
	//@RequestMapping(value = "/listado", method = RequestMethod.GET)
	@GetMapping("/listFile")
	public String showFilesList(Model model) {
		
		List<File> filelist = filedao.listFiles();
		
		model.addAttribute("fileList",filelist);
		return "file-list";
	}

}
