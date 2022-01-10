package be.thomasmore.pottoe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Creator {

    @Id
    private int id;
    private String name;
    private String imgSource;
    private String email;

    public Creator() {
    }

    public Creator(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgSource() { return imgSource; }

    public void setImgSource(String imgSource) { this.imgSource = imgSource; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
