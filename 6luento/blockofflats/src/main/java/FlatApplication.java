/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author test_programmer
 */
public class FlatApplication {

    public static void main(String[] args) {

        BlockOfFlats blockOfFlats = BlockOfFlats.createBlockOfFlatsWithApartments(4);

        Apartment liisanHuoneisto = blockOfFlats.getApartments().get(0);
        liisanHuoneisto.setFloor(3);
        liisanHuoneisto.setOwner("Liisa Nieminen");
        
        
        Room livingRoom = new Room();
        livingRoom.setWidth(3.8d);
        livingRoom.setLength(2.6d);
        livingRoom.setDescription("Juhan Olkkari");
        
        blockOfFlats.getApartments().get(1).addRoom(livingRoom);
        
        Room kitchen = new Room();
        kitchen.setWidth(1.8d);
        kitchen.setLength(2.1d);
        kitchen.setDescription("Liisan keittiö");
        
        liisanHuoneisto.addRoom(kitchen);
        
        System.out.println(blockOfFlats.toString());
    }

}

