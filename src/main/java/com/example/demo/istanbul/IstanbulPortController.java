package com.example.demo.istanbul;

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
public class IstanbulPortController {

	
	@Autowired
	IstanbulPortRepos istanbulPortRepos;
	
	@GetMapping("/iport")
	public ResponseEntity< List<IstanbulPort>> get(){
		List<IstanbulPort> istPort = istanbulPortRepos.findAll();
		return new ResponseEntity<List<IstanbulPort>>(istPort,HttpStatus.OK);
				
	}
	
	@PostMapping("/iport")
	public ResponseEntity<IstanbulPort> save(@RequestBody  IstanbulPort istanbulPort){
		IstanbulPort isPort = istanbulPortRepos.save(istanbulPort);
		return new ResponseEntity<IstanbulPort>(isPort,HttpStatus.OK);
	}
	
	@GetMapping("/iport/{id}")
	public ResponseEntity<IstanbulPort> get(@PathVariable ("id") int id){
		IstanbulPort istPort = istanbulPortRepos.findById(id);
		return new ResponseEntity<IstanbulPort>(istPort,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/iport/{id}")
	public ResponseEntity<String> delete(@PathVariable ("id") int id) {
		istanbulPortRepos.deleteById(id);
       return new ResponseEntity<String>("Delete is successfull", HttpStatus.OK);
	}
}
