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

@Guid("44ca119b-b80f-48db-834e-51a7ccb0213b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTimeSeriesValue
{
	@Description("A list of time-series values. At least one value is required.")
	@Required()
	@MinLength(1)
	@Guid("05b6422d-b373-4182-83c9-0abf54079150")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> listValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();


	public IfcTimeSeriesValue()
	{
	}

	public IfcTimeSeriesValue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue[] listValues)
	{
		this.listValues = new ArrayList<>(Arrays.asList(listValues));
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getListValues() {
		return this.listValues;
	}


}

