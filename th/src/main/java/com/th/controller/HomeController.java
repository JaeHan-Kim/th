package com.th.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.th.model.Board;
import com.th.service.BoardService;

@Controller
public class HomeController extends BaseController{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model, Board board) {
		logger.debug("asd");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		this.saveCookie(response, "K", "ll");
		model.addAttribute("serverTime", formattedDate );
		
		List<Board> boards = boardService.getBoardList(board);
		
		model.addAttribute("board", boards);
		return "home";
	}
	
	@RequestMapping(value="/fileUpload")
	public ModelAndView fileUpload(ModelMap model) {
		logger.debug("ggg");
		return new ModelAndView("fileUpload");
	}
	
	@RequestMapping(value="/test404")
	public ModelAndView test404(ModelMap model) {
		logger.info("ggg 404");
		return new ModelAndView("fileUpload");
	}
	
}
