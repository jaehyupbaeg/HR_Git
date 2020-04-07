package resource.kopo.hr.HR.domain.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import resource.kopo.hr.HR.domain.hr.HR;

import java.util.List;

public interface HRRepository extends JpaRepository<HR, Long> {


}
