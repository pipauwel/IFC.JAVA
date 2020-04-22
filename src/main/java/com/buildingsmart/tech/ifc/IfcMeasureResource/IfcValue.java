// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f68c7711-a24f-4f76-9bad-5c2ae98a849b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcValue implements com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect {

    @Description("Self-made class to allow setting values to things (literals, data type values)")
    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "type")
    private String type = null;

    @Description("Self-made class to allow setting values to things (literals, data type values)")
    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = true, localName = "stringValue")
    private String stringValue = null;

    @Description("Self-made class to allow setting values to things (literals, data type values)")
    @DataMember(Order = 2)
    @JacksonXmlProperty(isAttribute = true, localName = "doubleValue")
    private Double doubleValue = null;

    @Description("Self-made class to allow setting values to things (literals, data type values)")
    @DataMember(Order = 3)
    @JacksonXmlProperty(isAttribute = true, localName = "intValue")
    private Integer intValue = null;

    @Description("Self-made class to allow setting values to things (literals, data type values)")
    @DataMember(Order = 4)
    @JacksonXmlProperty(isAttribute = true, localName = "booleanValue")
    private Boolean booleanValue = null;

    public IfcValue()
    {
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Integer getIntValue() {
        return this.intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}
