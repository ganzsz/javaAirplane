public class Engine extends AirplanePart{
    public Engine(int number) {super(number, PartType.ENGINE); }

    public void calculate() throws EngineException{
        if(Math.random()<=0.001) {
            throw new EngineException(this.number);
        }
    }
}
