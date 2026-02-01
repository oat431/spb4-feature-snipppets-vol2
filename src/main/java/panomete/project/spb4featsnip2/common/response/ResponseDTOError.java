package panomete.project.spb4featsnip2.common.response;

public record ResponseDTOError(
        Integer httpCode,
        String errorCode,
        String message
) {
}
