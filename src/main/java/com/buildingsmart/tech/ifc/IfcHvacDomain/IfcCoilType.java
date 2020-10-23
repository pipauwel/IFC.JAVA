// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8eddad0b-39d9-48df-b854-7ff316225c5a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCoilType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines typical types of coils (e.g., Cooling, Heating, etc.)")
	@DataMember(Order = 0)
	@Required()
	@Guid("f6e3036c-6fcd-410a-8c52-1f404f3bb682")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCoilTypeEnum predefinedType;


	public IfcCoilType()
	{
	}

	public IfcCoilType(String globalId, IfcCoilTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCoilTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCoilTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

