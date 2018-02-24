package org.djorquera.cloud.eventsourcinghandler.web;

import org.djorquera.cloud.eventsourcinghandler.dto.ResponseEventDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/events")
public class EventSourcingController {

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@RequestParam(name = "name") String name) {
        return ResponseEntity.ok("Hello "+name);
    }
}
