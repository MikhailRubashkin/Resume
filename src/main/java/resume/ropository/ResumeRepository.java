package resume.ropository;

import resume.domain.ResumeRepo;

import java.sql.SQLException;
import java.util.List;

public interface ResumeRepository extends EntytiRepository<ResumeRepo> {
    List<ResumeRepo> getByOrderId(Integer id) throws SQLException;
}
