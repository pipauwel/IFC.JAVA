// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b80d3213-eccf-4e8a-84a3-21c1381ff3cc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEventTime.class, name = "IfcEventTime"),
		@JsonSubTypes.Type(value = IfcLagTime.class, name = "IfcLagTime"),
		@JsonSubTypes.Type(value = IfcResourceTime.class, name = "IfcResourceTime"),
		@JsonSubTypes.Type(value = IfcTaskTime.class, name = "IfcTaskTime"),
		@JsonSubTypes.Type(value = IfcWorkTime.class, name = "IfcWorkTime")})
public abstract class IfcSchedulingTime
{
	@Description("Optional name for the time definition.")
	@DataMember(Order = 0)
	@Guid("9ce7ee5d-0c3d-4394-9ba0-4cd0ff38d925")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Specifies the origin of the scheduling time entity. It currently      differentiates between predicted, simulated, measured, and user defined values.")
	@DataMember(Order = 1)
	@Guid("a82843cd-7cb9-4fac-b255-c3bf8dfcfcc1")
	@JacksonXmlProperty(isAttribute=true, localName = "dataOrigin")
	private IfcDataOriginEnum dataOrigin;

	@Description("Value of the data origin if DataOrigin attribute is USERDEFINED.")
	@DataMember(Order = 2)
	@Guid("9619b2c7-3037-4380-8c25-83f4ded0ab84")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedDataOrigin")
	private IfcLabel userDefinedDataOrigin;


	public IfcSchedulingTime()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcDataOriginEnum getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(IfcDataOriginEnum dataOrigin) {
		this.dataOrigin = dataOrigin;
	}

	public IfcLabel getUserDefinedDataOrigin() {
		return this.userDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(IfcLabel userDefinedDataOrigin) {
		this.userDefinedDataOrigin = userDefinedDataOrigin;
	}


}

