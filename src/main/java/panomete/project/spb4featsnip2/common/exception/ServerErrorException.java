package panomete.project.spb4featsnip2.common.exception;

public class ServerErrorException extends RuntimeException {
    private String message;
    public ServerErrorException(String message) {
        super(message);
        this.message = message;
    }

    public ServerErrorException() {}
}