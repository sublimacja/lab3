package com.example.lab3;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@XmlRootElement(name = "StringHelper", namespace = "StringHelper")
@JsonPropertyOrder({"upperCounter", "lowerCounter", "digitCounter", "specialCounter", "ownCombinationCounter"})
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
