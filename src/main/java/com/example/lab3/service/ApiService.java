package com.example.lab3.service;

import com.example.lab3.StringHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ApiService {

    private static final String URI = "http://localhost:8080/api/ppkwu/lab2/string/";

    public Map<String, String> formatResponseJson(String string) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URI + string, String.class);
        String[] str = cutString(result);
        HashMap<String, String> map = new HashMap<>();
        map.put(str[0], str[1]);
        map.put(str[2], str[3]);
        map.put(str[4], str[5]);
        map.put(str[6], str[7]);
        map.put(str[8], str[9]);
        return map;

    }

    private String[] cutString(String result) {
        return result.split("\\s+");
    }


}
