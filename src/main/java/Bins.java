import java.util.List;

public class Bins {
    private List<Bin> binList;

    public void incrementBin(Integer faceValue) {
        Bin bin = findBin(faceValue);
        bin.increment();
    }

    public Bin findBin(Integer faceValue) {
        for(Bin bin : this.binList) {
            if(bin.getFaceValue().equals(faceValue)) {
                return bin;
            }
        }
        return null;
    }

}
