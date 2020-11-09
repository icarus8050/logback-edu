package com.example.logbackedu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final Logger logger = LoggerFactory.getLogger(FooController.class);

    @GetMapping(value = "/foo")
    @ResponseBody
    public String foo() {
        logger.error("foo error");
        logger.warn("foo warn");
        logger.info("foo info");
        logger.debug("foo debug");
        logger.trace("foo trace");
        return "foo";
    }
}
