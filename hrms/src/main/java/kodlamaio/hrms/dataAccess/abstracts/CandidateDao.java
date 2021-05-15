package kodlamaio.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.Candidates;



public interface CandidateDao extends JpaRepository<Candidates,Integer> {
	Optional<Candidates> findFirstByFirstNameIgnoreCase(@Param("firstName") String firstName);
	Optional<Candidates> findByEmailAddressIgnoreCase(@Param("emailAddress") String emailAddress);

}
