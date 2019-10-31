// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateOperation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem;

@Guid("506c5de0-1239-4940-bf42-bab69e86f4fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMapConversion extends IfcCoordinateOperation
{
	@Description("Specifies the location along the easting of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the x axis.</blockquote>")
	@Required()
	@Guid("90379900-4b34-4a0d-ac18-6252a9826f8d")
	@JacksonXmlProperty(isAttribute=true, localName = "Eastings")
	private double eastings;

	@Description("Specifies the location along the northing of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>")
	@Required()
	@Guid("5ecf06ef-a890-4175-bd87-5a66389c4a94")
	@JacksonXmlProperty(isAttribute=true, localName = "Northings")
	private double northings;

	@Description("Orthogonal height relativ to the vertical datum specified.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the z axis</blockquote>")
	@Required()
	@Guid("387d0354-e2c4-43ee-8794-44988ceda720")
	@JacksonXmlProperty(isAttribute=true, localName = "OrthogonalHeight")
	private double orthogonalHeight;

	@Description("Specifies the value along the easing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the x axis</blockquote>  <blockquote class=\"note\">NOTE&nbsp;2 together with the <em>XAxisOrdinate</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system</blockquote>")
	@Guid("fd51ced1-8bfd-4463-8c2d-da83ec682068")
	@JacksonXmlProperty(isAttribute=true, localName = "XAxisAbscissa")
	private double xAxisAbscissa;

	@Description("Specifies the value along the northing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>  <blockquote class=\"note\"NOTE&nbsp; together with the <em>XAxisAbscissa</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system.</blockquote>")
	@Guid("7cbfb2eb-9b52-4866-9d87-da9d89a90495")
	@JacksonXmlProperty(isAttribute=true, localName = "XAxisOrdinate")
	private double xAxisOrdinate;

	@Description("Scale to be used, when the units of the CRS are not identical to the units of the engineering coordinate system. If omited, the value of 1.0 is assumed.")
	@Guid("db27722d-93be-4e68-a96a-712ebbef1884")
	@JacksonXmlProperty(isAttribute=true, localName = "Scale")
	private double scale;


	public IfcMapConversion()
	{
	}

	public IfcMapConversion(IfcCoordinateReferenceSystemSelect sourceCRS, IfcCoordinateReferenceSystem targetCRS, double eastings, double northings, double orthogonalHeight)
	{
		super(sourceCRS, targetCRS);
		this.eastings = eastings;
		this.northings = northings;
		this.orthogonalHeight = orthogonalHeight;
	}

	public double getEastings() {
		return this.eastings;
	}

	public void setEastings(double eastings) {
		this.eastings = eastings;
	}

	public double getNorthings() {
		return this.northings;
	}

	public void setNorthings(double northings) {
		this.northings = northings;
	}

	public double getOrthogonalHeight() {
		return this.orthogonalHeight;
	}

	public void setOrthogonalHeight(double orthogonalHeight) {
		this.orthogonalHeight = orthogonalHeight;
	}

	public double getXAxisAbscissa() {
		return this.xAxisAbscissa;
	}

	public void setXAxisAbscissa(double xAxisAbscissa) {
		this.xAxisAbscissa = xAxisAbscissa;
	}

	public double getXAxisOrdinate() {
		return this.xAxisOrdinate;
	}

	public void setXAxisOrdinate(double xAxisOrdinate) {
		this.xAxisOrdinate = xAxisOrdinate;
	}

	public double getScale() {
		return this.scale;
	}

	public void setScale(double scale) {
		this.scale = scale;
	}


}

