// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("258a0af9-321d-4e24-a6cc-be10c825e9f7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRecurrencePattern
{
	@JacksonXmlProperty(isAttribute=true, localName = "RecurrenceType")
	@Description("Defines the recurrence type that gives meaning to the used      attributes and decides about possible attribute      combinations, i.e. what attributes are needed to fully      describe the pattern type.")
	@Required()
	@Guid("954775d8-cdf6-472f-86bb-c7b6f316a87e")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrenceTypeEnum recurrenceType;

	@JacksonXmlProperty(isAttribute=true, localName = "DayComponent")
	@Description("The position of the specified day in a month.")
	@MinLength(1)
	@Guid("aa5983f3-4399-47f4-a4de-045d80528e17")
	private Set<Integer> dayComponent = new HashSet<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "WeekdayComponent")
	@Description("The weekday name of the specified day in a week.")
	@MinLength(1)
	@Guid("8d1bab19-3977-4b22-84d4-451c88dd0969")
	private Set<Integer> weekdayComponent = new HashSet<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "MonthComponent")
	@Description("The position of the specified month in a year.")
	@MinLength(1)
	@Guid("1019c4ef-3322-48ef-a091-41faef01eb7f")
	private Set<Integer> monthComponent = new HashSet<Integer>();

	@JacksonXmlProperty(isAttribute=true, localName = "Position")
	@Description("The position of the specified component, e.g. the 3rd      (position=3) Tuesday (weekday component) in a month. A      negative position value is used to define the last position       of the component (-1), the next to last position (-2) etc.")
	@Guid("ae3d57dd-01ef-4c24-a775-224bd6b6563d")
	private int position;

	@JacksonXmlProperty(isAttribute=true, localName = "Interval")
	@Description("An interval can be given according to the pattern type. An      interval value of 2 can for instance every two days, weeks,      months, years. An empty interval value is regarded as 1. The      used interval values should be in a reasonable range, e.g.      not 0 or &lt;0.")
	@Guid("b3ad6127-b001-400c-868c-465054246938")
	private int interval;

	@JacksonXmlProperty(isAttribute=true, localName = "Occurrences")
	@Description("Defines the number of occurrences of this pattern, e.g. a weekly       event might be defined to occur 5 times before it stops.")
	@Guid("16cdd883-9b54-425d-a1f6-28166578e77b")
	private int occurrences;

	@Description("List of time periods that are defined by a start and end time      of the recurring element (day). The order of the list should      reflect the sequence of the time periods.")
	@MinLength(1)
	@Guid("0b43faa7-5e36-4cef-a0e7-e04c4030833f")
	private List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimePeriod> timePeriods = new ArrayList<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimePeriod>();


	public IfcRecurrencePattern()
	{
	}

	public IfcRecurrencePattern(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrenceTypeEnum recurrenceType)
	{
		this.recurrenceType = recurrenceType;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrenceTypeEnum getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcRecurrenceTypeEnum recurrenceType) {
		this.recurrenceType = recurrenceType;
	}

	public Set<Integer> getDayComponent() {
		return this.dayComponent;
	}

	public Set<Integer> getWeekdayComponent() {
		return this.weekdayComponent;
	}

	public Set<Integer> getMonthComponent() {
		return this.monthComponent;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getInterval() {
		return this.interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getOccurrences() {
		return this.occurrences;
	}

	public void setOccurrences(int occurrences) {
		this.occurrences = occurrences;
	}

	public List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimePeriod> getTimePeriods() {
		return this.timePeriods;
	}


}

