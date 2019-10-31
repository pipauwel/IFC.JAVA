// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

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
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkControl;

@Guid("863af35b-d9f7-458e-816e-351ab24b707b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkSchedule extends IfcWorkControl
{
	@Description("Identifies the predefined types of a work schedule from which       the type required may be set.")
	@Guid("9e068dd0-fcd2-4639-937b-c0dc5dc78127")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcWorkScheduleTypeEnum predefinedType;


	public IfcWorkSchedule()
	{
	}

	public IfcWorkSchedule(String globalId, String creationDate, String startTime)
	{
		super(globalId, creationDate, startTime);
	}

	public IfcWorkScheduleTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWorkScheduleTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

