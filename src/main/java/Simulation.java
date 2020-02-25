public class Simulation {
    private Dice dice;
    private Integer numberOfTosses;

    public Simulation(Integer numberOfDie, Integer numberOfTosses) {
        this.dice = new Dice(numberOfDie, 6);
        this.numberOfTosses = numberOfTosses;
    }

    public Integer rollAndSumTosses() {
        Integer sum = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            int result  = dice.rollAndSum();
            sum += result;
        }
        return sum;
    }
}
