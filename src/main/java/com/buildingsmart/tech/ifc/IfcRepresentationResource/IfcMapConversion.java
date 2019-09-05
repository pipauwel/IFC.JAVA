// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("506c5de0-1239-4940-bf42-bab69e86f4fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMapConversion extends IfcCoordinateOperation
{
	@JacksonXmlProperty(isAttribute=true, localName = "Eastings")
	@Description("Specifies the location along the easting of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the x axis.</blockquote>")
	@Required()
	@Guid("90379900-4b34-4a0d-ac18-6252a9826f8d")
	private double eastings;

	@JacksonXmlProperty(isAttribute=true, localName = "Northings")
	@Description("Specifies the location along the northing of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>")
	@Required()
	@Guid("5ecf06ef-a890-4175-bd87-5a66389c4a94")
	private double northings;

	@JacksonXmlProperty(isAttribute=true, localName = "OrthogonalHeight")
	@Description("Orthogonal height relativ to the vertical datum specified.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the z axis</blockquote>")
	@Required()
	@Guid("387d0354-e2c4-43ee-8794-44988ceda720")
	private double orthogonalHeight;

	@JacksonXmlProperty(isAttribute=true, localName = "XAxisAbscissa")
	@Description("Specifies the value along the easing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the x axis</blockquote>  <blockquote class=\"note\">NOTE&nbsp;2 together with the <em>XAxisOrdinate</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system</blockquote>")
	@Guid("fd51ced1-8bfd-4463-8c2d-da83ec682068")
	private double xAxisAbscissa;

	@JacksonXmlProperty(isAttribute=true, localName = "XAxisOrdinate")
	@Description("Specifies the value along the northing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>  <blockquote class=\"note\"NOTE&nbsp; together with the <em>XAxisAbscissa</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system.</blockquote>")
	@Guid("7cbfb2eb-9b52-4866-9d87-da9d89a90495")
	private double xAxisOrdinate;

	@JacksonXmlProperty(isAttribute=true, localName = "Scale")
	@Description("Scale to be used, when the units of the CRS are not identical to the units of the engineering coordinate system. If omited, the value of 1.0 is assumed.")
	@Guid("db27722d-93be-4e68-a96a-712ebbef1884")
	private double scale;


	public IfcMapConversion()
	{
	}

	public IfcMapConversion(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystemSelect sourceCRS, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcCoordinateReferenceSystem targetCRS, double eastings, double northings, double orthogonalHeight)
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

