package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testStore() {
        Flower flower = new Flower();
        flower.setPrice(100);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(flower, 5);
        flowerBucket.addFlowerPack(flowerPack);
        FlowerPack flowerPack2 = new FlowerPack(flower, 10);
        ArrayList<FlowerPack> arr = new ArrayList<FlowerPack>();
        arr.add(flowerPack2);
        arr.add(flowerPack);
        Store st = new Store(arr);
        Flower flower2 = new Flower();
        flower2.setPrice(100);
        flower2.setFlowerType(FlowerType.ROSE);
        FlowerPack flowerPack3 = new FlowerPack(flower2, 5);
        ArrayList<FlowerPack> res = st.search(flowerPack3);
        ArrayList<FlowerPack> arr2 = new ArrayList<FlowerPack>();
        arr2.add(flowerPack);
        Assertions.assertEquals(res, arr2);

    }

}
