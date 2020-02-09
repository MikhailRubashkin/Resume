package resume.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Resume implements Serializable {

    private Integer id;
    private String name2;
    private String surname;
    private String patronymic;
    private String sex;
    private Date date_of_birth;
    private String github_contacts;
    private String email;
    private String telephone;
    private String skype;
    private String linkedin;
    private String ginhub_technology;
    private String spring_boot;
    private String html;
    private String java_ee;
    private String java_core;
    private String maven;
    private String rest;
    private String spring;

    public Resume(){}

    public Resume(String name2, String surname, String patronymic, String sex, Date date_of_birth, String github_contacts, String email, String telephone, String skype, String linkedin, String ginhub_technology, String spring_boot, String html, String java_ee, String java_core, String maven, String rest, String spring) {
        this.name2 = name2;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
        this.date_of_birth = date_of_birth;
        this.github_contacts = github_contacts;
        this.email = email;
        this.telephone = telephone;
        this.skype = skype;
        this.linkedin = linkedin;
        this.ginhub_technology = ginhub_technology;
        this.spring_boot = spring_boot;
        this.html = html;
        this.java_ee = java_ee;
        this.java_core = java_core;
        this.maven = maven;
        this.rest = rest;
        this.spring = spring;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGithub_contacts() {
        return github_contacts;
    }

    public void setGithub_contacts(String github_contacts) {
        this.github_contacts = github_contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGinhub_technology() {
        return ginhub_technology;
    }

    public void setGinhub_technology(String ginhub_technology) {
        this.ginhub_technology = ginhub_technology;
    }

    public String getSpring_boot() {
        return spring_boot;
    }

    public void setSpring_boot(String spring_boot) {
        this.spring_boot = spring_boot;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getJava_ee() {
        return java_ee;
    }

    public void setJava_ee(String java_ee) {
        this.java_ee = java_ee;
    }

    public String getJava_core() {
        return java_core;
    }

    public void setJava_core(String java_core) {
        this.java_core = java_core;
    }

    public String getMaven() {
        return maven;
    }

    public void setMaven(String maven) {
        this.maven = maven;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getSpring() {
        return spring;
    }

    public void setSpring(String spring) {
        this.spring = spring;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume that = (Resume) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name2, that.name2) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(date_of_birth, that.date_of_birth) &&
                Objects.equals(github_contacts, that.github_contacts) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(skype, that.skype) &&
                Objects.equals(linkedin, that.linkedin) &&
                Objects.equals(ginhub_technology, that.ginhub_technology) &&
                Objects.equals(spring_boot, that.spring_boot) &&
                Objects.equals(html, that.html) &&
                Objects.equals(java_ee, that.java_ee) &&
                Objects.equals(java_core, that.java_core) &&
                Objects.equals(maven, that.maven) &&
                Objects.equals(rest, that.rest) &&
                Objects.equals(spring, that.spring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name2, surname, patronymic, sex, date_of_birth, github_contacts, email, telephone, skype, linkedin, ginhub_technology, spring_boot, html, java_ee, java_core, maven, rest, spring);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name2='" + name2 + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", sex='" + sex + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", github_contacts='" + github_contacts + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", skype='" + skype + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", ginhub_technology='" + ginhub_technology + '\'' +
                ", spring_boot='" + spring_boot + '\'' +
                ", html='" + html + '\'' +
                ", java_ee='" + java_ee + '\'' +
                ", java_core='" + java_core + '\'' +
                ", maven='" + maven + '\'' +
                ", rest='" + rest + '\'' +
                ", spring='" + spring + '\'' +
                '}';
    }
}
