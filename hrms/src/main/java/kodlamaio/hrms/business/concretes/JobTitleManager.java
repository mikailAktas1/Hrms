package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobTitleService;

import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.jobTitle;

public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public List<jobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

	@Override
	public jobTitle getById(int id) {
		return this.jobTitleDao.findById(id).orElse(null);
		
	}

	@Override
	public jobTitle getByTitle(String title) {
		return this.jobTitleDao.findByTitle(title).orElse(null);
	}
	
	

}
