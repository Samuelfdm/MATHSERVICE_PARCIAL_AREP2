package edu.eci.arep.mathservices.controller;

import edu.eci.arep.mathservices.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/")
public class MathController {

    MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("factors")
    public ResponseEntity<?> factors(@RequestParam("value") String value) {
        int valueInt = Integer.parseInt(value);
        List<String> response = mathService.factors(valueInt);
        System.out.println("RESPUESTA FACTORS: "+response);
        Map jsonResponse = new HashMap<>();
        jsonResponse.put("operation", "factors");
        jsonResponse.put("input", value);
        jsonResponse.put("output", String.valueOf(response));
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    @GetMapping("primes")
    public ResponseEntity<?> primes(@RequestParam("value") String value) {
        int valueInt = Integer.parseInt(value);
        List<String> response = mathService.primes(valueInt);
        System.out.println("RESPUESTA PRIMES: "+response);
        Map jsonResponse = new HashMap<>();
        jsonResponse.put("operation", "primes");
        jsonResponse.put("input", value);
        jsonResponse.put("output", String.valueOf(response));
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}