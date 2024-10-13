package flower.store;

// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
// @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count) {
        this.flower = new Flower(flower);
        this.count = count;

    }

    public double getPrice() {
        return flower.getPrice() * count;
    }

    
    public boolean match(FlowerPack fp) {
        return this.count == fp.count && this.flower.match(fp.flower);
    }
    @Override
    public String toString() {
        return "FlowerPack" + " " + this.getPrice() + " " + this.count;
    }

}