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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeries;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesValue;

@Guid("70d36884-89fe-4808-9584-00b43dbc8c2e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRegularTimeSeries extends IfcTimeSeries
{
	@Description("A duration of time intervals between values.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c03d4c51-c227-440c-a75b-1342ff50e501")
	@JacksonXmlProperty(isAttribute=true, localName = "TimeStep")
	private double timeStep;

	@Description("The collection of time series values.")
	@DataMember(Order = 1)
	@Required()
	@Guid("da56ea3c-6840-43b6-8ec4-5e3a6235d868")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcTimeSeriesValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Values")
	private List<IfcTimeSeriesValue> values;


	public IfcRegularTimeSeries()
	{
	}

	public IfcRegularTimeSeries(String name, String startTime, String endTime, IfcTimeSeriesDataTypeEnum timeSeriesDataType, IfcDataOriginEnum dataOrigin, double timeStep, IfcTimeSeriesValue[] values)
	{
		super(name, startTime, endTime, timeSeriesDataType, dataOrigin);
		this.timeStep = timeStep;
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public double getTimeStep() {
		return this.timeStep;
	}

	public void setTimeStep(double timeStep) {
		this.timeStep = timeStep;
	}

	public List<IfcTimeSeriesValue> getValues() {
		return this.values;
	}


}

