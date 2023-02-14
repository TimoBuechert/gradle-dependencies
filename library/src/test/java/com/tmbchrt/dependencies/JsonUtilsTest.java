package com.tmbchrt.dependencies;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonUtilsTest {

    @Test
    public void testParseJson() throws Exception {
        JsonNode jsonNode = JsonUtils.parseJsonFailsafe("{\"id\":1}");
        assertEquals(1, jsonNode.get("id").asInt());
    }

    @Test
    public void testParseJsonWrong() throws Exception {
        JsonNode jsonNode = JsonUtils.parseJsonFailsafe("blabla");
        assertNotNull(jsonNode);
    }

}