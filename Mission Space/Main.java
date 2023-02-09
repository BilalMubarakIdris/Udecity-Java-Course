import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception{
    Simulation test = new Simulation();
    ArrayList<Item> bigList = new ArrayList<Item>();
    ArrayList<Item> testPhase1 = test.loadItems("Phase-1.txt");
    ArrayList<Item> testPhase2 = test.loadItems("Phase-2.txt");
    for(Item item: testPhase1.toArray(new Item[1])){
        bigList.add(item);
    }
    for(Item item: testPhase2.toArray(new Item[1])){
        bigList.add(item);
    }

    U1 u1Rocket = new U1();
    u1Rocket.u1Rockets = test.loadU1(bigList);
    U2 u2Rocket = new U2();
    u2Rocket.u2Rockets = test.loadU2(bigList);
    int budgetU1 = test.runSimulation(test.loadU1(bigList));
    int budgetU2 = test.runSimulation(test.loadU1(bigList));
    System.out.println("Budget for U1 rockets: $" + budgetU1);
    System.out.println("Budget for U2 rockets: $" + budgetU2);
    if(budgetU1 < budgetU2){
        System.out.println("Use U1 rockets.");
    } else if (budgetU2 < budgetU1) {
        System.out.println("Use U2 rockets.");
    } else {
        System.out.println("Use either one, they cost the same.");
    }

    }
}
