package kodlamaio.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.jobTitle;

public interface JobTitleDao extends JpaRepository<jobTitle, Integer> {

	Optional<jobTitle> findByTitle(@Param("title") String title);
	
}

