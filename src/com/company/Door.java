package com.company;

public class Door {

    private String manufacturer;
    private Quality quality;

    public Door() {
    }

    public Door(String manufacturer, Quality quality) {
        this.manufacturer = manufacturer;
        this.quality = quality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        if (manufacturer != null ? !manufacturer.equals(door.manufacturer) : door.manufacturer != null) return false;
        return quality == door.quality;
    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Door{" +
                "manufacturer='" + manufacturer + '\'' +
                ", quality=" + quality +
                '}';
    }
}
