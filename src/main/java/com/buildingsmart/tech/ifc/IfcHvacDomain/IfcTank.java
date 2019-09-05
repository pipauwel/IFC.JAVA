// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a051ae7f-8748-40a4-a7d2-2cd6a659406f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTank extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowStorageDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("f72593a9-0a21-4bed-8743-9c8717769b22")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTankTypeEnum predefinedType;


	public IfcTank()
	{
	}

	public IfcTank(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTankTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcTankTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

