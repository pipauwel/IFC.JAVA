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

@Guid("c87227ad-0a1d-4c30-a4a2-fe16fb058634")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoilerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines types of boilers.")
	@DataMember(Order = 0)
	@Required()
	@Guid("99850f73-da5b-40ff-9529-8a3816e83b04")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBoilerTypeEnum predefinedType;


	public IfcBoilerType()
	{
	}

	public IfcBoilerType(String globalId, IfcBoilerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcBoilerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBoilerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

