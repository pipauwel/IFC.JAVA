// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("244ca500-edbb-46f5-9ab8-9560710b61a4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPropertySetDefinition.class, name = "IfcPropertySetDefinition"), @JsonSubTypes.Type(value = IfcPropertyTemplateDefinition.class, name = "IfcPropertyTemplateDefinition")})
public abstract class IfcPropertyDefinition extends IfcRoot implements IfcDefinitionSelect
{
	@InverseProperty(InverseProp = "relatedDefinitions", Range = "IfcRelDeclares")
	@Guid("28b07bf7-fbb2-4391-bcc6-65fdc6c85e0c")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDeclares")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasContext")
	private Set<IfcRelDeclares> hasContext;

	@Description("Reference to the relationship IfcRelAssociates and thus to those externally defined concepts, like classifications, documents, or library information, which are associated to the property definition.")
	@InverseProperty(InverseProp = "relatedObjects", Range = "IfcRelAssociates")
	@Guid("0e3ae573-eb5a-4df0-9bf3-6a03c15d2cd9")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociates")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasAssociations")
	private Set<IfcRelAssociates> hasAssociations;


	public IfcPropertyDefinition()
	{
	}

	public IfcPropertyDefinition(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelDeclares> getHasContext() {
		return this.hasContext;
	}

	public Set<IfcRelAssociates> getHasAssociations() {
		return this.hasAssociations;
	}


}

