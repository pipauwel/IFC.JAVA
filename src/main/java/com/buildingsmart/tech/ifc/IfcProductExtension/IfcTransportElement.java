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

@Guid("ada3468b-6924-41e7-9aed-8281dc9e75c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTransportElement extends IfcElement
{
	@Description("Predefined generic types for a transportation element that are specified in an enumeration. There might be property sets defined specifically for each predefined type.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("07bc919e-a192-4b17-aa12-57f7999df3e2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTransportElementTypeEnum predefinedType;


	public IfcTransportElement()
	{
	}

	public IfcTransportElement(String globalId)
	{
		super(globalId);
	}

	public IfcTransportElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTransportElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

