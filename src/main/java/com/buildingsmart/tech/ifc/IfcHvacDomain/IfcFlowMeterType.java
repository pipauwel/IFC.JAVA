// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("daef9a4b-19fd-4e45-9d4d-4a12b58209b5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFlowMeterType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowControllerType
{
	@Description("Defines the type of flow meter.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a2740dc9-c1bc-4df2-8270-bdab521192a4")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFlowMeterTypeEnum predefinedType;


	public IfcFlowMeterType()
	{
	}

	public IfcFlowMeterType(String globalId, IfcFlowMeterTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFlowMeterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFlowMeterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

