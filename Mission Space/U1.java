import java.util.ArrayList;

public class U1 extends Rocket{
    ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();

    U1(){
        this.currWeight = 0;
        this.cost = 1000000;
        this.weight = 10;
        this.maxWeight = 18;
    }

    @Override
    public boolean land() {
        landingChance = weight + currWeight / maxWeight;
        return Math.random() > 0.01 * landingChance;
    }

    @Override
    public boolean launch() {
        explosionChance = weight + currWeight / maxWeight;
        return Math.random() > 0.05 * explosionChance;
    }
}