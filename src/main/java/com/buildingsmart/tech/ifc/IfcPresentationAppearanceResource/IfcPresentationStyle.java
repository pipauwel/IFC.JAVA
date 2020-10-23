// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ab926025-a25c-40a8-9608-000b0b34210c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCurveStyle.class, name = "IfcCurveStyle"), @JsonSubTypes.Type(value = IfcFillAreaStyle.class, name = "IfcFillAreaStyle"), @JsonSubTypes.Type(value = IfcSurfaceStyle.class, name = "IfcSurfaceStyle"), @JsonSubTypes.Type(value = IfcTextStyle.class, name = "IfcTextStyle")})
public abstract class IfcPresentationStyle implements IfcStyleAssignmentSelect
{
	@Description("Name of the presentation style.")
	@DataMember(Order = 0)
	@Guid("3f4d5bf7-968b-43d1-b8db-e25988629fc7")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;


	public IfcPresentationStyle()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}


}

