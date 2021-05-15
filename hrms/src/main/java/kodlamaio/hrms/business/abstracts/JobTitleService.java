package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.jobTitle;

public interface JobTitleService {
	List<jobTitle> getAll();
	jobTitle getById(int id);
	jobTitle getByTitle(String title);

}
