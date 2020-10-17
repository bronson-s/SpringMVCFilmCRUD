package com.skilldistillery.films.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.database.DatabaseAccessor;

@Controller
public class FilmController {
	
	@Autowired
	private DatabaseAccessor databaseaccessor;
	
	public void DatabaseAccessor(DatabaseAccessor databaseaccessor) {
		this.databaseaccessor = databaseaccessor;
	}
	@RequestMapping(path = "index.do", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/home.jsp");
		return mv;
	}
}