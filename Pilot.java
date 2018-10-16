public class Pilot extends AirplanePart{

    public Pilot(int number) {
        super(number,PartType.PILOT);
    }

    public void calculate() throws PilotException{
        if(Math.random()<=0.005) {
            throw new PilotException(this.number);
        }
    }
}
