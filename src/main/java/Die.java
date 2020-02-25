import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private Integer numberOfFaces;
    private Integer currentFaceValue;

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public void roll() {
        this.currentFaceValue = ThreadLocalRandom.current().nextInt(0, numberOfFaces);
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;
    }

    public Integer getNumberOfFaces() {
        return numberOfFaces;
    }
}
