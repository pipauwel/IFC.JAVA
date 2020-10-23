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

@Guid("030a0c92-14e1-4656-8d65-6fb50f43e9b3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBeamType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a beam element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("78ef60cd-a49e-4e16-8a9c-b68abc70193e")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBeamTypeEnum predefinedType;


	public IfcBeamType()
	{
	}

	public IfcBeamType(String globalId, IfcBeamTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcBeamTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBeamTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

