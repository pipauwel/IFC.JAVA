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

@Guid("a152e66f-594f-4779-90f7-092829204b79")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTubeBundleType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines the type of tube bundle.")
	@Required()
	@Guid("b68c7534-05cc-4f1a-8a8d-a1551285c2ee")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum predefinedType;


	public IfcTubeBundleType()
	{
	}

	public IfcTubeBundleType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTubeBundleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

