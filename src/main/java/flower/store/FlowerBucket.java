package flower.store;

import java.util.ArrayList;
import java.util.List;
// cd
public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();


    public void add(FlowerPack flowerPack) { flowerPacks.add(flowerPack); }

    public int getPrice() {
        int price = 0;
        for (FlowerPack onePack : flowerPacks) {
            price += onePack.getPrice();
        }
        return price;
    }
}
