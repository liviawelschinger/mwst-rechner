package de.livia.mwstrechner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Prepares the map model
 */
@Controller
public class MwstRechnerController {

    // Link: http://localhost:8282/mwst

    /**
     * Gets the template mwstrechner.html
     * @return
     */
    @RequestMapping(value = "/mwst", method = RequestMethod.GET)
    public String mwst() {
        return "mwstrechner";
    }
}
