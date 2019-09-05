// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("572e4980-73f9-469a-bc9e-520a82f27b85")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFastenerType extends IfcElementComponentType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Subtype of fastener")
	@Required()
	@Guid("338cf347-65d8-4519-b97e-d487b305360c")
	private com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcFastenerTypeEnum predefinedType;


	public IfcFastenerType()
	{
	}

	public IfcFastenerType(String globalId, com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcFastenerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

