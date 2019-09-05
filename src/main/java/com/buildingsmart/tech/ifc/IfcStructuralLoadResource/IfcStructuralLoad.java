// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9f70562a-7269-4def-b7a9-f818ed6ce0cb")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralLoad
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optionally defines a name for this load.")
	@Guid("01e55eb4-7ae4-4ce0-8763-839611198171")
	private String name;


	public IfcStructuralLoad()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

