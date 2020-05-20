// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d1fbb09c-b03d-4abb-97d2-0ded2403dd38")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundaryEdgeCondition.class, name = "IfcBoundaryEdgeCondition"), @JsonSubTypes.Type(value = IfcBoundaryFaceCondition.class, name = "IfcBoundaryFaceCondition"), @JsonSubTypes.Type(value = IfcBoundaryNodeCondition.class, name = "IfcBoundaryNodeCondition")})
public abstract class IfcBoundaryCondition
{
	@Description("Optionally defines a name for this boundary condition.")
	@DataMember(Order = 0)
	@Guid("80e193a9-cfc3-4d5e-ba4a-f2e6dd418ac8")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcBoundaryCondition()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

