package be.thomasmore.pottoe.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Creation {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creation_generator")
    @SequenceGenerator(name = "creation_generator", sequenceName = "creation_seq", allocationSize = 1)
    @Id
    private Integer id;
    private String name;
    private String imgSource;
    private String extraInfo;
    private double price;
    private String type;
    @ManyToOne
    private Creator creator;
    private Date addedOn;

    public Creation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

}
