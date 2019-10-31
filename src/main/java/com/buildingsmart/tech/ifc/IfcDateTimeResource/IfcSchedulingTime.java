// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.*;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcEventTime;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcLagTime;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcResourceTime;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskTime;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime;

@Guid("b80d3213-eccf-4e8a-84a3-21c1381ff3cc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcEventTime.class, name = "IfcEventTime"), @JsonSubTypes.Type(value = IfcLagTime.class, name = "IfcLagTime"), @JsonSubTypes.Type(value = IfcResourceTime.class, name = "IfcResourceTime"), @JsonSubTypes.Type(value = IfcTaskTime.class, name = "IfcTaskTime"), @JsonSubTypes.Type(value = IfcWorkTime.class, name = "IfcWorkTime")})
public abstract class IfcSchedulingTime
{
	@Description("Optional name for the time definition.")
	@Guid("9ce7ee5d-0c3d-4394-9ba0-4cd0ff38d925")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Specifies the origin of the scheduling time entity. It currently      differentiates between predicted, simulated, measured, and user defined values.")
	@Guid("a82843cd-7cb9-4fac-b255-c3bf8dfcfcc1")
	@JacksonXmlProperty(isAttribute=true, localName = "DataOrigin")
	private IfcDataOriginEnum dataOrigin;

	@Description("Value of the data origin if DataOrigin attribute is USERDEFINED.")
	@Guid("9619b2c7-3037-4380-8c25-83f4ded0ab84")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedDataOrigin")
	private String userDefinedDataOrigin;


	public IfcSchedulingTime()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IfcDataOriginEnum getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(IfcDataOriginEnum dataOrigin) {
		this.dataOrigin = dataOrigin;
	}

	public String getUserDefinedDataOrigin() {
		return this.userDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(String userDefinedDataOrigin) {
		this.userDefinedDataOrigin = userDefinedDataOrigin;
	}


}

