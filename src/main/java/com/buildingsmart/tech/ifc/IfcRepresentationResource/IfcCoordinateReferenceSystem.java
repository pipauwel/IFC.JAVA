// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("55d837bf-64b2-4c83-9324-044e57cbaa9f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcProjectedCRS.class, name = "IfcProjectedCRS"))
public abstract class IfcCoordinateReferenceSystem implements IfcCoordinateReferenceSystemSelect
{
	@Description("Name by which the coordinate reference system is identified.  <blockquote class=\"note\">NOTE&nbsp; The name shall be taken from the list recognized by the European Petroleum Survey Group EPSG. It should then be qualified by the EPSG name space, for example as 'EPSG:5555'.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("c63d80a5-78a4-45e3-bf15-d9302cdb83f2")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Informal description of this coordinate reference system.")
	@DataMember(Order = 1)
	@Guid("57c4c379-aba3-4224-8587-dca78467e649")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("Name by which this datum is identified. The geodetic datum is associated with the coordinate reference system and indicates the shape and size of the rotation ellipsoid and this ellipsoid's connection and orientation to the actual globe/earth. It needs to be provided, if the <em>Name</em> identifier does not unambiguously define the geodetic datum as well.    <blockquote class=\"examples\">EXAMPLE&nbsp; geodetic datums include:  <ul class=\"note\">    <li class=\"note\">ED50</li>    <li class=\"note\">EUREF89</li>    <li class=\"note\">WSG84</li>  <ul>  </blockquote>")
	@DataMember(Order = 2)
	@Guid("f0796f25-9125-47e1-9c5f-3e9ed0ed75d1")
	@JacksonXmlProperty(isAttribute=true, localName = "GeodeticDatum")
	private String geodeticDatum;

	@Description("Name by which the vertical datum is identified. The vertical datum is associated with the height axis of the coordinate reference system and indicates the reference plane and fundamental point defining the origin of a height system. It needs to be provided, if the <em>Name</em> identifier does not unambiguously define the vertical datum as well and if the coordinate reference system is a 3D reference system.    <blockquote class=\"examples\">EXAMPLE&nbsp; vertical datums include:  <ul class=\"note\">    <li class=\"note\">DHHN92: the German 'Haupth&ouml;hennetz'</li>    <li class=\"note\">EVRS2007; the European Vertical Reference System</li>  </ul>  </blockquote>")
	@DataMember(Order = 3)
	@Guid("bb23b255-0bb4-42f6-b611-ac08f796ce77")
	@JacksonXmlProperty(isAttribute=true, localName = "VerticalDatum")
	private String verticalDatum;

	@Description("Indicates conversion between coordinate systems. In particular it refers to an <em>IfcCoordinateOperation</em> between this coordinate reference system, and another Geographic coordinate reference system.")
	@Guid("83795333-6df7-46ac-b61e-5101640f8615")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCoordinateOperation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasCoordinateOperation")
	private Set<IfcCoordinateOperation> hasCoordinateOperation;


	public IfcCoordinateReferenceSystem()
	{
	}

	public IfcCoordinateReferenceSystem(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGeodeticDatum() {
		return this.geodeticDatum;
	}

	public void setGeodeticDatum(String geodeticDatum) {
		this.geodeticDatum = geodeticDatum;
	}

	public String getVerticalDatum() {
		return this.verticalDatum;
	}

	public void setVerticalDatum(String verticalDatum) {
		this.verticalDatum = verticalDatum;
	}

	public Set<IfcCoordinateOperation> getHasCoordinateOperation() {
		return this.hasCoordinateOperation;
	}


}

