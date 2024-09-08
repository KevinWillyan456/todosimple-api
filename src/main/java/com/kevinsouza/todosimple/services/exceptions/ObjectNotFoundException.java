package com.kevinsouza.todosimple.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.persistence.EntityNotFoundException;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@SuppressWarnings("serial")
public class ObjectNotFoundException extends EntityNotFoundException {
	public ObjectNotFoundException(String message) {
		super(message);
	}
}
