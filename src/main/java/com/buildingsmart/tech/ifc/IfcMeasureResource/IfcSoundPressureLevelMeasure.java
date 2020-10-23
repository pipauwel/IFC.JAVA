package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcSoundPressureLevelMeasure implements IfcDerivedMeasureValue {
    @DataMember(Order = 0)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private Double value;

    public IfcSoundPressureLevelMeasure() {
    }

    public IfcSoundPressureLevelMeasure(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
