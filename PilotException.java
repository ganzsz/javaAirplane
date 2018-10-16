public class PilotException extends PartException {
    public PilotException(int number){
        super(number);
        this.partType = PartType.PILOT;
    }
}