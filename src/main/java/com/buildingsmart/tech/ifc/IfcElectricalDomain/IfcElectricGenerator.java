// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ae4d0c52-31d6-4d0e-9fc5-52a5d00577ab")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricGenerator extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("db0378f2-55a2-4645-8236-962605990973")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGeneratorTypeEnum predefinedType;


	public IfcElectricGenerator()
	{
	}

	public IfcElectricGenerator(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGeneratorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricGeneratorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

