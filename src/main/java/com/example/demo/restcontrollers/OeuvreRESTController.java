package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Oeuvre;
import com.example.demo.service.OeuvreService;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class OeuvreRESTController {

	@Autowired
	OeuvreService oeuvreService;

	@RequestMapping(method = RequestMethod.GET)
	//@GetMapping()
	public List<Oeuvre> getAllOeuvres() {
		return oeuvreService.getAllOeuvres();
	}
	
	//@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@GetMapping("/{id}")
	public Oeuvre getOeuvreById(@PathVariable("id") Long id) {
		return oeuvreService.getOeuvre(id);
	}
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping()
	public Oeuvre createOeuvre(@RequestBody Oeuvre oeuvre) {
		return oeuvreService.saveOeuvre(oeuvre);
	}
	
	//@RequestMapping(method = RequestMethod.PUT)
	@PutMapping()
	public Oeuvre updateOeuvre(@RequestBody Oeuvre oeuvre) {
		return oeuvreService.updateOeuvre(oeuvre);
	}
	
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	@DeleteMapping("/{id}")
	public void deleteOeuvre(@PathVariable("id") Long id) {
		oeuvreService.deleteOeuvreById(id);
	}
	
	//@RequestMapping(value="/oeuvresgenre/{idGenre}",method = RequestMethod.GET)
	@GetMapping("/oeuvresgenre/{idGenre}")
	public List<Oeuvre> getOeuvresByGenreId(@PathVariable("idGenre") Long idGenre) {
		return oeuvreService.findByGenreIdGenre(idGenre);
	}
}