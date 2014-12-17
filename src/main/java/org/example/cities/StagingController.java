package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
        String timestamp = System.getProperty("started.at.timestamp");
        return "Application was staged with even more changes but apparently no timestamp at: " + timestamp;
    }
}
