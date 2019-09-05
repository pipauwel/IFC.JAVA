// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ab926025-a25c-40a8-9608-000b0b34210c")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPresentationStyle implements IfcStyleAssignmentSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name of the presentation style.")
	@Guid("3f4d5bf7-968b-43d1-b8db-e25988629fc7")
	private String name;


	public IfcPresentationStyle()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

