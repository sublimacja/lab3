package com.example.lab3.controller;


import com.example.lab3.service.ApiService;
import lombok.RequiredArgsConstructor;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ppkwu")
@RequiredArgsConstructor
public class ApiController {
    private final ApiService apiService;

    @GetMapping("/lab3/{string}/json")
    public String formatResponseJson(@PathVariable("string") String string) {
        return apiService.formatResponseJson(string);
    }

    @GetMapping(value = "/lab3/{string}/xml", produces = {"application/xml", "text/xml"})
    public String formatResponseXml(@PathVariable("string") String string) {
        return apiService.formatResponseXml(string);
    }

    @GetMapping("/lab3/{string}/csv")
    public String formatResponseCsv(@PathVariable("string") String string) throws JSONException {
        return apiService.formatResponseCsv(string);
    }

    @GetMapping("/lab3/{string}/txt")
    public String formatResponseTxt(@PathVariable("string") String string) throws JSONException {
        return apiService.formatResponseTxt(string);
    }
}
