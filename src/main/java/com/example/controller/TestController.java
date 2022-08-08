package com.example.controller;

import com.example.entity.MultiplyMessage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE)
    public Map hello() {
        return Collections.singletonMap("message", "Hello World");
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE)
    public Map multiply(@RequestBody MultiplyMessage message) {
        return Collections.singletonMap("result", message.getValue() * 5);
    }

}
