package de.livia.mwstrechner.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles the users request on calculating the VAT (MwST) of a value
 */
@RestController
@RequestMapping(value = "/api/rest")
public class MwstRechnerRestController {

    //Link: http://localhost:8282/api/rest/mwst?betrag=10.00

    /**
     * Calculates the VAT (MwST) of a value entered by the user
     * @param betrag value
     * @return VAT
     */
    @RequestMapping(value = "/mwst")
    public double berechneMwst(@RequestParam(name = "betrag", required = true) double betrag) {
        return betrag * 0.19;
    }
}
