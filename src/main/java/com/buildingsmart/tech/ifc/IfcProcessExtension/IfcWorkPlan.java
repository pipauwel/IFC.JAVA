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

@Guid("1802d7e1-8d28-4916-80dd-a5f0a21f588b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkPlan extends IfcWorkControl
{
	@Description("Identifies the predefined types of a work plan from which       the type required may be set.")
	@Guid("d78ca6cb-0dfb-4ca5-acbb-8dd5ea6f5a0e")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcWorkPlanTypeEnum predefinedType;


	public IfcWorkPlan()
	{
	}

	public IfcWorkPlan(String globalId, String creationDate, String startTime)
	{
		super(globalId, creationDate, startTime);
	}

	public IfcWorkPlanTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWorkPlanTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

