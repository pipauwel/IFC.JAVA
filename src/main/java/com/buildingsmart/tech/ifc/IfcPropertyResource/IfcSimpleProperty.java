// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("6754d0f9-1ae8-4653-bbab-f9aa6b1e5206")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPropertyBoundedValue.class, name = "IfcPropertyBoundedValue"), @JsonSubTypes.Type(value = IfcPropertyEnumeratedValue.class, name = "IfcPropertyEnumeratedValue"), @JsonSubTypes.Type(value = IfcPropertyListValue.class, name = "IfcPropertyListValue"), @JsonSubTypes.Type(value = IfcPropertyReferenceValue.class, name = "IfcPropertyReferenceValue"), @JsonSubTypes.Type(value = IfcPropertySingleValue.class, name = "IfcPropertySingleValue"), @JsonSubTypes.Type(value = IfcPropertyTableValue.class, name = "IfcPropertyTableValue")})
public abstract class IfcSimpleProperty extends IfcProperty
{

	public IfcSimpleProperty()
	{
	}

	public IfcSimpleProperty(IfcIdentifier name)
	{
		super(name);
	}


}

