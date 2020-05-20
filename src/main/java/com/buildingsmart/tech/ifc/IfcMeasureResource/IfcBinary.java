package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcBinary implements IfcSimpleValue {

    @DataMember(Order = 0)
    /*@JacksonXmlProperty(isAttribute = true, localName = "value")*/
    @JsonIgnore
    private Byte[] bytes = null;

    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private String value = null;

    public IfcBinary()
    {
    }

    public IfcBinary(String value, Byte[] bytes)
    {
        this.bytes = bytes;
        this.value = value;
    }

    public Byte[] getBytes() {
        return this.bytes;
    }

    public void setBytes(Byte[] bytes) {
        this.bytes = bytes;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
