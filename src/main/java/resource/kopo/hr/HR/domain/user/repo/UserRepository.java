package resource.kopo.hr.HR.domain.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import resource.kopo.hr.HR.domain.user.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


}
