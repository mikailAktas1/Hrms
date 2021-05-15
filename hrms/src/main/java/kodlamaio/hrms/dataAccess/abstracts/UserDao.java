package kodlamaio.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import kodlamaio.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository <User,String >{
	Optional<User>  findUserByEmailAddress(@Param("emailaddress") String emailaddress);

}
