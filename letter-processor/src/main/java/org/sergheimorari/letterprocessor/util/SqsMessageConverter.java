package org.sergheimorari.letterprocessor.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.awspring.cloud.sqs.support.converter.SqsMessagingMessageConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SqsMessageConverter extends SqsMessagingMessageConverter {
    private final ObjectMapper objectMapper;


}
