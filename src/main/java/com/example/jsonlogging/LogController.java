package com.example.jsonlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

@RestController
public class LogController {

    private static Logger LOGGER = LoggerFactory.getLogger(LoggerFactory.class);

    @GetMapping("/log")
    public String justLog() {
        LOGGER.error("Error Log");
        return "I Logged";
    }
}
