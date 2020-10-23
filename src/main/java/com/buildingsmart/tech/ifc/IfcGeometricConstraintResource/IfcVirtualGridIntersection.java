// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("f63d89d0-3786-4462-861e-92b27070fde7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVirtualGridIntersection implements IfcGridPlacementDirectionSelect
{
	@Description("Two grid axes which intersects at exactly one intersection (see also informal proposition at IfcGrid). If attribute OffsetDistances is omitted, the intersection defines the placement or ref direction of a grid placement directly. If OffsetDistances are given, the intersection is defined by the offset curves to the grid axes.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f48a97d0-61c3-4c40-99c4-36a4506a6ffc")
	@MinLength(2)
	@MaxLength(2)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcGridAxis")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "intersectingAxes")*/
	@JsonIgnore
	private List<IfcGridAxis> intersectingAxes;

	@Description("Offset distances to the grid axes. If given, it defines virtual offset curves to the grid axes. The intersection of the offset curves specify the virtual grid intersection.")
	@DataMember(Order = 1)
	@Required()
	@Guid("97ec914d-8dfe-4ce4-ad64-add422bb66ce")
	@MinLength(2)
	@MaxLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLengthMeasure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "offsetDistances")
	private List<IfcLengthMeasure> offsetDistances;


	public IfcVirtualGridIntersection()
	{
	}

	public IfcVirtualGridIntersection(IfcGridAxis[] intersectingAxes, IfcLengthMeasure[] offsetDistances)
	{
		this.intersectingAxes = new ArrayList<>(Arrays.asList(intersectingAxes));
		this.offsetDistances = new ArrayList<>(Arrays.asList(offsetDistances));
	}

	public List<IfcGridAxis> getIntersectingAxes() {
		return this.intersectingAxes;
	}

	public List<IfcLengthMeasure> getOffsetDistances() {
		return this.offsetDistances;
	}


}

