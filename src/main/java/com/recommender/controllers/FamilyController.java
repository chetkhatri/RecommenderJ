package com.recommender.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.recommender.dao.FamilyDAO;
import com.recommender.domain.Family;



@RestController
public class FamilyController {

	@RequestMapping(value = "/getRecommendation", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Map<String, Object> getUsers(@RequestBody Map<String, String> name) throws Exception
	{
		Family family = familyDAO.findByName(name.get("firstname").toString(), name.get("middlename").toString(), name.get("lastname").toString());
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("candidates", family);
		return response;
		
	}
	
	@RequestMapping(value = "/getdata", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Family> getAllUsers() throws Exception
	{
		List<Family> response = familyDAO.findAll();
		return response;
	}
	
	@Autowired
	FamilyDAO familyDAO;
}
