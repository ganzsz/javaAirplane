public class EngineException extends PartException {
    public EngineException(int number){
        super(number);
        this.partType = PartType.ENGINE;
    }
}
