// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e153e8ad-aea7-4f9a-b6aa-2f143a1c3e18")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricDistributionBoardType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("<p>Identifies the predefined types of electric distribution type from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("4c8ff855-b2e2-47b6-bc14-b23a381aa1fb")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricDistributionBoardTypeEnum predefinedType;


	public IfcElectricDistributionBoardType()
	{
	}

	public IfcElectricDistributionBoardType(String globalId, IfcElectricDistributionBoardTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricDistributionBoardTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricDistributionBoardTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

