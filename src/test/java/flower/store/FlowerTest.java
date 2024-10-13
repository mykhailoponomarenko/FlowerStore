package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    final private int a = 100;
    private final int max_price = a;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(max_price);
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
        final int num = 100;
        flower.setPrice(num);
        flower.setFlowerType(FlowerType.ROSE);

        FlowerBucket flowerBucket = new FlowerBucket();
        final int i = 5;
        FlowerPack flowerPack = new FlowerPack(flower, i);
        flowerBucket.addFlowerPack(flowerPack);
        final int j = 10;
        FlowerPack rosePack = new FlowerPack(flower, j);
        ArrayList<FlowerPack> arr = new ArrayList<FlowerPack>();
        arr.add(rosePack);
        arr.add(flowerPack);
        Store st = new Store(arr);
        Flower rose = new Flower();
        rose.setPrice(num);
        rose.setFlowerType(FlowerType.ROSE);
        FlowerPack tulipPack = new FlowerPack(rose, i);
        ArrayList<FlowerPack> res = st.search(tulipPack);
        ArrayList<FlowerPack> arrr = new ArrayList<FlowerPack>();
        arrr.add(flowerPack);
        Assertions.assertEquals(res, arrr);

    }

}
