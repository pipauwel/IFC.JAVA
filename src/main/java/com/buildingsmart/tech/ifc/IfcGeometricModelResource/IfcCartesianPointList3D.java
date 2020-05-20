// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.UUID;

@Guid("18fe3405-d1b4-4632-b93d-b36e1cdf00c1")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "globalId")
public class IfcCartesianPointList3D extends IfcCartesianPointList
{
	@Description("Internal ID")
	@Required()
	@JacksonXmlProperty(isAttribute=true, localName = "globalId")
	private UUID globalId;

	@Description("Two-dimensional list of Cartesian points provided by three coordinates.")
	@DataMember(Order = 0)
	@Required()
	@Guid("eda33e5f-5fc8-41a1-bd3a-470744cb85ff")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coordList")
	private List<IfcCartesianPoint> coordList; //This used to be a List<List<IfcLengthMeasure>>


	public IfcCartesianPointList3D()
	{
		this.globalId = UUID.randomUUID();
	}

	public IfcCartesianPointList3D(List<IfcCartesianPoint> coordList)
	{
		this();
		this.coordList = coordList;
	}

	public UUID getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(UUID globalId) {
		this.globalId = globalId;
	}

	public List<IfcCartesianPoint> getCoordList() {
		return this.coordList;
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}

}

