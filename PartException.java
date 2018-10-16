public abstract class PartException extends Exception {
    public PartType partType;
    public int number;

    public enum PartType {
        ENGINE, FLAP, PILOT, TERRORIST
    }

    public PartException(int number) {
        super("number "+number+" failed");
        this.number = number;
    }
}
