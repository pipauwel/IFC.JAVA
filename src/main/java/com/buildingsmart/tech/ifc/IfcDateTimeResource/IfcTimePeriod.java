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

@Guid("c4917737-5540-46fc-96d6-2876bd937053")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTimePeriod
{
	@JacksonXmlProperty(isAttribute=true, localName = "StartTime")
	@Description("Start time of the time period.")
	@Required()
	@Guid("8771f779-ba66-4908-b370-41a904395396")
	private String startTime;

	@JacksonXmlProperty(isAttribute=true, localName = "EndTime")
	@Description("End time of the time period.")
	@Required()
	@Guid("adf4c5ca-1648-4427-92d6-7c535073407a")
	private String endTime;


	public IfcTimePeriod()
	{
	}

	public IfcTimePeriod(String startTime, String endTime)
	{
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


}

