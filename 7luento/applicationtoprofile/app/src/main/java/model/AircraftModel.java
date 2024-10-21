package model;


public class AircraftModel {

    private String model;
    private Integer maxNumberOfPassangers;
    private String vendor;

    public String getAircraftModel() {
        return model;
    }

    public void setAircraftModel(String model) {
        this.model = model;
    }

    public Integer getMaxNumberOfPassangers() {
        return maxNumberOfPassangers;
    }

    public void setMaxNumberOfPassangers(Integer maxNumberOfPassangers) {
        this.maxNumberOfPassangers = maxNumberOfPassangers;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
