// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("22f3011b-86c8-4c48-b29c-49619710ec39")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricTimeControl extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@DataMember(Order = 0)
	@Guid("7323bbaa-9f51-4276-ad5f-ed02b0edcad1")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcElectricTimeControlTypeEnum predefinedType;


	public IfcElectricTimeControl()
	{
	}

	public IfcElectricTimeControl(String globalId)
	{
		super(globalId);
	}

	public IfcElectricTimeControlTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElectricTimeControlTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

