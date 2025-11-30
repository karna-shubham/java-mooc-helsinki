import java.util.ArrayList;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    private int currentWeight() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}

