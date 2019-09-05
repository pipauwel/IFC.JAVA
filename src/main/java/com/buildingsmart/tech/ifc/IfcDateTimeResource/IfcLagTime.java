// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ebde4676-fd2c-4f52-8985-79f623317d88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLagTime extends IfcSchedulingTime
{
	@Description("Value of the time lag selected as being either a ratio or a      time measure.")
	@Required()
	@Guid("2887dc71-f136-4c8b-9da9-5b34af397d8d")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeOrRatioSelect lagValue;

	@JacksonXmlProperty(isAttribute=true, localName = "DurationType")
	@Description("The allowed types of task duration that specify the lag time      measurement (work time or elapsed time).")
	@Required()
	@Guid("9a00390a-a0d3-4bba-9267-7512fae616c3")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum durationType;


	public IfcLagTime()
	{
	}

	public IfcLagTime(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeOrRatioSelect lagValue, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum durationType)
	{
		this.lagValue = lagValue;
		this.durationType = durationType;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeOrRatioSelect getLagValue() {
		return this.lagValue;
	}

	public void setLagValue(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeOrRatioSelect lagValue) {
		this.lagValue = lagValue;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum getDurationType() {
		return this.durationType;
	}

	public void setDurationType(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum durationType) {
		this.durationType = durationType;
	}


}

