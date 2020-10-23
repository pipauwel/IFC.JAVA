package com.buildingsmart.tech.ifc.IfcHelperDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPositiveIntegerList {

    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = false, localName = "IfcPositiveInteger")
    @JacksonXmlElementWrapper(useWrapping = false, localName = "positiveIntegers")
    private List<IfcPositiveInteger> positiveIntegers = new ArrayList<IfcPositiveInteger>();

    public IfcPositiveIntegerList()
    {
    }

    public IfcPositiveIntegerList(List<IfcPositiveInteger> positiveIntegers)
    {
        this.positiveIntegers = positiveIntegers;
    }

    public List<IfcPositiveInteger> getPositiveIntegers() {
        return this.positiveIntegers;
    }
}
