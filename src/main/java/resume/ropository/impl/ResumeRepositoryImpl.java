package resume.ropository.impl;

import resume.connection.ConnectionManager;
import resume.domain.Resume;
import resume.ropository.ResumeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResumeRepositoryImpl implements ResumeRepository {


    private static final String SAVE_QUERY = "INSERT INTO Resume (ID, NAME2, SURNAME, PATRONYMIC, SEX, Date_of_Birth, GITHUB_CONTACTS,\n" +
            "      EMAIL,\n" +
            "      TELEPHONE,\n" +
            "      SKYPE,\n" +
            "      LINKEDIN,\n" +
            "      GITHUB_TECHNOLOGY,\n" +
            "      SPRING_BOOT,\n" +
            "      HTML,\n" +
            "      JAVA_EE,\n" +
            "      JAVA_CORE,\n" +
            "      MAVEN,\n" +
            "      REST,\n" +
            "      SPRING ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SEX_QUERY = "SELECT * FROM Resume WHERE SEX = ?";
    private static final String GET_QUERY = "SELECT * FROM Resume WHERE id=?";
    private static final String GET_ALL_QUERY = "SELECT * FROM Resume";
    private static final String REMOVE_QUERY = "DELETE FROM Resume WHERE id=?";
    private static final String GET_RESUMES_BY_NAME = "SELECT * FROM Resume WHERE NAME2 = ?";

    private Connection connection;
    private static volatile ResumeRepositoryImpl INSTANCE = null;

    private ResumeRepositoryImpl() {
    }

    public static ResumeRepositoryImpl getInstance() {
        synchronized (BaseRepository.class) {
            if (INSTANCE == null) {
                INSTANCE = new ResumeRepositoryImpl();
            }
        }
        return INSTANCE;
    }

    private Connection getConnection() {
        if (connection == null) {
            connection = ConnectionManager.getConnection();
        }
        return connection;
    }


    @Override
    public List<Resume> getByName(String name2) throws SQLException {
        final PreparedStatement statement = getConnection().prepareStatement(GET_RESUMES_BY_NAME);
        statement.setString(1, name2);
        statement.execute();
        List<Resume> list = new ArrayList<>();
        ResultSet rs = statement.getResultSet();
        while (rs.next()) {
            list.add(populateEntity(rs));
        }
        rs.close();
        return list;
    }

    @Override
    public List<Resume> getBySex(String sex) throws SQLException {
        final PreparedStatement statement = getConnection().prepareStatement(SEX_QUERY);
        statement.setString(1, sex);
        statement.execute();
        List<Resume> list = new ArrayList<>();
        ResultSet rs = statement.getResultSet();
        while (rs.next()) {
            list.add(populateEntity(rs));
        }
        rs.close();
        return list;
    }

    private Resume populateEntity(ResultSet rs) throws SQLException{
        Resume entity = new Resume();
        entity.setId(rs.getInt(1));
        entity.setName2(rs.getString(2));
        entity.setSurname(rs.getString(3));
        entity.setPatronymic(rs.getString(4));
        return entity;
    }

    @Override
    public Resume get(Integer id) throws SQLException {
        final PreparedStatement statement = getConnection().prepareStatement(GET_QUERY);
        statement.setLong(1, (long) id);
        statement.executeQuery();
        ResultSet resultSet = statement.getResultSet();
        if (resultSet.next()) {
            return formResume(resultSet);
        }
        resultSet.close();
        return null;
    }

    @Override
    public List<Resume> getAll() throws SQLException {
        List<Resume> result = new ArrayList<>();
        final PreparedStatement statement = getConnection().prepareStatement(GET_ALL_QUERY);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            result.add(formResume(resultSet));
        }
        resultSet.close();
        return result;
    }

    @Override
    public Resume save(Resume resume) throws SQLException {
        final PreparedStatement statement = getConnection().prepareStatement(SAVE_QUERY, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, resume.getId());
        statement.setString(2, resume.getName2());
        statement.setString(3, resume.getSurname());
        statement.setString(4, resume.getPatronymic());
        statement.setString(5,resume.getSex());
        statement.setDate(6, (Date) resume.getDate_of_birth());
        statement.setString(7, resume.getGithub_contacts());
        statement.setString(8, resume.getEmail());
        statement.setString(9, resume.getTelephone());
        statement.setString(10, resume.getSkype());
        statement.setString(11, resume.getLinkedin());
        statement.setString(12, resume.getGinhub_technology());
        statement.setString(13, resume.getSpring_boot());
        statement.setString(14, resume.getHtml());
        statement.setString(15, resume.getJava_ee());
        statement.setString(16, resume.getJava_core());
        statement.setString(17, resume.getMaven());
        statement.setString(18, resume.getRest());
        statement.setString(19, resume.getSpring());
        statement.executeUpdate();
        ResultSet resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            resume.setId( resultSet.getInt(1));
        }
        resultSet.close();
        return resume;
    }

    @Override
    public int remove(int id) throws SQLException {
        final PreparedStatement statement = getConnection().prepareStatement(REMOVE_QUERY);
        statement.setLong(1, id);
        return statement.executeUpdate();
    }
    private Resume formResume (ResultSet resultSet) throws SQLException{
        Resume resume = new Resume();
        resume.setId(resultSet.getInt(1));
        resume.setName2(resultSet.getString(2));
        resume.setSurname(resultSet.getString(3));
        resume.setPatronymic(resultSet.getString(4));
        resume.setSex(resultSet.getString(5));
        resume.setDate_of_birth(resultSet.getDate(6));
        resume.setGithub_contacts(resultSet.getString(7));
        resume.setEmail(resultSet.getString(8));
        resume.setTelephone(resultSet.getString(9));
        resume.setSkype(resultSet.getString(10));
        resume.setLinkedin(resultSet.getString(11));
        resume.setGinhub_technology(resultSet.getString(12));
        resume.setSpring_boot(resultSet.getString(13));
        resume.setHtml(resultSet.getString(14));
        resume.setJava_ee(resultSet.getString(15));
        resume.setJava_core(resultSet.getString(16));
        resume.setMaven(resultSet.getString(17));
        resume.setRest(resultSet.getString(18));
        resume.setSpring(resultSet.getString(19));
        return resume;
    }

}
