public class CrashException extends Exception {
    public CrashException(int flightNumber, String message) {
        super("flight "+flightNumber+" crashed: "+message);
    }
}
