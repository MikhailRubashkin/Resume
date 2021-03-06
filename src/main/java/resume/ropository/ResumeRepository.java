package resume.ropository;

import resume.domain.Resume;

import java.sql.SQLException;
import java.util.List;

public interface ResumeRepository extends EntytiRepository<Resume> {
    List<Resume> getByName(String name2) throws SQLException;
    List<Resume> getBySex(String sex) throws SQLException;
}
