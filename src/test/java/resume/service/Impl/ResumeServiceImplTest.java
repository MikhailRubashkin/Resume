package resume.service.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import resume.domain.Resume;

import java.util.List;

import static org.junit.Assert.*;

public class ResumeServiceImplTest {

    private ResumeServiceImpl resumeService;

    @Before
    public void setUp() {
        resumeService = (ResumeServiceImpl) ResumeServiceImpl.getInstance();
    }

    @Test
    public void getInstanse() {
        Assert.assertNotNull(resumeService);
    }

    @org.junit.Test
    public void getByName() {

    }

    @org.junit.Test
    public void getResumes() {
        Resume resume = new Resume();
        resume.setId(4);
        resume.setName2("Петров");
        resume.setSurname("Петр");
        resume.setPatronymic("Петрович");
        resume.setSex("Мужчина");
        final Resume newResume = resumeService.addResume(resume);
        Assert.assertNotNull(newResume);
        final List<Resume> resumes = resumeService.getResume();
        Assert.assertTrue(resumes.size() > 0);
        resumeService.deleteResume(newResume.getId());
    }
}