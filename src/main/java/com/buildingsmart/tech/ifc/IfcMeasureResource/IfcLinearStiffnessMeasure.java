package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcTranslationalStiffnessSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcLinearStiffnessMeasure implements IfcTranslationalStiffnessSelect, IfcDerivedMeasureValue {
    @DataMember(Order = 0)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private double value;

    public IfcLinearStiffnessMeasure() {
    }

    public IfcLinearStiffnessMeasure(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
