public class Recorder {
    public void simulate() {
        int failedFlights = 0;
        for(int i=0; i<1000000; i++) {
            Airplane flight = new Airplane(i);
            try {
                flight.flight();
            } catch (CrashException e) {
                e.printStackTrace();
                failedFlights++;
            }
            updateFailedParts(flight);
        }
        System.out.println("Engine 1 failed "+this.failedEngineOne+" times");
        System.out.println("Engine 2 failed "+this.failedEngineTwo+" times");
        System.out.println("Engine 3 failed "+this.failedEngineThree+" times");
        System.out.println("Engine 4 failed "+this.failedEngineFour+" times");
        System.out.println("Flap   1 failed "+this.failedFlapOne+" times");
        System.out.println("Flap   2 failed "+this.failedFlapTwo+" times");
        System.out.println("Pilot  1 failed "+this.failedPilotOne+" times");
        System.out.println("Pilot  2 failed "+this.failedPilotTwo+" times");
        System.out.println("Pilot  3 failed "+this.failedPilotThree+" times");
        System.out.println("In total "+failedFlights+" flights crashed");
    }

    private int failedEngineOne   = 0;
    private int failedEngineTwo   = 0;
    private int failedEngineThree = 0;
    private int failedEngineFour  = 0;

    private int failedFlapOne = 0;
    private int failedFlapTwo = 0;

    private int failedPilotOne   = 0;
    private int failedPilotTwo   = 0;
    private int failedPilotThree = 0;

    private void updateFailedParts(Airplane plane) {
        for(AirplanePart part:plane.getFailedParts()) {
            if(part.getPartType() == AirplanePart.PartType.ENGINE) {
                switch (part.number) {
                    case 1:
                        this.failedEngineOne++;
                        break;
                    case 2:
                        this.failedEngineTwo++;
                        break;
                    case 3:
                        this.failedEngineThree++;
                        break;
                    case 4:
                        this.failedEngineFour++;
                        break;
                }
            }else if(part.getPartType() == AirplanePart.PartType.PILOT) {
                switch (part.number) {
                    case 1:
                        this.failedPilotOne++;
                        break;
                    case 2:
                        this.failedPilotTwo++;
                        break;
                    case 3:
                        this.failedPilotThree++;
                        break;
                }
            }else if(part.getPartType() == AirplanePart.PartType.FLAP) {
                switch (part.number) {
                    case 1:
                        this.failedFlapOne++;
                        break;
                    case 2:
                        this.failedFlapTwo++;
                        break;
                }
            }
        }
    }
    private Airplane[] makePlanes(int amount) {
        return new Airplane[amount];
    }
}
