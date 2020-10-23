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

@Guid("d3f313a8-e9d6-4123-ae8c-91cb74d1eb3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricApplianceType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of electrical appliance from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("7e22deff-65cd-48eb-8c95-7a08845da6e2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricApplianceTypeEnum predefinedType;


	public IfcElectricApplianceType()
	{
	}

	public IfcElectricApplianceType(String globalId, IfcElectricApplianceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcElectricApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

