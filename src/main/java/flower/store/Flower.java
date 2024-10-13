package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Flower {
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }


    public String getColor() {
        return color.getStringRepresentation();
    }


    
    public boolean match(Flower f) {
        return this.price == f.getPrice()
                && this.flowerType.equals(f.getFlowerType()) &&
                this.getSepalLength() == f.getSepalLength();
    }


    
}

