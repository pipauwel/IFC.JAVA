// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6eefdfa8-0f42-440b-a927-ddd04185cfd4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcExtendedProperties extends IfcPropertyAbstraction
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name given to the set of properties.")
	@Guid("35758c6c-417b-4785-ac0b-fd61a613f9db")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Description for the set of properties.")
	@Guid("ca07af86-dd02-4eae-98a1-854664b54a87")
	private String description;

	@Description("The set of properties provided for this extended property collection.")
	@Required()
	@MinLength(1)
	@Guid("1ed043fe-54d5-4e63-bd45-c1cb8c066dd3")
	private Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty> properties = new HashSet<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty>();


	public IfcExtendedProperties()
	{
	}

	public IfcExtendedProperties(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty[] properties)
	{
		this.properties = new HashSet<>(Arrays.asList(properties));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty> getProperties() {
		return this.properties;
	}


}

