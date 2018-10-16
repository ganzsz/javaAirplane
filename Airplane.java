import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private List<AirplanePart> parts = new ArrayList<>();
    private List<AirplanePart> failedParts = new ArrayList<>();

    private int flightNumber;

    public Airplane(int flightNumber) {
        this.flightNumber = flightNumber;
        this.parts.add(new Flap(1));
        this.parts.add(new Flap(2));
        this.parts.add(new Pilot(1));
        this.parts.add(new Pilot(2));
        this.parts.add(new Pilot(3));
        this.parts.add(new Engine(1));
        this.parts.add(new Engine(2));
        this.parts.add(new Engine(3));
        this.parts.add(new Engine(4));
    }

    public void flight() throws CrashException {
        int failedFlaps = 0;
        int failedPilots = 0;
        int failedInnerEngines = 0;
        int failedOuterEngines = 0;
        for (AirplanePart item:parts) {
            try{
                item.calculate();
            }catch(PartException e){
                e.printStackTrace();
                this.failedParts.add(item);
                switch(e.partType) {
                    case ENGINE:
                        if(e.number == 1 || e.number == 4)
                            failedOuterEngines++;
                        else
                            failedInnerEngines++;
                        break;
                    case FLAP:
                        failedFlaps++;
                        break;
                    case PILOT:
                        failedPilots++;
                        break;
                }
            }
        }
        if(failedInnerEngines+failedOuterEngines >= 3) {
            if(failedInnerEngines>=2)
                throw new CrashException(flightNumber, "Engines failed");
        }

        if(failedFlaps>=2) {
            throw new CrashException(flightNumber, "Flaps failed");
        }


        if(failedPilots>=3) {
            throw new CrashException(flightNumber, "Pilots died");
        }
    }

    public List<AirplanePart> getFailedParts() {
        return failedParts;
    }
}
