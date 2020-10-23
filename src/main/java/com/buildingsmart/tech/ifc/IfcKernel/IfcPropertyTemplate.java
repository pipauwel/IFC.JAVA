// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("dfa52a71-6e64-4b4c-af07-d476c558c888")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcComplexPropertyTemplate.class, name = "IfcComplexPropertyTemplate"), @JsonSubTypes.Type(value = IfcSimplePropertyTemplate.class, name = "IfcSimplePropertyTemplate")})
public abstract class IfcPropertyTemplate extends IfcPropertyTemplateDefinition
{
	@Description("Reference to a complex property templates. It should only be provided, if the <em>PropertyType</em> of the referenced complex property template is set to <small>COMPLEX</small>.")
	@InverseProperty(InverseProp = "hasPropertyTemplates", Range = "IfcComplexPropertyTemplate")
	@Guid("c8bb95e2-205f-47e2-988e-debdc6a2ef7c")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcComplexPropertyTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfComplexTemplate")
	private Set<IfcComplexPropertyTemplate> partOfComplexTemplate;

	@Description("Reference to the <em>IfcPropertySetTemplate</em> that defines the scope for the <em>IfcPropertyTemplate</em>. A single <em>IfcPropertyTemplate</em> can be defined within the scope of zero, one or many <em>IfcPropertySetTemplate</em>'.")
	@InverseProperty(InverseProp = "hasPropertyTemplates", Range = "IfcPropertySetTemplate")
	@Guid("8118417e-88aa-422d-889f-ee94c54dd384")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertySetTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfPsetTemplate")
	private Set<IfcPropertySetTemplate> partOfPsetTemplate;


	public IfcPropertyTemplate()
	{
	}

	public IfcPropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public Set<IfcComplexPropertyTemplate> getPartOfComplexTemplate() {
		return this.partOfComplexTemplate;
	}

	public Set<IfcPropertySetTemplate> getPartOfPsetTemplate() {
		return this.partOfPsetTemplate;
	}


}

