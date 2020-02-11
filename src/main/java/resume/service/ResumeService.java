package resume.service;

import resume.domain.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> getByName(String name2);
    List<Resume> getResume();
    void deleteResume(int id);
    Resume addResume(Resume resume);
}
