public abstract class AirplanePart {

    public int number;
    private PartType partType;

    public AirplanePart(int number, PartType partType) {
        this.number = number;
        this.partType = partType;
    }

    abstract void calculate() throws PartException;

    public enum PartType {
        ENGINE, FLAP, PILOT, TERRORIST
    }

    public PartType getPartType() {
        return this.partType;
    }
}
