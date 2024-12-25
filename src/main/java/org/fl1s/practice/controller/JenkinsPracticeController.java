package org.fl1s.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinsPracticeController {
    @GetMapping()
    public String welcome() {
        return "welcome";
    }
}
