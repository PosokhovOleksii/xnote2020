package lms.dao.entity;

import java.util.Date;
import java.util.Objects;

public class User {
    private String name;
    private String owner;
    private String sex;
    private Date birth;

    public User() {
    }

    public User(String name, String owner, String sex, Date birth) {
        this.name = name;
        this.owner = owner;
        this.sex = sex;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(owner, user.owner) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(birth, user.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, sex, birth);
    }
}
