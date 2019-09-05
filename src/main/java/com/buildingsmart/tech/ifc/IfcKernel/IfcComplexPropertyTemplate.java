// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e9e318da-ceb2-4700-9c42-17311e5549b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcComplexPropertyTemplate extends IfcPropertyTemplate
{
	@JacksonXmlProperty(isAttribute=true, localName = "UsageName")
	@Guid("5aaf3e71-89c0-4dc0-be2d-2bcd73ca28e4")
	private String usageName;

	@JacksonXmlProperty(isAttribute=true, localName = "TemplateType")
	@Guid("a22e2074-7fd6-45ce-a86e-7368cce1b211")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplateTypeEnum templateType;

	@Description("Reference to a set of property templates. It should only be provided, if the <em>PropertyType</em> is set to <small>COMPLEX</small>.")
	@MinLength(1)
	@Guid("060702e5-aeda-4f68-904b-8f9c880cd575")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyTemplate> hasPropertyTemplates = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyTemplate>();


	public IfcComplexPropertyTemplate()
	{
	}

	public IfcComplexPropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public String getUsageName() {
		return this.usageName;
	}

	public void setUsageName(String usageName) {
		this.usageName = usageName;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplateTypeEnum getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplateTypeEnum templateType) {
		this.templateType = templateType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyTemplate> getHasPropertyTemplates() {
		return this.hasPropertyTemplates;
	}


}

