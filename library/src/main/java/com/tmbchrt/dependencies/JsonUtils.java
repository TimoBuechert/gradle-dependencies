package com.tmbchrt.dependencies;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;


public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static JsonNode parseJsonFailsafe(final String jsonString) {
        if(!StringUtils.isEmpty(jsonString)){
            try {
                return OBJECT_MAPPER.readTree(jsonString);
            } catch (final JsonProcessingException ignored) {}
        }
        return OBJECT_MAPPER.createObjectNode();
    }
}
