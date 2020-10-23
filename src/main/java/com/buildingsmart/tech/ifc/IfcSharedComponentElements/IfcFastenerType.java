// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("572e4980-73f9-469a-bc9e-520a82f27b85")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFastenerType extends IfcElementComponentType
{
	@Description("Subtype of fastener")
	@DataMember(Order = 0)
	@Required()
	@Guid("338cf347-65d8-4519-b97e-d487b305360c")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFastenerTypeEnum predefinedType;


	public IfcFastenerType()
	{
	}

	public IfcFastenerType(String globalId, IfcFastenerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

