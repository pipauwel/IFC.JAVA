// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("687f6e85-b375-4dd5-b17f-6d4e8a5dd006")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvaporatorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines the type of evaporator.")
	@Required()
	@Guid("8c26d3bb-291a-4cdd-aea2-4410cd3ff3b8")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporatorTypeEnum predefinedType;


	public IfcEvaporatorType()
	{
	}

	public IfcEvaporatorType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporatorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

