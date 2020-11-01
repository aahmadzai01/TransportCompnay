package com.example.demo.hairatan;

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
public class HairatanPortController {

	
	@Autowired
	HairatanPortRepos hairatanPortRepos;
	
	@GetMapping("/hport")
	public ResponseEntity< List<HairatanPort>> get(){
		List<HairatanPort> hPort = hairatanPortRepos.findAll();
		return new ResponseEntity<List<HairatanPort>>(hPort,HttpStatus.OK);
				
	}
	
	@PostMapping("/hport")
	public ResponseEntity<HairatanPort> save (@RequestBody HairatanPort hairatanPort){
		HairatanPort hairPort = hairatanPortRepos.save(hairatanPort);
		return new ResponseEntity<HairatanPort>(hairPort,HttpStatus.OK);
	}
	@GetMapping("/hport/{id}")
	public ResponseEntity<HairatanPort> get(@PathVariable("id") int id) {
		HairatanPort hairPort = hairatanPortRepos.findById(id);
		return new ResponseEntity<HairatanPort>(hairPort,HttpStatus.OK);
		}
	@DeleteMapping("/hport/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		hairatanPortRepos.findById(id);
		return new ResponseEntity<String>("Delete is successfull", HttpStatus.OK);
	}
	
	
}
