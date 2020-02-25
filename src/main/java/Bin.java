public class Bin {
    private Integer numberOfOccurrences;
    private Integer faceValue;

    public Bin(Integer numberOfOccurrences, Integer faceValue) {
        this.numberOfOccurrences = numberOfOccurrences;
        this.faceValue = faceValue;
    }

    public Integer getNumberOfOccurrences() {
        return numberOfOccurrences;
    }

    public void setNumberOfOccurrences(Integer numberOfOccurrences) {
        this.numberOfOccurrences = numberOfOccurrences;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }

    public void increment() {
        setNumberOfOccurrences(getNumberOfOccurrences()+1);
    }
}
