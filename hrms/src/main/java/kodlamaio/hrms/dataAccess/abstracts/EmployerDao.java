package kodlamaio.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;



import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	Optional<Employer>  findEmployerByPhonesPhoneNumber(@Param("phoneNumber") String phoneNumber);
}


