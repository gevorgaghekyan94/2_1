package com.company;

import java.util.ArrayList;

public class House {

    private ArrayList<Door> doors = new ArrayList<>();
    private ArrayList<Window> windows = new ArrayList<>();
    private boolean lock;

    public House() {
    }

    public House(ArrayList<Door> doors, ArrayList<Window> windows, boolean lock) {
        this.doors = doors;
        this.windows = windows;
        this.lock = lock;
    }

    public void lockTheHouseByKey() {
        if (lock) {
            this.lock = false;
        } else {
            this.lock = true;
        }
    }

    public void printQuantityOfDoors() {
        System.out.println("Number of doors in the house: " + this.doors.size());
    }

    public void printQuantityOfWindows() {
        System.out.println("Number of windows in the house: " + this.windows.size());
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (lock != house.lock) return false;
        if (doors != null ? !doors.equals(house.doors) : house.doors != null) return false;
        return windows != null ? windows.equals(house.windows) : house.windows == null;
    }

    @Override
    public int hashCode() {
        int result = doors != null ? doors.hashCode() : 0;
        result = 31 * result + (windows != null ? windows.hashCode() : 0);
        result = 31 * result + (lock ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors +
                ", windows=" + windows +
                ", lock=" + lock +
                '}';
    }
}
