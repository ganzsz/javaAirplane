public class FlapException extends PartException {
    public FlapException(int number){
        super(number);
        this.partType = PartType.FLAP;
    }
}
