public class MainApplication {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 100000);
        Integer result = simulation.rollAndSumTosses();
        System.out.println(result);
    }
}
