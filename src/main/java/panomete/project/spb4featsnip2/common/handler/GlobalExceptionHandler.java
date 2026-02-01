package panomete.project.spb4featsnip2.common.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import panomete.project.spb4featsnip2.common.constant.ErrorMessage;
import panomete.project.spb4featsnip2.common.exception.ServerErrorException;
import panomete.project.spb4featsnip2.common.response.ResponseDTO;
import panomete.project.spb4featsnip2.common.response.ResponseDTOError;
import panomete.project.spb4featsnip2.common.response.ResponseDTOStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ServerErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ResponseDTO<String>> handleServerError(ServerErrorException ex) {
        ResponseDTOError error = new ResponseDTOError(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "SERVER-ON-FIRE-500",
                ErrorMessage.SERVER_ERROR
        );
        ResponseDTO<String> response = new ResponseDTO<>(
                null,
                ResponseDTOStatus.ERROR,
                error
        );
        return ResponseEntity.status(500).body(response);
    }
}
