package com.example.demojpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Canción no encontrada")
public class SongNotFoundException extends RuntimeException {
}
