package com.example.lab3;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement
@JsonPropertyOrder({"upperCounter", "lowerCounter", "digitCounter","specialCounter","ownCombinationCounter"})
@Getter
@Setter
@AllArgsConstructor
public class StringHelper {
    private  String upperCounter;
    private String lowerCounter;
    private String digitCounter;
    private String specialCounter;
    private String ownCombinationCounter;
}
