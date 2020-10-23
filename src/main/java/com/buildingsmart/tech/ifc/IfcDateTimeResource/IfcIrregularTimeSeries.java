// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("6b83f3bc-08a2-4147-aa9d-353fb6ea8b10")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIrregularTimeSeries extends IfcTimeSeries
{
	@Description("The collection of time series values.")
	@DataMember(Order = 0)
	@Required()
	@Guid("109b36cd-c8f8-4239-b51f-3d4feb67a4cd")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIrregularTimeSeriesValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "values")
	private List<IfcIrregularTimeSeriesValue> values;


	public IfcIrregularTimeSeries()
	{
	}

	public IfcIrregularTimeSeries(IfcLabel name, IfcDateTime startTime, IfcDateTime endTime, IfcTimeSeriesDataTypeEnum timeSeriesDataType, IfcDataOriginEnum dataOrigin, IfcIrregularTimeSeriesValue[] values)
	{
		super(name, startTime, endTime, timeSeriesDataType, dataOrigin);
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public List<IfcIrregularTimeSeriesValue> getValues() {
		return this.values;
	}


}

