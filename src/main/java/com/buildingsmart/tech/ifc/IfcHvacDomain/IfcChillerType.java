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

@Guid("5135d731-a436-4d43-8c92-3f797d30f85e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcChillerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the typical types of chillers (e.g., air-cooled, water-cooled, etc.).")
	@DataMember(Order = 0)
	@Required()
	@Guid("4f08183e-f36c-478b-82ce-51dca0c28e34")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcChillerTypeEnum predefinedType;


	public IfcChillerType()
	{
	}

	public IfcChillerType(String globalId, IfcChillerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcChillerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcChillerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

