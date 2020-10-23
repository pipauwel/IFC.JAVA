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

@Guid("c73600ec-1ac8-4862-9271-cd7396feb1e0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLampType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of lamp from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("8a60938a-faf1-4906-8b2e-b859b0b6b395")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLampTypeEnum predefinedType;


	public IfcLampType()
	{
	}

	public IfcLampType(String globalId, IfcLampTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcLampTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLampTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

