public class DateException extends RuntimeException {
    public DateException() {
        super("Invalid value of Date");
    }
    public DateException(String message) {
        super(message);
    }

}
