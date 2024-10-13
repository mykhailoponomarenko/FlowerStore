package flower.store;

import java.util.ArrayList;

public class Store {
    public static ArrayList<FlowerPack> inventory;

    public Store(ArrayList<FlowerPack> lst) {
        this.inventory = lst;
    }

    // @Override
    public static void append(FlowerPack pack) {
        inventory.add(0, pack);
    }

    public ArrayList<FlowerPack> search(FlowerPack pack) {
        ArrayList<FlowerPack> matched = new ArrayList<FlowerPack>();
        for (FlowerPack p : inventory) {
            if (p.match(pack)) {
                matched.add(p);
            }
        }
        return matched;
    }

}
