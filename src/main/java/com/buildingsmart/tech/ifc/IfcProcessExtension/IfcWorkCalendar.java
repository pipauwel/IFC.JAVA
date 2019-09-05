// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d05923c3-37a8-444a-b811-bf0709bab84f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkCalendar extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Set of times periods that are regarded as an initial set-up      of working times. Exception times can then further restrict      these working times.")
	@MinLength(1)
	@Guid("f600c372-69d7-44f2-ad5a-450a9dd1e34a")
	private Set<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime> workingTimes = new HashSet<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime>();

	@Description("Set of times periods that define exceptions (non-working      times) for the given working times including the base      calendar, if provided.")
	@MinLength(1)
	@Guid("2a68f57c-be31-4ee2-acee-aa80e15467f6")
	private Set<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime> exceptionTimes = new HashSet<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime>();

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a work calendar from which       the type required may be set.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added</blockquote>")
	@Guid("4343392e-ed01-4af4-931f-7be994806a87")
	private com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkCalendarTypeEnum predefinedType;


	public IfcWorkCalendar()
	{
	}

	public IfcWorkCalendar(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime> getWorkingTimes() {
		return this.workingTimes;
	}

	public Set<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcWorkTime> getExceptionTimes() {
		return this.exceptionTimes;
	}

	public com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkCalendarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProcessExtension.IfcWorkCalendarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

