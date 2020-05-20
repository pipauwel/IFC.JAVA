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

@Guid("5b0765d7-22a3-4ba4-a259-32523ca4082c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcJunctionBoxType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFittingType
{
	@Description("<p>Identifies the predefined types of junction boxes from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("3bba9337-756a-46d1-a706-78d461b878ae")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcJunctionBoxTypeEnum predefinedType;


	public IfcJunctionBoxType()
	{
	}

	public IfcJunctionBoxType(String globalId, IfcJunctionBoxTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcJunctionBoxTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcJunctionBoxTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

