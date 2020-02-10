package resume.ropository.impl;

import resume.connection.ConnectionManager;
import resume.domain.Resume;
import resume.ropository.ResumeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResumeRepositoryImpl implements ResumeRepository {


    private static final String SAVE_QUERY = "INSERT INTO Resume (id, name2, ) VALUES (?, ?, ?)";
    private static final String UPDATE_QUERY = "";
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
        statement.setString(2, name2);
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
        return entity;
    }

    @Override
    public Resume get(Integer id) throws SQLException {
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
        return null;
    }

    @Override
    public void update(Resume resume) throws SQLException {

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
