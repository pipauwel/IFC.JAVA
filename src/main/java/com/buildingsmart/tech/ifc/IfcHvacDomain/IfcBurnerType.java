// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4a137418-8fa9-4459-8470-7b7ef512ad4d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBurnerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Required()
	@Guid("fd7f286c-7e6e-487c-b148-304c94e2263e")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum predefinedType;


	public IfcBurnerType()
	{
	}

	public IfcBurnerType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcBurnerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

