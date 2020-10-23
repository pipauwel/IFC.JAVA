// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7843843a-980a-42a0-894d-03493dd69146")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProjectionElement extends IfcFeatureElementAddition
{
	@Description("Predefined generic type for a projection element that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("d7539a41-7169-4cb2-8338-5e6df001437f")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcProjectionElementTypeEnum predefinedType;


	public IfcProjectionElement()
	{
	}

	public IfcProjectionElement(String globalId)
	{
		super(globalId);
	}

	public IfcProjectionElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProjectionElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

