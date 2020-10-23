// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("e9e318da-ceb2-4700-9c42-17311e5549b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcComplexPropertyTemplate extends IfcPropertyTemplate
{
	@DataMember(Order = 0)
	@Guid("5aaf3e71-89c0-4dc0-be2d-2bcd73ca28e4")
	@JacksonXmlProperty(isAttribute=false, localName = "usageName")
	private IfcLabel usageName;

	@DataMember(Order = 1)
	@Guid("a22e2074-7fd6-45ce-a86e-7368cce1b211")
	@JacksonXmlProperty(isAttribute=true, localName = "templateType")
	private IfcComplexPropertyTemplateTypeEnum templateType;

	@Description("Reference to a set of property templates. It should only be provided, if the <em>PropertyType</em> is set to <small>COMPLEX</small>.")
	@DataMember(Order = 2)
	@Guid("060702e5-aeda-4f68-904b-8f9c880cd575")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasPropertyTemplates")
	private Set<IfcPropertyTemplate> hasPropertyTemplates;


	public IfcComplexPropertyTemplate()
	{
	}

	public IfcComplexPropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public IfcLabel getUsageName() {
		return this.usageName;
	}

	public void setUsageName(IfcLabel usageName) {
		this.usageName = usageName;
	}

	public IfcComplexPropertyTemplateTypeEnum getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(IfcComplexPropertyTemplateTypeEnum templateType) {
		this.templateType = templateType;
	}

	public Set<IfcPropertyTemplate> getHasPropertyTemplates() {
		return this.hasPropertyTemplates;
	}


}

