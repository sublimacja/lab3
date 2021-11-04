package com.example.lab3;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@JsonPropertyOrder({"upperCounter", "lowerCounter", "digitCounter", "specialCounter", "ownCombinationCounter"})
@Getter
@Setter
@AllArgsConstructor
public class StringHelper {
    @XmlElement
    private String upperCounter;
    @XmlElement
    private String lowerCounter;
    @XmlElement
    private String digitCounter;
    @XmlElement
    private String specialCounter;
    @XmlElement
    private String ownCombinationCounter;
}
