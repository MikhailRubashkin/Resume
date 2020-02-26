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

    public static class Builder{
        private Resume newResume;

        public Builder(){
            newResume = new Resume();
        }

        public Builder withId(Integer id){
            newResume.id = id;
            return this;
        }
        public Builder withName2(String name2){
            newResume.name2 = name2;
            return this;
        }
        public Builder withSurname(String surname){
            newResume.surname = surname;
            return this;
        }
        public Builder withPatronymic(String patronymic){
            newResume.patronymic = patronymic;
            return this;
        }
        public Builder withSex(String sex){
            newResume.sex = sex;
            return this;
        }
        public Builder withDate_of_Birth(Date date_of_birth){
            newResume.date_of_birth = date_of_birth;
            return  this;
        }
        public Resume build(){
            return newResume;
        }
    }
}
