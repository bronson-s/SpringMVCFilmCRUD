package com.skilldistillery.films.controllers;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.skilldistillery.film.database.DatabaseAccessor;
import com.skilldistillery.film.entities.Film;
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
	@RequestMapping(path = "findFilmById.do", method = RequestMethod.GET)
	public ModelAndView findFilmID(@RequestParam("id")int id) throws SQLException {
		ModelAndView mv = new ModelAndView();
		  mv.addObject("film", databaseaccessor.findFilmById(id));

		mv.setViewName("WEB-INF/IDresults.jsp");
		return mv;
	}
	@RequestMapping(path = "findFilmByKey.do", method = RequestMethod.GET)
	public ModelAndView findFilmKey(@RequestParam("keyword")String key) throws SQLException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", databaseaccessor.findFilmByKeyword(key));
		
		mv.setViewName("WEB-INF/keyResults.jsp");
		return mv;
	}
	@RequestMapping(path = "createFilm.do", method = RequestMethod.GET)
	public ModelAndView makefilm(Film film) throws SQLException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", databaseaccessor.createFilm(film));
		
		mv.setViewName("WEB-INF/addedFilmResult.jsp");
		return mv;
	}
	@RequestMapping(path = "deleteFilm.do", method = RequestMethod.POST)
	public ModelAndView deleteFilm(@RequestParam("id")int id) throws SQLException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", databaseaccessor.deleteFilm(databaseaccessor.findFilmById(id)));
		
		mv.setViewName("WEB-INF/filmDeleted.jsp");
		return mv;
	}
	@RequestMapping(path = "updatedFilm.do", method = RequestMethod.POST)
	public ModelAndView updateFilm(Integer id, String title, String description) throws SQLException {
		ModelAndView mv = new ModelAndView();
	     Film film = databaseaccessor.findFilmById(id);
	     film.setDescription(description);
	     film.setTitle(title);
	      
		mv.addObject("film", databaseaccessor.updateFilm(film));
		
		  mv.setViewName("WEB-INF/updated.jsp");
		
		return mv;
	}
	@RequestMapping(path = "updatingFilm.do", method = RequestMethod.POST)
	public ModelAndView updateFilm(Integer id) throws SQLException {
		ModelAndView mv = new ModelAndView();
		mv.addObject("film", databaseaccessor.findFilmById(id));
		
		
		mv.setViewName("WEB-INF/updatingFilm.jsp");
		return mv;
	}
	
	
	
	
}