package be.thomasmore.pottoe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Set {

    @Id
    private int id;
    private String name;
    private String type;
    private int price;

    public Set() {
    }

    public Set(int id) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
