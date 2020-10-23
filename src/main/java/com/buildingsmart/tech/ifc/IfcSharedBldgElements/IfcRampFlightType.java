// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4a38ac16-6674-455e-aa56-e24fd08b6444")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRampFlightType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a ramp flight element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("543dbfbd-9059-4737-b48f-5397097137a0")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRampFlightTypeEnum predefinedType;


	public IfcRampFlightType()
	{
	}

	public IfcRampFlightType(String globalId, IfcRampFlightTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcRampFlightTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRampFlightTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

