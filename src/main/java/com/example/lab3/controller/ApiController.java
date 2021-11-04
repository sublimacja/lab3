package com.example.lab3.controller;

import com.example.lab3.StringHelper;
import com.example.lab3.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/ppkwu")
@RequiredArgsConstructor
public class ApiController {
    private final ApiService apiService;

    @GetMapping("/lab3/{string}/json")
    public Map<String, String> formatResponseJson(@PathVariable("string") String string) {
        return apiService.formatResponseJson(string);
    }

    @GetMapping("/lab3/{string}/xml")
    public Object formatResponseXml(@PathVariable("string") String string) {
        return apiService.formatResponseJson(string);
    }

    @GetMapping("/lab3/{string}/csv")
    public Object formatResponseCsv(@PathVariable("string") String string) {
        return apiService.formatResponseJson(string);
    }
}
