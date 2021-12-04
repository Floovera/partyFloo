package be.thomasmore.pottoe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Set {

    @Id
    private int id;
    private String name;
    private String type;
    private String gemaaktdoor;

    public Set() {
    }

    public Set(int id, String name, String type, String gemaaktdoor) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gemaaktdoor = gemaaktdoor;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getGemaaktdoor() {
        return gemaaktdoor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGemaaktdoor(String gemaaktdoor) {
        this.gemaaktdoor = gemaaktdoor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
