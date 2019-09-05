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

@Guid("e153e8ad-aea7-4f9a-b6aa-2f143a1c3e18")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricDistributionBoardType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of electric distribution type from which the type required may be set.</p>")
	@Required()
	@Guid("4c8ff855-b2e2-47b6-bc14-b23a381aa1fb")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoardTypeEnum predefinedType;


	public IfcElectricDistributionBoardType()
	{
	}

	public IfcElectricDistributionBoardType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoardTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoardTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricDistributionBoardTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

