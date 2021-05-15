package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.utilities.results.Results;
import kodlamaio.hrms.core.utilities.results.SuccessResults;
import kodlamaio.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping(path = "/api/candidates/")
public class CandidatesController {

	private CandidatesService candidatesService;

	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@PostMapping(path = "save")
	public Results save(@RequestBody Candidates candidates) {
		this.candidatesService.save(candidates);
		
		return new SuccessResults("mesaj");
	}

	@GetMapping(path = "getall")
	public List<Candidates> getAll(){
		return this.candidatesService.getAll(); 
	};
	
	@GetMapping(path = "getbyfirstname/{firstName}")
	public Candidates getByFirstname(@PathVariable String firstName) {
		return this.candidatesService.getByFirstName(firstName);
	}
	
	@GetMapping(path = "getbyemailaddress/{emailAddress}")
	public Candidates getByEmailAddress(@PathVariable String emailAddress) {
		return this.candidatesService.getByEmailAddress(emailAddress);
	}
}
	
