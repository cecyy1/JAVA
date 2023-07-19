package Project_4;

public class XWing {
    private int numOfWings;
    private int numOfDroids;

    public XWing() {
        numOfWings = 4;
        numOfDroids = 0;
    }

    public XWing(int numWings, int numDroids) throws WrongNumberOfWings, WrongNumberOfDroids {
        if(numWings != 4) {
            throw new WrongNumberOfWings("Wrong number of wings");
        }
        if(numDroids < 0 || numDroids > 2) {
            throw new WrongNumberOfDroids("Wrong number of droids");
        }
        this.numOfWings = numWings;
        this.numOfDroids = numDroids;
    }

    public int getNumWings() {
        return numOfWings;
    }

    public void setNumWings(int numWings) throws WrongNumberOfWings {
        if(numWings != 4) {
            throw new WrongNumberOfWings("Wrong number of wings");
        }
        this.numOfWings = numWings;
    }

    public int getNumDroids() {
        return numOfDroids;
    }

    public void setNumDroids(int numDroids) throws WrongNumberOfDroids {
        if(numDroids < 0 || numDroids > 2) {
            throw new WrongNumberOfDroids("Wrong number of droids");
        }
        this.numOfDroids = numDroids;
    }

}
