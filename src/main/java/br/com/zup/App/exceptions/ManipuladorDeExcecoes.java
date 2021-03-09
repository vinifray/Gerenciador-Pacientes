package br.com.zup.App.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ManipuladorDeExcecoes extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        List<ObjetoDeErro> objetosDeErro = getErros(ex);
        RespostaDeErro resErro = new RespostaDeErro("Validação", status.value(),
                status.getReasonPhrase(), objetosDeErro);

        return ResponseEntity.status(status).body(resErro);
    }

    private List<ObjetoDeErro> getErros(MethodArgumentNotValidException exception){
        List<ObjetoDeErro> objetosDeErro = new ArrayList<>();
        List<FieldError> errors = exception.getBindingResult().getFieldErrors();

        for (FieldError error : errors){
            ObjetoDeErro objetoDeErro = new ObjetoDeErro(error.getDefaultMessage(), error.getField());
            objetosDeErro.add(objetoDeErro);
        }


        /** List<ObjetoDeErro> objetosDeErro = exception.getBindingResult()
        /*        .getFieldErrors().stream()
        /*        .map(erro -> new ObjetoDeErro(erro.getDefaultMessage(), erro.getField()))
        /*        .collect(Collectors.toList());
         **/
        return objetosDeErro;
    }
}
