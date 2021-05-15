package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.jobTitle;

@RestController
@RequestMapping("api/job-titles")
public class JobTitlesController {
	
	private final JobTitleService jobTitleService;

	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("getall")
	public List<jobTitle> getAll(){
		return jobTitleService.getAll();
	}
	
	@GetMapping("getbyid/{id}")
	public jobTitle getById(@PathVariable int id) {
		return jobTitleService.getById(id);
	}
	
	@GetMapping("getbytitle/{title}") 
	public jobTitle getByTitle(@PathVariable String title) {
		return jobTitleService.getByTitle(title);
	}
}
