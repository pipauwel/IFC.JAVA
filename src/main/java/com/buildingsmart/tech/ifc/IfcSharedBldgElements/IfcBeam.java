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

@Guid("7f07946e-f8d2-4f0f-a25c-5bae7d67f92a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBeamStandardCase.class, name = "IfcBeamStandardCase"))
public class IfcBeam extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a beam that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcBeamType</em> is assigned, providing its own <em>IfcBeamType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("7bb3f509-7b4f-4430-85ea-65881e1e03ea")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBeamTypeEnum predefinedType;


	public IfcBeam()
	{
	}

	public IfcBeam(String globalId)
	{
		super(globalId);
	}

	public IfcBeamTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBeamTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

