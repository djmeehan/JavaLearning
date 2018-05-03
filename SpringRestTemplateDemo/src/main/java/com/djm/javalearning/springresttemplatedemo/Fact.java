package com.djm.javalearning.springresttemplatedemo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {

    private String type;
    private FactValue value;

    public FactValue getValue() {
        return value;
    }

    public void setValue(FactValue value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return type + " " + value.getId();
    }

}
