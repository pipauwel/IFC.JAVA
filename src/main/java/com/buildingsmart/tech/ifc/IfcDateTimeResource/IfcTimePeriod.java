// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c4917737-5540-46fc-96d6-2876bd937053")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTimePeriod
{
	@Description("Start time of the time period.")
	@DataMember(Order = 0)
	@Required()
	@Guid("8771f779-ba66-4908-b370-41a904395396")
	@JacksonXmlProperty(isAttribute=false, localName = "startTime")
	private IfcTime startTime;

	@Description("End time of the time period.")
	@DataMember(Order = 1)
	@Required()
	@Guid("adf4c5ca-1648-4427-92d6-7c535073407a")
	@JacksonXmlProperty(isAttribute=false, localName = "endTime")
	private IfcTime endTime;


	public IfcTimePeriod()
	{
	}

	public IfcTimePeriod(IfcTime startTime, IfcTime endTime)
	{
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public IfcTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(IfcTime startTime) {
		this.startTime = startTime;
	}

	public IfcTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(IfcTime endTime) {
		this.endTime = endTime;
	}


}

