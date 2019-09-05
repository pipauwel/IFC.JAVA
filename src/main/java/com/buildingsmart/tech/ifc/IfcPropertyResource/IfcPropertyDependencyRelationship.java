// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0b79cf26-1901-47e3-beed-cf836b1c598d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyDependencyRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "DependingProperty")
	@Description("The property on which the relationship depends.")
	@Required()
	@Guid("2bc09409-74fc-4627-963e-994929eb02e2")
	private com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependingProperty;

	@JacksonXmlProperty(isAttribute=false, localName = "DependantProperty")
	@Description("The dependant property.")
	@Required()
	@Guid("48c40222-f9f1-4e9a-a75d-645311ee5a5b")
	private com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependantProperty;

	@JacksonXmlProperty(isAttribute=true, localName = "Expression")
	@Description("Expression that further describes the nature of the dependency relation.")
	@Guid("20552976-18c7-4fee-9e72-58d112b61432")
	private String expression;


	public IfcPropertyDependencyRelationship()
	{
	}

	public IfcPropertyDependencyRelationship(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependingProperty, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependantProperty)
	{
		this.dependingProperty = dependingProperty;
		this.dependantProperty = dependantProperty;
	}

	public com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty getDependingProperty() {
		return this.dependingProperty;
	}

	public void setDependingProperty(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependingProperty) {
		this.dependingProperty = dependingProperty;
	}

	public com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty getDependantProperty() {
		return this.dependantProperty;
	}

	public void setDependantProperty(com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty dependantProperty) {
		this.dependantProperty = dependantProperty;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}


}

