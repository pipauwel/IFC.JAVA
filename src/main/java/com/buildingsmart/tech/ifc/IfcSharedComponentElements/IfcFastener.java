// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f7f5c079-1ef8-4a9e-a64c-86800f526d37")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFastener extends IfcElementComponent
{
	@Description("Subtype of fastener")
	@DataMember(Order = 0)
	@Guid("662a3ac7-815a-445d-a564-413f149a45af")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcFastenerTypeEnum predefinedType;


	public IfcFastener()
	{
	}

	public IfcFastener(String globalId)
	{
		super(globalId);
	}

	public IfcFastenerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFastenerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

