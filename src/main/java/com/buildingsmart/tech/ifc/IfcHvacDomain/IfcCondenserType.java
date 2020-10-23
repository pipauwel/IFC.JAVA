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

@Guid("9d2cddee-45de-4b2c-9d48-812cc8cac37f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCondenserType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of condenser.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6beaeb3e-2f12-4f5e-b32b-edc3cf6bac0b")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCondenserTypeEnum predefinedType;


	public IfcCondenserType()
	{
	}

	public IfcCondenserType(String globalId, IfcCondenserTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCondenserTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCondenserTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

