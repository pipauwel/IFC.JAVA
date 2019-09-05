// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3990e833-3ae0-4169-a1b9-a5baf4a50755")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcColourSpecification extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcColour
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optional name given to a particular colour specification in addition to the colour components (like the RGB values).  <blockquote class=\"example\">EXAMPLE&nbsp; Names of a industry colour classification, such as RAL.</blockquote>  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; Attribute added.</blockquote>")
	@Guid("0a39aac4-ff7b-41fa-81e3-803fdd402107")
	private String name;


	public IfcColourSpecification()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

