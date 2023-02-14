package com.tmbchrt.dependencies.consumer;

import com.fasterxml.jackson.databind.JsonNode;
import com.tmbchrt.dependencies.*;

public class Consumer {

    public static void main(String[] args) {
        final JsonNode jsonNode = JsonUtils.parseJsonFailsafe("{\"id\":1}");
        System.out.println(jsonNode.toPrettyString());
    }
}


