package Arc;

import Node.Place;

public class Arc implements IArc{

    private int weight;
    private Place place;

    public Arc(int weight, Place place) {
        this.weight = weight;
        this.place = place;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public Place getPlace() {
        return this.place;
    }
}
