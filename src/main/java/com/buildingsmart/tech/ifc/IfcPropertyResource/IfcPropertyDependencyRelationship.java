// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0b79cf26-1901-47e3-beed-cf836b1c598d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyDependencyRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("The property on which the relationship depends.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2bc09409-74fc-4627-963e-994929eb02e2")
	@JacksonXmlProperty(isAttribute=false, localName = "dependingProperty")
	private IfcProperty dependingProperty;

	@Description("The dependant property.")
	@DataMember(Order = 1)
	@Required()
	@Guid("48c40222-f9f1-4e9a-a75d-645311ee5a5b")
	@JacksonXmlProperty(isAttribute=false, localName = "dependantProperty")
	private IfcProperty dependantProperty;

	@Description("Expression that further describes the nature of the dependency relation.")
	@DataMember(Order = 2)
	@Guid("20552976-18c7-4fee-9e72-58d112b61432")
	@JacksonXmlProperty(isAttribute=false, localName = "expression")
	private IfcText expression;


	public IfcPropertyDependencyRelationship()
	{
	}

	public IfcPropertyDependencyRelationship(IfcProperty dependingProperty, IfcProperty dependantProperty)
	{
		this.dependingProperty = dependingProperty;
		this.dependantProperty = dependantProperty;
	}

	public IfcProperty getDependingProperty() {
		return this.dependingProperty;
	}

	public void setDependingProperty(IfcProperty dependingProperty) {
		this.dependingProperty = dependingProperty;
	}

	public IfcProperty getDependantProperty() {
		return this.dependantProperty;
	}

	public void setDependantProperty(IfcProperty dependantProperty) {
		this.dependantProperty = dependantProperty;
	}

	public IfcText getExpression() {
		return this.expression;
	}

	public void setExpression(IfcText expression) {
		this.expression = expression;
	}


}

