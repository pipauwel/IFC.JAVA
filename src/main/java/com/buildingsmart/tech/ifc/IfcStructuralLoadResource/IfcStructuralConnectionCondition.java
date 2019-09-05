// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ea3beaa7-301b-4f86-8c4f-4356baa1c79f")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralConnectionCondition
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optionally defines a name for this connection condition.")
	@Guid("a1bcf73e-6ba2-4b5b-bcda-3b3e613a4703")
	private String name;


	public IfcStructuralConnectionCondition()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

