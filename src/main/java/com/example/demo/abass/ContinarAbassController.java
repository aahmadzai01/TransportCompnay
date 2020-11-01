package com.example.demo.abass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ContinarAbassController {
	
	
	@Autowired
	ContaineAbassRepos containeAbassRepos;
	
	@GetMapping("/aport")
	public ResponseEntity<List<ContinerAbass>> get(){
		List <ContinerAbass> cAbas = containeAbassRepos.findAll();
		return new ResponseEntity<List<ContinerAbass>>(cAbas, HttpStatus.OK);
	}
	
	@PostMapping("/aport")
	public ResponseEntity<ContinerAbass> save(@RequestBody  ContinerAbass continerAbass){
		ContinerAbass contAbass = containeAbassRepos.save(continerAbass);
		return new ResponseEntity <ContinerAbass>(contAbass,HttpStatus.OK);
	}
	
	@GetMapping("/aport/{id}")
	public ResponseEntity<ContinerAbass> get(@PathVariable("id") int id){
		ContinerAbass contAbas = containeAbassRepos.findById(id);
		return new ResponseEntity<ContinerAbass>(contAbas,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/aport/{id}")
	public ResponseEntity<String> delete(@PathVariable ("id") int id) {
		containeAbassRepos.deleteById(id);
       return new ResponseEntity<String>("Delete is successfull", HttpStatus.OK);
	}
	

}
