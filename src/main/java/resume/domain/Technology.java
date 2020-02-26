package resume.domain;

import java.io.Serializable;

public class Technology implements Serializable {
    private Integer id;
    private String ginhub;
    private String spring_boot;
    private String html;
    private String java_ee;
    private String java_core;
    private String maven;
    private String rest;
    private String spring;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGinhub() {
        return ginhub;
    }

    public void setGinhub(String ginhub) {
        this.ginhub = ginhub;
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


    public static class Builder {
        private Technology newTechnology;

        public Builder() {
            newTechnology = new Technology();
        }

        public Technology.Builder withId(Integer id) {
            newTechnology.id = id;
            return this;
        }

        public Technology.Builder withGinhub(String ginhub) {
            newTechnology.ginhub = ginhub;
            return this;
        }

        public Technology.Builder withSpring_Boot(String spring_boot) {
            newTechnology.spring_boot = spring_boot;
            return this;
        }

        public Technology.Builder withHtml(String html) {
            newTechnology.html = html;
            return this;
        }

        public Technology.Builder withJava_EE(String java_ee) {
            newTechnology.java_ee = java_ee;
            return this;
        }

        public Technology.Builder withJava_Core(String java_core) {
            newTechnology.java_core = java_core;
            return this;
        }

        public Technology.Builder withMaven(String maven) {
            newTechnology.maven = maven;
            return this;
        }

        public Technology.Builder withRest(String rest) {
            newTechnology.rest = rest;
            return this;
        }

        public Technology.Builder withSpring(String spring) {
            newTechnology.spring = spring;
            return this;
        }

        public Technology build() {
            return newTechnology;
        }
    }

}
