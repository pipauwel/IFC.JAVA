package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class IfcBoolean implements IfcSimpleValue, IfcModulusOfRotationalSubgradeReactionSelect,
        IfcModulusOfSubgradeReactionSelect, IfcModulusOfTranslationalSubgradeReactionSelect,
        IfcRotationalStiffnessSelect, IfcTranslationalStiffnessSelect, IfcWarpingStiffnessSelect {

    @DataMember(Order = 0)
    @JacksonXmlProperty(isAttribute = true, localName = "value")
    private Boolean value;

    public IfcBoolean() {
    }

    public IfcBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return this.value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
