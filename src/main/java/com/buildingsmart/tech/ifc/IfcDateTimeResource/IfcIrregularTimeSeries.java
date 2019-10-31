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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcIrregularTimeSeriesValue;

@Guid("6b83f3bc-08a2-4147-aa9d-353fb6ea8b10")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIrregularTimeSeries extends IfcTimeSeries
{
	@Description("The collection of time series values.")
	@Required()
	@Guid("109b36cd-c8f8-4239-b51f-3d4feb67a4cd")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIrregularTimeSeriesValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Values")
	private List<IfcIrregularTimeSeriesValue> values;


	public IfcIrregularTimeSeries()
	{
	}

	public IfcIrregularTimeSeries(String name, String startTime, String endTime, IfcTimeSeriesDataTypeEnum timeSeriesDataType, IfcDataOriginEnum dataOrigin, IfcIrregularTimeSeriesValue[] values)
	{
		super(name, startTime, endTime, timeSeriesDataType, dataOrigin);
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public List<IfcIrregularTimeSeriesValue> getValues() {
		return this.values;
	}


}

