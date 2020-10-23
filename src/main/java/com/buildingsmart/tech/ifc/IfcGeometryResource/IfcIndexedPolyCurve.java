// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("6a61359a-e664-4f61-bb8c-2591f63d0f6d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedPolyCurve extends IfcBoundedCurve
{
	@Description("A list of points, provided by a point list of either two, or three dimensions, that is used to define the poly curve. If the attribute <em>Segments</em> is not provided, the poly curve is generated as a poly line by connecting the points in the order of their appearance in the point list. If the attribute <em>Segments</em> is provided, the segments determine, how the points are to be used to create straigth and circular arc segments.")
	@DataMember(Order = 0)
	@Required()
	@Guid("6fb9d816-9c8e-41ae-9189-8cf7c574a303")
	@JacksonXmlProperty(isAttribute=false, localName = "points")
	private IfcCartesianPointList points;

	@Description("List of straight line and circular arc segments, each providing a list of indices into the Cartesian point list. Indices should preserve consecutive connectivity between the segments, the start index of the next segment shall be identical with the end index of the previous segment.")
	@DataMember(Order = 1)
	@Guid("9bc9b862-82ed-4798-9a2a-b0db4138f62d")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcSegmentIndexSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "segments")
	private List<IfcSegmentIndexSelect> segments;

	@Description("Indication of whether the curve intersects itself or not; this is for information only.")
	@DataMember(Order = 2)
	@Guid("8fe6fe4d-ed5b-4196-aa43-afe0c30eb2d0")
	@JacksonXmlProperty(isAttribute=false, localName = "selfIntersect")
	private IfcBoolean selfIntersect;


	public IfcIndexedPolyCurve()
	{
	}

	public IfcIndexedPolyCurve(IfcCartesianPointList points)
	{
		this.points = points;
	}

	public IfcCartesianPointList getPoints() {
		return this.points;
	}

	public void setPoints(IfcCartesianPointList points) {
		this.points = points;
	}

	public List<IfcSegmentIndexSelect> getSegments() {
		return this.segments;
	}

	public IfcBoolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(IfcBoolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}


}

