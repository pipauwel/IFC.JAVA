// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e471c212-612d-4578-8f9e-e9623be892bf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDistributionChamberElementType extends IfcDistributionFlowElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined types of distribution chambers.")
	@Required()
	@Guid("5547f3da-2b18-4dea-8d61-4940224376c8")
	private com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum predefinedType;


	public IfcDistributionChamberElementType()
	{
	}

	public IfcDistributionChamberElementType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionChamberElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

