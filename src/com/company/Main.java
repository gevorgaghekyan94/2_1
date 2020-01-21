package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        House house = new House();
        ArrayList<Door> houseDoors = new ArrayList<>();
        ArrayList<Window> houseWindows = new ArrayList<>();

        Door entranceDoor = new Door("Eurostan", Quality.HIGH);
        Door roomDoor = new Door("ValanProf", Quality.LOW);

        houseDoors.add(entranceDoor);
        houseDoors.add(roomDoor);

        Window windowOfRoom = new Window(3, Quality.MIDDLE);
        Window windowOfKitchen = new Window(2, Quality.MIDDLE);
        Window windowOfBathroom = new Window(1, Quality.HIGH);

        houseWindows.add(windowOfRoom);
        houseWindows.add(windowOfKitchen);
        houseWindows.add(windowOfBathroom);

        house.setDoors(houseDoors);
        house.setWindows(houseWindows);

        house.printQuantityOfDoors();
        house.printQuantityOfWindows();
        house.lockTheHouseByKey();

    }
}
