package edu.eci.arep.mathservices.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MathService {

    public List<String> factors(int value) {
        List<String> response = new ArrayList<>();

        if(value == 1){
            response.add("1");
            return response;
        }

        response.add("1");
        int size = value/2;
        for (int i = 2; i < size+1; i++) {
            if (value%i==0){
                response.add(String.valueOf(i));
            }
        }
        response.add(String.valueOf(value));
        return response;
    }

    public List<String> primes(int value) {
        List<String> primes = new ArrayList<>();

        for (int i = 2; i < value; i++) {
            if (factors(i).size()==2){
                primes.add(String.valueOf(i));
            }
        }
        return primes;
    }
}
