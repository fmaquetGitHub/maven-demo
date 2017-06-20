package appli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import appli.domain.Biere;
import appli.repository.BiereRepository;

@RestController
public class DemoController {

	@Autowired
	private BiereRepository repository;

	@GetMapping("/")
	public String findOne() {
		Biere b = this.repository.findAll().iterator().next();
		return b.toString();
	}

	@GetMapping("/all")
	public List<Biere> findAll() {
		return (List<Biere>) this.repository.findAll();
	}
	
	
	@GetMapping("/{nom}")
	public Biere findOneByName(@PathVariable("nom") String nom) {
		return this.repository.findByNom(nom);
	}
}
