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

@Guid("f041588e-11cf-4855-a436-a562724c8408")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcChimneyType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a chimney element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("47cbdf81-ca52-4762-8fab-f869e72a8172")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcChimneyTypeEnum predefinedType;


	public IfcChimneyType()
	{
	}

	public IfcChimneyType(String globalId, IfcChimneyTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcChimneyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcChimneyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

