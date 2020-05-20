// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b752e035-e86a-47fe-9596-26982071dd71")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcMemberStandardCase.class, name = "IfcMemberStandardCase"))
public class IfcMember extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a member that is specified in an enumeration. There may be a property set given for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcMemberType</em> is assigned, providing its own <em>IfcMemberType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("da25064e-d324-4514-9b91-3e12adc9db3b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMemberTypeEnum predefinedType;


	public IfcMember()
	{
	}

	public IfcMember(String globalId)
	{
		super(globalId);
	}

	public IfcMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

