package Day25;
import java.util.*;
public class InsertDeleteGetRandom_380 {
	List<Integer> res;
    public void RandomizedSet() {

        res = new ArrayList<>();
    }


    public boolean insert(int val) {

        if (res.contains(val)) {
            return false;
        }

        res.add(val);

        return true;
    }


    public boolean remove(int val) {

        if (res.contains(val)) {

            res.remove(Integer.valueOf(val));
            return true;
        }

        return false;
    }


    public int getRandom() {

        int randomIndex = (int) (Math.random() * res.size());

        return res.get(randomIndex);

    }
}
}
