// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("cb173376-bb9c-47f5-99f1-2fd84e691ccc")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkTime extends IfcSchedulingTime
{
	@JacksonXmlProperty(isAttribute=false, localName = "RecurrencePattern")
	@Description("Recurrence pattern that defines a time period, which, if given, is      valid within the time period defined by      <em>IfcWorkTime.Start</em> and <em>IfcWorkTime.Finish</em>.")
	@Guid("7d696598-d758-492c-ab43-acf0f3375ec6")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrencePattern recurrencePattern;

	@JacksonXmlProperty(isAttribute=true, localName = "Start")
	@Description("Start date of the work time (0:00), that might be further      restricted by a recurrence pattern.")
	@Guid("67de30f4-67c3-4e5b-bc64-1614203b10bc")
	private String start;

	@JacksonXmlProperty(isAttribute=true, localName = "Finish")
	@Description("End date of the work time (24:00), that might be further      restricted by a recurrence pattern.")
	@Guid("9833d9fd-4211-42fd-a696-7119de15d437")
	private String finish;


	public IfcWorkTime()
	{
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrencePattern getRecurrencePattern() {
		return this.recurrencePattern;
	}

	public void setRecurrencePattern(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrencePattern recurrencePattern) {
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

