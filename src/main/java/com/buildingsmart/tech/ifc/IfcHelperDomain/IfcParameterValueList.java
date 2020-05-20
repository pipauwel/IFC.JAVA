package com.buildingsmart.tech.ifc.IfcHelperDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcParameterValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcParameterValueList {

    @DataMember(Order = 1)
    @JacksonXmlProperty(isAttribute = false, localName = "IfcParameterValue")
    @JacksonXmlElementWrapper(useWrapping = false, localName = "parameterValues")
    private List<IfcParameterValue> parameterValues = new ArrayList<IfcParameterValue>();

    public IfcParameterValueList()
    {
    }

    public IfcParameterValueList(List<IfcParameterValue> parameterValues)
    {
        this.parameterValues = parameterValues;
    }

    public List<IfcParameterValue> getParameterValues() {
        return this.parameterValues;
    }
}
