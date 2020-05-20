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

@Guid("b9b1953e-01c6-4bed-bfc5-ccaa97663a30")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMemberType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a linear structural member element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("0856367e-c546-4caf-b6ef-583ceef73b2b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcMemberTypeEnum predefinedType;


	public IfcMemberType()
	{
	}

	public IfcMemberType(String globalId, IfcMemberTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcMemberTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcMemberTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

