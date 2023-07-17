package com.PruebaDiegoEstupinan.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PruebaDiegoEstupinan.Entity.Oferta;
import com.PruebaDiegoEstupinan.Repository.OfertaRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/oferta")
public class OfertaController {

	@Autowired
	private OfertaRepository ofertaRepository;
	
	@GetMapping("/todos")
	public List<Oferta> ObtenerOfertas(){
		return ofertaRepository.findAll();
		//return ofertaRepository.Todos();
	}
	
	
	@PostMapping("/employees")
	public Oferta createEmployee(@RequestBody Oferta oferta) {
		return ofertaRepository.save(oferta);
	}
	

	@GetMapping("/employees/{id}")
	public ResponseEntity<Oferta> getEmployeeById(@PathVariable Long id) {
		Oferta oferta = ofertaRepository.findById(id).get();
				
		return ResponseEntity.ok(oferta);
	}
	

	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Oferta> updateEmployee(@PathVariable Long id, @RequestBody Oferta ofertaDetails){
		Oferta oferta = ofertaRepository.findById(id).get();
				
		
		//oferta.setFirstName(employeeDetails.getFirstName());
		//oferta.setLastName(employeeDetails.getLastName());
		//oferta.setEmailId(employeeDetails.getEmailId());
		
		Oferta updatedOferta = ofertaRepository.save(oferta);
		return ResponseEntity.ok(updatedOferta);
	}
	

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Oferta oferta = ofertaRepository.findById(id).get();
				
		
		ofertaRepository.delete(oferta);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
