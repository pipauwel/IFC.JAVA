// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("70d36884-89fe-4808-9584-00b43dbc8c2e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRegularTimeSeries extends IfcTimeSeries
{
	@JacksonXmlProperty(isAttribute=true, localName = "TimeStep")
	@Description("A duration of time intervals between values.")
	@Required()
	@Guid("c03d4c51-c227-440c-a75b-1342ff50e501")
	private double timeStep;

	@Description("The collection of time series values.")
	@Required()
	@MinLength(1)
	@Guid("da56ea3c-6840-43b6-8ec4-5e3a6235d868")
	private List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesValue> values = new ArrayList<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesValue>();


	public IfcRegularTimeSeries()
	{
	}

	public IfcRegularTimeSeries(String name, String startTime, String endTime, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum timeSeriesDataType, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin, double timeStep, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesValue[] values)
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

	public List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesValue> getValues() {
		return this.values;
	}


}

