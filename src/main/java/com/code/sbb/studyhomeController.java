package com.code.sbb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studyhomeController {
    @GetMapping("/studyfeed")
    public String studyfeed() {
        return "studyfeed.html";
    }
}