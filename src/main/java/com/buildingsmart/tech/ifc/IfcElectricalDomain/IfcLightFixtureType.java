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

@Guid("a34fc9d6-d1c8-402c-817e-feb3a9c9e7a1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightFixtureType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of light fixture from which the type required may be set.</p>")
	@Required()
	@Guid("f92d5dcc-4b10-49bd-8a04-920f36d9d350")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureTypeEnum predefinedType;


	public IfcLightFixtureType()
	{
	}

	public IfcLightFixtureType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcLightFixtureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

