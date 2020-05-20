package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcSimpleValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcTimeStamp implements IfcSimpleValue {
    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private Integer value = null;

    public IfcTimeStamp()
    {
    }

    public IfcTimeStamp(Integer value)
    {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
