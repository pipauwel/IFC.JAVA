// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6d0d3a21-1b3c-4595-bc9a-29ddd67199f4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcChimney extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a chimney that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcChimneyType</em> is assigned, providing its own <em>IfcChimneyType.PredefinedType</em>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("ab536c54-8d4e-457f-9e93-92a66ff44f92")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcChimneyTypeEnum predefinedType;


	public IfcChimney()
	{
	}

	public IfcChimney(String globalId)
	{
		super(globalId);
	}

	public IfcChimneyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcChimneyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

