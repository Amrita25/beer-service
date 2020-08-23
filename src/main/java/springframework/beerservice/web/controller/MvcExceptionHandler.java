package springframework.beerservice.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MvcExceptionHandler {
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
		System.out.println("inside validation error handler");
		List<String> errors = new ArrayList();
		for(ConstraintViolation cons : e.getConstraintViolations()){
			errors.add( cons.getPropertyPath()+" : "+cons.toString());
		}
		return new ResponseEntity<List>(errors,HttpStatus.BAD_REQUEST);
	}

}
