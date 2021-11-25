package be.thomasmore.pottoe.model;

public class Set {

    private int id;
    private String type;
    private String gemaaktdoor;

    public Set(int id,String type, String gemaaktdoor) {
        this.id = id;
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
}
