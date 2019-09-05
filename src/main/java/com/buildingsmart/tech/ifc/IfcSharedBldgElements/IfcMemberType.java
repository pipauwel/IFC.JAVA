// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b9b1953e-01c6-4bed-bfc5-ccaa97663a30")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMemberType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a linear structural member element from which the type required may be set.")
	@Required()
	@Guid("0856367e-c546-4caf-b6ef-583ceef73b2b")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMemberTypeEnum predefinedType;


	public IfcMemberType()
	{
	}

	public IfcMemberType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMemberTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

