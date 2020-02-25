import java.util.ArrayList;
import java.util.List;

public class Dice {
    private List<Die> dieList;

    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.dieList = new ArrayList<>();
        for (int i = 0; i < numberOfDie; i++) {
            Die die = new Die(numberOfFaces);
            dieList.add(die);
        }
    }

    public Integer rollAndSum() {
        Integer sum = 0;
        for(Die die : this.dieList) {
            die.roll();
            Integer valueToAdd = die.getCurrentFaceValue();
            sum += valueToAdd;
        }
        return sum;
    }
}
