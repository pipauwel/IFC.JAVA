// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6eefdfa8-0f42-440b-a927-ddd04185cfd4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialProperties.class, name = "IfcMaterialProperties"), @JsonSubTypes.Type(value = IfcProfileProperties.class, name = "IfcProfileProperties")})
public abstract class IfcExtendedProperties extends IfcPropertyAbstraction
{
	@Description("The name given to the set of properties.")
	@DataMember(Order = 0)
	@Guid("35758c6c-417b-4785-ac0b-fd61a613f9db")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Description for the set of properties.")
	@DataMember(Order = 1)
	@Guid("ca07af86-dd02-4eae-98a1-854664b54a87")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The set of properties provided for this extended property collection.")
	@DataMember(Order = 2)
	@Required()
	@Guid("1ed043fe-54d5-4e63-bd45-c1cb8c066dd3")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProperty")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Properties")
	private Set<IfcProperty> properties;


	public IfcExtendedProperties()
	{
	}

	public IfcExtendedProperties(IfcProperty[] properties)
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

	public Set<IfcProperty> getProperties() {
		return this.properties;
	}


}

