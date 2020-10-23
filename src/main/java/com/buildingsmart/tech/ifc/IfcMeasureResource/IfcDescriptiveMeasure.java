package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSizeSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcDescriptiveMeasure implements IfcDerivedMeasureValue, IfcSizeSelect {
    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value = null;

    public IfcDescriptiveMeasure()
    {
    }

    public IfcDescriptiveMeasure(String value)
    {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
