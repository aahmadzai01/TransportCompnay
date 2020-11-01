package com.example.demo.karachi;

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
public class KarachiPortController {

	
	@Autowired
	KarachiPortRepos karachiPortRepos;
	
	@GetMapping("/kport")
	public ResponseEntity< List<KarachiPort>> get(){
		List<KarachiPort> kPort = karachiPortRepos.findAll();
		return new  ResponseEntity<List<KarachiPort>>(kPort, HttpStatus.OK);
			
	}
	@PostMapping("/kport")
    public ResponseEntity<KarachiPort> save(@RequestBody KarachiPort karachiPort){
		KarachiPort karPort= karachiPortRepos.save(karachiPort);
		return new ResponseEntity<KarachiPort> (karPort,HttpStatus.OK);
			}
	
	@GetMapping("/kport/{id}")
	public ResponseEntity<KarachiPort> get(@PathVariable("id") int id ){
		KarachiPort karachiPort= karachiPortRepos.findById(id);
		return new ResponseEntity<KarachiPort>(karachiPort,HttpStatus.OK);
		
	}
	
	@DeleteMapping("kport/{id}")
	public ResponseEntity<String> delete(@PathVariable ("id") int id){
		karachiPortRepos.findById(id);
	return new ResponseEntity<String> ("Delete is Done!!!!",HttpStatus.OK);	
	}
	
	
}
