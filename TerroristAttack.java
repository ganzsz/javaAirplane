public class TerroristAttack extends AirplanePart {

    public TerroristAttack() {
        super(0, TERRORIST);
    }

    @Override
    void calculate() throws TerroristException {
        if(Math.random()<=0.000001) {
            throw new TerroristException();
        }
    }
}
