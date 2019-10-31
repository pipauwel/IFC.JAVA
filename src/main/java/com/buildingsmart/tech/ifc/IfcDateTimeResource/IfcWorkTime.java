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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcSchedulingTime;

@Guid("cb173376-bb9c-47f5-99f1-2fd84e691ccc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkTime extends IfcSchedulingTime
{
	@Description("Recurrence pattern that defines a time period, which, if given, is      valid within the time period defined by      <em>IfcWorkTime.Start</em> and <em>IfcWorkTime.Finish</em>.")
	@Guid("7d696598-d758-492c-ab43-acf0f3375ec6")
	@JacksonXmlProperty(isAttribute=false, localName = "RecurrencePattern")
	private IfcRecurrencePattern recurrencePattern;

	@Description("Start date of the work time (0:00), that might be further      restricted by a recurrence pattern.")
	@Guid("67de30f4-67c3-4e5b-bc64-1614203b10bc")
	@JacksonXmlProperty(isAttribute=true, localName = "Start")
	private String start;

	@Description("End date of the work time (24:00), that might be further      restricted by a recurrence pattern.")
	@Guid("9833d9fd-4211-42fd-a696-7119de15d437")
	@JacksonXmlProperty(isAttribute=true, localName = "Finish")
	private String finish;


	public IfcWorkTime()
	{
	}

	public IfcRecurrencePattern getRecurrencePattern() {
		return this.recurrencePattern;
	}

	public void setRecurrencePattern(IfcRecurrencePattern recurrencePattern) {
		this.recurrencePattern = recurrencePattern;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return this.finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}


}

