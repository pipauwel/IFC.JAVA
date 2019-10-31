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

@Guid("c4917737-5540-46fc-96d6-2876bd937053")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTimePeriod
{
	@Description("Start time of the time period.")
	@Required()
	@Guid("8771f779-ba66-4908-b370-41a904395396")
	@JacksonXmlProperty(isAttribute=true, localName = "StartTime")
	private String startTime;

	@Description("End time of the time period.")
	@Required()
	@Guid("adf4c5ca-1648-4427-92d6-7c535073407a")
	@JacksonXmlProperty(isAttribute=true, localName = "EndTime")
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

