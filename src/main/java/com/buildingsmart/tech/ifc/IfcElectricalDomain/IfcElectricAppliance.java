// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("bc624491-56a2-49ed-bb31-ca4b61c8deb5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricAppliance extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("12b13a9b-6483-49b8-8001-d733277e783e")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricApplianceTypeEnum predefinedType;


	public IfcElectricAppliance()
	{
	}

	public IfcElectricAppliance(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricApplianceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricApplianceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

