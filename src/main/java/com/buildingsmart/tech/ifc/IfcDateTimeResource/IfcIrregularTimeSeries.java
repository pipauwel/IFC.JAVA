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

@Guid("6b83f3bc-08a2-4147-aa9d-353fb6ea8b10")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIrregularTimeSeries extends IfcTimeSeries
{
	@Description("The collection of time series values.")
	@Required()
	@MinLength(1)
	@Guid("109b36cd-c8f8-4239-b51f-3d4feb67a4cd")
	private List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcIrregularTimeSeriesValue> values = new ArrayList<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcIrregularTimeSeriesValue>();


	public IfcIrregularTimeSeries()
	{
	}

	public IfcIrregularTimeSeries(String name, String startTime, String endTime, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeSeriesDataTypeEnum timeSeriesDataType, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDataOriginEnum dataOrigin, com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcIrregularTimeSeriesValue[] values)
	{
		super(name, startTime, endTime, timeSeriesDataType, dataOrigin);
		this.values = new ArrayList<>(Arrays.asList(values));
	}

	public List<com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcIrregularTimeSeriesValue> getValues() {
		return this.values;
	}


}

