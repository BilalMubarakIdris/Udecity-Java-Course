public class Rocket implements SpaceShip{
    int cost;
    int weight;
    int maxWeight;
    int currWeight;
    double explosionChance;
    double landingChance;

    /*
    Rocket(){
        cost = cost;
        weight = weight;
        maxWeight = maxWeight;
        explosionChance= explosionChance;
        landingChance = landingChance;
    }*/

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return currWeight + weight < maxWeight;
    }

    @Override
    public void carry(Item item) {
        currWeight += item.weight;
    }
}
