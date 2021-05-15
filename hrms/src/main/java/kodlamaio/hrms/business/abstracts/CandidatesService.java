package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Candidates;

public interface CandidatesService {

	void save(Candidates candidates);
	List<Candidates> getAll();
	Candidates getByFirstName(String string);
	Candidates getByEmailAddress(String string);
}
