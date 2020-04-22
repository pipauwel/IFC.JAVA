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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;

@Guid("44ca119b-b80f-48db-834e-51a7ccb0213b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTimeSeriesValue
{
	@Description("A list of time-series values. At least one value is required.")
	@DataMember(Order = 0)
	@Required()
	@Guid("05b6422d-b373-4182-83c9-0abf54079150")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ListValues")
	private List<IfcValue> listValues;


	public IfcTimeSeriesValue()
	{
	}

	public IfcTimeSeriesValue(IfcValue[] listValues)
	{
		this.listValues = new ArrayList<>(Arrays.asList(listValues));
	}

	public List<IfcValue> getListValues() {
		return this.listValues;
	}


}

