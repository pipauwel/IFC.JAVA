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

@Guid("d3bb6ca8-fe8d-4d85-a6a2-319d9ca0ca47")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOutletType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of outlet from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("691fd2aa-9ae2-43b3-b029-b86d21fd07bb")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcOutletTypeEnum predefinedType;


	public IfcOutletType()
	{
	}

	public IfcOutletType(String globalId, IfcOutletTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcOutletTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcOutletTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

