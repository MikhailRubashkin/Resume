package resume.domain;

import java.io.Serializable;

public class Contacts implements Serializable {
    private Integer id;
    private String github;
    private String email;
    private String telephone;
    private String skype;
    private String linkedin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
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
    public static class Builder {
        private Contacts newContacts;

        public Builder() {
            newContacts = new Contacts();
        }

        public Contacts.Builder withId(Integer id) {
            newContacts.id = id;
            return this;
        }

    public Contacts.Builder withGithub(String github){
        newContacts.github = github;
        return this;
    }
    public Contacts.Builder withEmail(String email){
        newContacts.email = email;
        return this;
    }
    public Contacts.Builder withTelephone(String telephone){
        newContacts.telephone = telephone;
        return this;
    }
    public Contacts.Builder withSkype(String skype){
        newContacts.skype = skype;
        return this;
    }
    public Contacts.Builder withLinkedin(String linkedin){
        newContacts.linkedin = linkedin;
        return this;
    }
        public Contacts build() {
            return newContacts;
        }
    }
}
