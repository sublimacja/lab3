package com.example.lab3.service;


import com.example.lab3.StringHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
public class ApiService {

    private static final String URI = "http://localhost:8080/api/ppkwu/lab2/string/";

    public String formatResponseJson(String string) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URI + string, String.class);
        String[] str = cutString(result);
        HashMap<String, String> map = new HashMap<>();
        map.put(str[0].replaceAll(":", ""), str[1]);
        map.put(str[2].replaceAll(":", ""), str[3]);
        map.put(str[4].replaceAll(":", ""), str[5]);
        map.put(str[6].replaceAll(":", ""), str[7]);
        map.put(str[8].replaceAll(":", ""), str[9]);
        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public StringHelper formatResponseXml(String string) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URI + string, String.class);
        String[] str = cutString(result);
        return new StringHelper(str[1], str[3], str[5], str[7], str[9]);
    }

    public String formatResponseCsv(String string) throws JSONException {

        String result = formatResponseJson(string);
        result = "{\"csv\":[" + result + "]}";
        JSONObject json = new JSONObject(result);
        JSONArray jsonArray = json.getJSONArray("csv");
        result = CDL.toString(jsonArray);
        return result;
    }

    public String formatResponseTxt(String string) throws JSONException {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URI + string, String.class);
    }

    private String[] cutString(String result) {
        return result.split("\\s+");
    }
}
