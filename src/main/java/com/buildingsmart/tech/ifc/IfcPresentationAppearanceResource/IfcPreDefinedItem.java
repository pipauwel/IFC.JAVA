// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("24f52902-4123-41ea-bdd0-f47e6ab00191")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPreDefinedItem extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The string by which the pre defined item is identified. Allowable values for the string are declared at the level of subtypes.")
	@Required()
	@Guid("b0f1937f-94b4-4988-82a9-cf7620fca2ff")
	private String name;


	public IfcPreDefinedItem()
	{
	}

	public IfcPreDefinedItem(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

