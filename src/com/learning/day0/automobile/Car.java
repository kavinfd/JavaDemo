package com.learning.day0.automobile;

/**
 * Created by kavin on 24/09/17.
 */
public class Car {
    private Integer tyreCount;
    private String engineName;
    private String vendor;
    private Integer doorCount;
    private Boolean hasExtraWheel;

    public Car(Integer tyreCount, String engineName, String vendor, Integer doorCount) {
        this.engineName = engineName;
        this.vendor = vendor;
        this.doorCount = doorCount;
        this.setTyreCount(tyreCount);
    }

    public Integer getTyreCount() {
        return tyreCount;
    }

    public void setTyreCount(Integer tyreCount) {
        this.tyreCount = tyreCount;
        this.hasExtraWheel = !(tyreCount > 0 && tyreCount <= 4);
    }

    public Boolean getHasExtraWheel() {
        return hasExtraWheel;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getVendor() {
        return vendor;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyreCount=" + tyreCount +
                ", engineName='" + engineName + '\'' +
                ", vendor='" + vendor + '\'' +
                ", doorCount=" + doorCount +
                ", hasExtraWheel=" + hasExtraWheel +
                '}';
    }
}
