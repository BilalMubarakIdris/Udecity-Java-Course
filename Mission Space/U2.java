import java.util.ArrayList;

public class U2 extends Rocket{
    ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();
    U2(){
        this.currWeight = 0;
        this.cost = 120000000;
        this.weight = 18;
        this.maxWeight = 29;
    }

    @Override
    public boolean land() {
        landingChance = weight + currWeight / maxWeight;
        return Math.random() > 0.08 * landingChance;
    }

    @Override
    public boolean launch() {
        explosionChance = weight + currWeight / maxWeight;
        return Math.random() > 0.04 * explosionChance;
    }
}