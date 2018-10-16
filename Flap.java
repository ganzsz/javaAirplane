public class Flap extends AirplanePart{

    public Flap(int number) {
        super(number, PartType.FLAP);
    }

    public void calculate() throws FlapException {
        if(Math.random()<=0.0005) {
            throw new FlapException(this.number);
        }
    }
}
