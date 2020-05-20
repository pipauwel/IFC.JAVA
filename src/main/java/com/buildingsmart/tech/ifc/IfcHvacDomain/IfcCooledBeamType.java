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

@Guid("9952316a-c0ba-43c8-aed3-b0f39b461900")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCooledBeamType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of cooled beam.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a9aab02c-8410-4769-831e-142a438666ca")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCooledBeamTypeEnum predefinedType;


	public IfcCooledBeamType()
	{
	}

	public IfcCooledBeamType(String globalId, IfcCooledBeamTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCooledBeamTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCooledBeamTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

