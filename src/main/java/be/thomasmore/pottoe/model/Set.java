package be.thomasmore.pottoe.model;

public class Set {

    private String type;
    private String gemaaktdoor;

    public Set(String type, String gemaaktdoor) {
        this.type = type;
        this.gemaaktdoor = gemaaktdoor;
    }

    public String getType() {
        return type;
    }

    public String getGemaaktdoor() {
        return gemaaktdoor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGemaaktdoor(String gemaaktdoor) {
        this.gemaaktdoor = gemaaktdoor;
    }
}
