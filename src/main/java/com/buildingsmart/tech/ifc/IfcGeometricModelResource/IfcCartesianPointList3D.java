// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList;

@Guid("18fe3405-d1b4-4632-b93d-b36e1cdf00c1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianPointList3D extends IfcCartesianPointList
{
	@Description("Two-dimensional list of Cartesian points provided by three coordinates.")
	@Required()
	@Guid("eda33e5f-5fc8-41a1-bd3a-470744cb85ff")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "CoordList")
	private List<Double> coordList;


	public IfcCartesianPointList3D()
	{
	}

	public IfcCartesianPointList3D(Double[] coordList)
	{
		this.coordList = new ArrayList<>(Arrays.asList(coordList));
	}

	public List<Double> getCoordList() {
		return this.coordList;
	}


}

