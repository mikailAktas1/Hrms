package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployerPhoneService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerPhoneDao;
import kodlamaio.hrms.entities.concretes.EmployerPhone;

public class EmployerPhoneManager implements EmployerPhoneService {

	private EmployerPhoneDao employerPhoneDao;

	public EmployerPhoneManager(EmployerPhoneDao employerPhoneDao) {
		super();
		this.employerPhoneDao = employerPhoneDao;
	}

	@Override
	public List<EmployerPhone> getAll() {
		return this.employerPhoneDao.findAll();
	}
}
