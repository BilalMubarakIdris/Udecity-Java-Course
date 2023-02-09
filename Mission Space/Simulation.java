import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems (String file) throws  Exception{
        File fileStr = new File(file);
        Scanner input = new Scanner(fileStr);
        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        while(input.hasNext()){
            String[] temp = input.nextLine().split("=");
            Item item = new Item(temp[0], Integer.parseInt(temp[1]));
            itemArrayList.add(item);
        }
        input.close();
        return itemArrayList;
    }

    ArrayList<Rocket> loadU1 (ArrayList<Item> itemArrayList) {
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        Rocket u1Rocket = new U1();
        for (Item item : itemArrayList.toArray(new Item[1])) {
            if (u1Rocket.canCarry(item)) {
                u1Rocket.carry(item);
            } else {
                u1Rockets.add(u1Rocket);
                u1Rocket = new U1();
                u1Rocket.carry(item);
            }
        }
        if (itemArrayList.size() != 0) {
            u1Rockets.add(u1Rocket);
        }
        return  u1Rockets;
    }

    ArrayList<Rocket> loadU2 (ArrayList<Item> itemArrayList) {
        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        Rocket u2Rocket = new U2();
        for (Item item : itemArrayList.toArray(new Item[1])) {
            if (u2Rocket.canCarry(item)) {
                u2Rocket.carry(item);
            } else {
                u2Rockets.add(u2Rocket);
                u2Rocket = new U1();
                u2Rocket.carry(item);
            }
        }
        if (itemArrayList.size() != 0) {
            u2Rockets.add(u2Rocket);
        }
        return  u2Rockets;
    }

    int runSimulation (ArrayList<Rocket> rocketArrayList){
        int budget = 0;
        for(Rocket rocket: rocketArrayList){
            if(!(rocket.land() || rocket.launch())){
                budget += rocket.cost;
            } else{
                break;
            }
        }
        return budget;
    }

}
