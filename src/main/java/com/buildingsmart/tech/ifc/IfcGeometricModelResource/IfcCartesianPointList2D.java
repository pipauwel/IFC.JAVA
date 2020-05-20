// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("14ee71bc-ac06-4564-9ce3-0b8651e89195")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianPointList2D extends IfcCartesianPointList
{
	@Description("Two-dimensional list of Cartesian points provided by two coordinates.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a3773106-857a-4020-a6b4-6b914b9fbac1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coordList")
	private List<IfcCartesianPoint> coordList;  //This used to be a List<List<IfcLengthMeasure>>


	public IfcCartesianPointList2D()
	{
	}

	public IfcCartesianPointList2D(List<IfcCartesianPoint> coordList)
	{
		this.coordList = coordList;
	}

	public List<IfcCartesianPoint> getCoordList() {
		return this.coordList;
	}

	@JsonIgnore
	public int getDim() {
		return 2;
	}

}

