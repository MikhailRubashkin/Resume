package resume.service.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import resume.domain.Resume;

import java.util.List;

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
        final List<Resume> resumes = resumeService.getByName("Петров");
        Assert.assertTrue(resumes.size() > 0);
    }

    @org.junit.Test
    public void getResumes() {
        Resume resume = new Resume.Builder()
                .withId(4)
                .withName2("Петров")
                .withSurname("Петр")
                .withPatronymic("Петрович")
                .withSex("мужчина")
                .build();
        final Resume newResume = resumeService.addResume(resume);
        Assert.assertNotNull(newResume);
        final List<Resume> resumes = resumeService.getResume();
        Assert.assertTrue(resumes.size() > 0);
        resumeService.deleteResume(newResume.getId());
    }
    @Test
    public void getBySex() {
        final List<Resume> resumes = resumeService.getBySex("женщина");
        Assert.assertTrue(resumes.size() > 0);
    }
}