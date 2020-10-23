// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("60a3dc52-6b9a-4ad6-9d45-9ba50c6958e3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryControlElementType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of unitary control element from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("2f4bb150-03fc-4936-95e8-bab9df94e95c")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcUnitaryControlElementTypeEnum predefinedType;


	public IfcUnitaryControlElementType()
	{
	}

	public IfcUnitaryControlElementType(String globalId, IfcUnitaryControlElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcUnitaryControlElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcUnitaryControlElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

