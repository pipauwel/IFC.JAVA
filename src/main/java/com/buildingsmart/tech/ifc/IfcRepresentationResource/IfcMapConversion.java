// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("506c5de0-1239-4940-bf42-bab69e86f4fd")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMapConversion extends IfcCoordinateOperation
{
	@Description("Specifies the location along the easting of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the x axis.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("90379900-4b34-4a0d-ac18-6252a9826f8d")
	@JacksonXmlProperty(isAttribute=false, localName = "eastings")
	private IfcLengthMeasure eastings;

	@Description("Specifies the location along the northing of the coordinate system of the target map coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("5ecf06ef-a890-4175-bd87-5a66389c4a94")
	@JacksonXmlProperty(isAttribute=false, localName = "northings")
	private IfcLengthMeasure northings;

	@Description("Orthogonal height relativ to the vertical datum specified.  <blockquote class=\"note\">NOTE&nbsp; for right-handed Cartesian coordinate systems this would establish the location along the z axis</blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("387d0354-e2c4-43ee-8794-44988ceda720")
	@JacksonXmlProperty(isAttribute=false, localName = "orthogonalHeight")
	private IfcLengthMeasure orthogonalHeight;

	@Description("Specifies the value along the easing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the x axis</blockquote>  <blockquote class=\"note\">NOTE&nbsp;2 together with the <em>XAxisOrdinate</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system</blockquote>")
	@DataMember(Order = 3)
	@Guid("fd51ced1-8bfd-4463-8c2d-da83ec682068")
	@JacksonXmlProperty(isAttribute=false, localName = "xAxisAbscissa")
	private IfcReal xAxisAbscissa;

	@Description("Specifies the value along the northing axis of the end point of a vector indicating the position of the local x axis of the engineering coordinate reference system.  <blockquote class=\"note\">NOTE&nbsp;1 for right-handed Cartesian coordinate systems this would establish the location along the y axis</blockquote>  <blockquote class=\"note\"NOTE&nbsp; together with the <em>XAxisAbscissa</em> it provides the direction of the local x axis within the horizontal plane of the map coordinate system.</blockquote>")
	@DataMember(Order = 4)
	@Guid("7cbfb2eb-9b52-4866-9d87-da9d89a90495")
	@JacksonXmlProperty(isAttribute=false, localName = "xAxisOrdinate")
	private IfcReal xAxisOrdinate;

	@Description("Scale to be used, when the units of the CRS are not identical to the units of the engineering coordinate system. If omited, the value of 1.0 is assumed.")
	@DataMember(Order = 5)
	@Guid("db27722d-93be-4e68-a96a-712ebbef1884")
	@JacksonXmlProperty(isAttribute=false, localName = "scale")
	private IfcReal scale;


	public IfcMapConversion()
	{
	}

	public IfcMapConversion(IfcCoordinateReferenceSystemSelect sourceCRS, IfcCoordinateReferenceSystem targetCRS,
							IfcLengthMeasure eastings, IfcLengthMeasure northings, IfcLengthMeasure orthogonalHeight)
	{
		super(sourceCRS, targetCRS);
		this.eastings = eastings;
		this.northings = northings;
		this.orthogonalHeight = orthogonalHeight;
	}

	public IfcLengthMeasure getEastings() {
		return this.eastings;
	}

	public void setEastings(IfcLengthMeasure eastings) {
		this.eastings = eastings;
	}

	public IfcLengthMeasure getNorthings() {
		return this.northings;
	}

	public void setNorthings(IfcLengthMeasure northings) {
		this.northings = northings;
	}

	public IfcLengthMeasure getOrthogonalHeight() {
		return this.orthogonalHeight;
	}

	public void setOrthogonalHeight(IfcLengthMeasure orthogonalHeight) {
		this.orthogonalHeight = orthogonalHeight;
	}

	public IfcReal getXAxisAbscissa() {
		return this.xAxisAbscissa;
	}

	public void setXAxisAbscissa(IfcReal xAxisAbscissa) {
		this.xAxisAbscissa = xAxisAbscissa;
	}

	public IfcReal getXAxisOrdinate() {
		return this.xAxisOrdinate;
	}

	public void setXAxisOrdinate(IfcReal xAxisOrdinate) {
		this.xAxisOrdinate = xAxisOrdinate;
	}

	public IfcReal getScale() {
		return this.scale;
	}

	public void setScale(IfcReal scale) {
		this.scale = scale;
	}


}

