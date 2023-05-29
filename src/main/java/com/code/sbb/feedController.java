package com.code.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class feedController {
    @GetMapping("/feed")
    public String feed() {
        return "feed.html";
    }
}