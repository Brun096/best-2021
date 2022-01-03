package org.generation.italy.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/index")
	public String index(Model model){
		// logica applicativa
		
		
		
		// passo la logica alla view col Model
		
		model.addAttribute("name", "Bruno");
		
		
		// restituisco la view
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		List<String> moviesList = new ArrayList<String>();
		
		//model.addAttribute("students",studentList);
		
		model.addAttribute("movies", Arrays.asList("Don't Look Up", "Red Notice", "Finch", "Dune","Il Collezionista di Carte"));
		return "movies";
	}
	
	@GetMapping("/movies/{name}")
	public String movieList(Model model, @PathVariable("name") String movieName) {
		model.addAttribute("movie", movieName);
		return "list";
	}
	@GetMapping("/songs")
	public String songs(Model model) {
		List<String> songsList = new ArrayList<String>();
		
		//model.addAttribute("students",studentList);
		
		model.addAttribute("songs", Arrays.asList("Montero - Lil Nas x", "Kiss Me More - Doja Cat", "Butter - BTS"));
		return "songs";
	}
	
	@GetMapping("/songs/{name}")
	public String songList(Model model, @PathVariable("name") String songName) {
		model.addAttribute("song", songName);
		return "listSong";
	}
	
}
