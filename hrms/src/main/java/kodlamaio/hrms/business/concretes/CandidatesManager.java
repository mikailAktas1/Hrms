package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidates;

public class CandidatesManager implements CandidatesService {
	
	private CandidateDao candidateDao;

	public CandidatesManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public void save(Candidates candidates) {
		this.candidateDao.save(candidates);
		
	}

	@Override
	public List<Candidates> getAll() {
		return this.candidateDao.findAll(); 
	}

	@Override
	public Candidates getByFirstName(String string) {
		return this.candidateDao.findFirstByFirstNameIgnoreCase(string).orElse(null);
	}

	@Override
	public Candidates getByEmailAddress(String string) {
		return this.candidateDao.findByEmailAddressIgnoreCase(string).orElse(null);
	}

}
