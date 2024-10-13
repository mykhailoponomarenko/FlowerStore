package flower.store;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setPrice(100);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(flower, 5);
        flowerBucket.addFlowerPack(flowerPack);
        FlowerPack flowerPack2 = new FlowerPack(flower, 10);
        flowerBucket.addFlowerPack(flowerPack2);
        System.out.println(flowerBucket.getPrice());
        flower.setPrice(10);
        System.out.println(flowerBucket.getPrice());
        ArrayList<FlowerPack> arr = new ArrayList<FlowerPack>();
        arr.add(flowerPack2);
        arr.add(flowerPack);

        


        Store st = new Store(arr);
        Flower flower2 = new Flower();
        flower2.setPrice(100);
        flower2.setFlowerType(FlowerType.ROSE);
        FlowerPack flowerPack3 = new FlowerPack(flower2, 5);
        System.out.println(st.search(flowerPack3));

    }
}
