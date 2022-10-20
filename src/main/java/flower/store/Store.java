package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public void add(FlowerBucket flowerBucket) { 
        flowerBuckets.add(flowerBucket); 
    }

    public boolean search(FlowerBucket flowerBucket) {
        for (FlowerBucket flowerBucketN:flowerBuckets) {
            if (flowerBucketN.toString().equals(flowerBucket.toString())) {
                return true;
            }
        }
       return false;
    }
}
