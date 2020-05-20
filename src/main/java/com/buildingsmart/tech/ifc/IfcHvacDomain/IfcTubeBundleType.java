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

@Guid("a152e66f-594f-4779-90f7-092829204b79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTubeBundleType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@Description("Defines the type of tube bundle.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b68c7534-05cc-4f1a-8a8d-a1551285c2ee")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTubeBundleTypeEnum predefinedType;


	public IfcTubeBundleType()
	{
	}

	public IfcTubeBundleType(String globalId, IfcTubeBundleTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcTubeBundleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTubeBundleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

