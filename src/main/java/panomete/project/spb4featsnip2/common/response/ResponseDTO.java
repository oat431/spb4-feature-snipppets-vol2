package panomete.project.spb4featsnip2.common.response;

public record ResponseDTO<T>(
        T Data,
        ResponseDTOStatus Status,
        ResponseDTOError Error
) { }
