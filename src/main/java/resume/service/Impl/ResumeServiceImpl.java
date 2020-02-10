package resume.service.Impl;

import resume.domain.Resume;
import resume.ropository.ResumeRepository;
import resume.ropository.impl.ResumeRepositoryImpl;
import resume.service.ResumeService;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class ResumeServiceImpl implements ResumeService {

    private static ResumeServiceImpl instance;
    private ResumeRepository resumeRepository = ResumeRepositoryImpl.getInstance();

    private ResumeServiceImpl() {
    }

    public static ResumeService getInstance() {
        if (instance == null) {
            instance = new ResumeServiceImpl();
        }
        return instance;
    }


    @Override
    public List<Resume> getByName(String name2) {
        try {
            return resumeRepository.getByName(name2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Resume> getResume() {
        try {
            return resumeRepository.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
