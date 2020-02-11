package resume.service;

import resume.domain.Resume;

import java.sql.SQLException;
import java.util.List;

public interface ResumeService {
    List<Resume> getByName(String name2);
    List<Resume> getBySex(String sex);
    List<Resume> getResume();
    void deleteResume(int id);
    Resume addResume(Resume resume);
}
