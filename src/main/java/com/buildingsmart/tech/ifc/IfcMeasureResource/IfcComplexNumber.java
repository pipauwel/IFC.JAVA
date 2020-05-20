package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcComplexNumber implements IfcMeasureValue {
    public IfcReal[] value;

    public IfcComplexNumber() {
    }

    public IfcReal[] getValue() {
        return this.value;
    }

    public void setValue(IfcReal[] value) {
        this.value = value;
    }
}
