package org.sergheimorari.letterprocessor.exceptionhandling;

import java.util.List;

public record ErrorResponse(String message, List<String> details) {}
