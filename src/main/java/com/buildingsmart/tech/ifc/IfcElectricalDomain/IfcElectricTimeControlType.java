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

@Guid("2bb86abe-9d7d-49e5-8a0e-89e7617eddf6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricTimeControlType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of electrical time control from which the type required may be set.</p>")
	@Required()
	@Guid("6390956e-1cd2-4033-9c94-ea41642eeaa8")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlTypeEnum predefinedType;


	public IfcElectricTimeControlType()
	{
	}

	public IfcElectricTimeControlType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricTimeControlTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

