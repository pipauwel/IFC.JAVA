// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cfc09c9c-67e9-4354-9a3c-87e3d2f14839")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryControlElement extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@DataMember(Order = 0)
	@Guid("5fd251f6-8d60-4ce4-bc91-5e5791b8cf4a")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcUnitaryControlElementTypeEnum predefinedType;


	public IfcUnitaryControlElement()
	{
	}

	public IfcUnitaryControlElement(String globalId)
	{
		super(globalId);
	}

	public IfcUnitaryControlElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryControlElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

