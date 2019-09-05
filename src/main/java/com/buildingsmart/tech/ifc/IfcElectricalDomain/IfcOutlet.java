// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("323a5119-6f96-4712-87e3-abaf2ac04b6f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOutlet extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("2cebd4c7-66f7-413f-9775-7bd96039018c")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcOutletTypeEnum predefinedType;


	public IfcOutlet()
	{
	}

	public IfcOutlet(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcOutletTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcOutletTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

