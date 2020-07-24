package dev.com.andre.restapi.domain.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {

    private String from;
    private String to;
    private String subject;
    private String template;
    private Map<String, Object> data;

}