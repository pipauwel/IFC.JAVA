// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("de3e3892-9754-4be7-babc-a9101067d69a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTransformerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of transformer from which the type required may be set.</p>")
	@Required()
	@Guid("3f471949-e875-455e-8c57-20ce654c1408")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformerTypeEnum predefinedType;


	public IfcTransformerType()
	{
	}

	public IfcTransformerType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcTransformerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

