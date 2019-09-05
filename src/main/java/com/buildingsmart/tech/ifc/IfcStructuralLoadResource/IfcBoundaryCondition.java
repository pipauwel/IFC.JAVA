// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d1fbb09c-b03d-4abb-97d2-0ded2403dd38")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcBoundaryCondition
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optionally defines a name for this boundary condition.")
	@Guid("80e193a9-cfc3-4d5e-ba4a-f2e6dd418ac8")
	private String name;


	public IfcBoundaryCondition()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

