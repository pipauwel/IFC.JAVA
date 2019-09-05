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

@Guid("f041588e-11cf-4855-a436-a562724c8408")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcChimneyType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a chimney element from which the type required may be set.")
	@Required()
	@Guid("47cbdf81-ca52-4762-8fab-f869e72a8172")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimneyTypeEnum predefinedType;


	public IfcChimneyType()
	{
	}

	public IfcChimneyType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimneyTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimneyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimneyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

