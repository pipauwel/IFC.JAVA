// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

