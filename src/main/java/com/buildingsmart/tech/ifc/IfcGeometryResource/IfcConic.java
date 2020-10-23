// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f7c8c08c-d40d-47b7-86fa-76e7d53307af")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCircle.class, name = "IfcCircle"), @JsonSubTypes.Type(value = IfcEllipse.class, name = "IfcEllipse")})
public abstract class IfcConic extends IfcCurve
{
	@Description("The location and orientation of the conic. Further details of the interpretation of this attribute are given for the individual subtypes.\"")
	@DataMember(Order = 0)
	@Required()
	@Guid("980a563c-6502-44d2-9643-0799c4467941")
	@JacksonXmlProperty(isAttribute=false, localName = "position")
	private IfcAxis2Placement position;


	public IfcConic()
	{
	}

	public IfcConic(IfcAxis2Placement position)
	{
		this.position = position;
	}

	public IfcAxis2Placement getPosition() {
		return this.position;
	}

	public void setPosition(IfcAxis2Placement position) {
		this.position = position;
	}


}

