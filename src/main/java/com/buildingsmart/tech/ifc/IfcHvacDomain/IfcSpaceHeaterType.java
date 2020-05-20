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

@Guid("0f52a5c7-5f1e-4406-8e80-801782467a1a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpaceHeaterType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("Enumeration of possible types of space heater (e.g., baseboard heater, convector, radiator, etc.).")
	@DataMember(Order = 0)
	@Required()
	@Guid("915dafb4-e6bb-46b2-a828-3c83619c9bab")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcSpaceHeaterTypeEnum predefinedType;


	public IfcSpaceHeaterType()
	{
	}

	public IfcSpaceHeaterType(String globalId, IfcSpaceHeaterTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSpaceHeaterTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpaceHeaterTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

