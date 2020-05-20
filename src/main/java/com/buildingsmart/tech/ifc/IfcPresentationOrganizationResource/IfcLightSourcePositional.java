// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcReal;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("32a170a7-e0ba-48c0-9f27-f2a1df1265d0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcLightSourceSpot.class, name = "IfcLightSourceSpot"))
public class IfcLightSourcePositional extends IfcLightSource
{
	@Description("Definition from ISO/CD 10303-46:1992: The Cartesian point indicates the position of the light source.  Definition from VRML97 - ISO/IEC 14772-1:1997: A Point light node illuminates geometry within radius of its location.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b14f2740-7faa-41bf-b16f-b3811cd24338")
	@JacksonXmlProperty(isAttribute=false, localName = "position")
	private IfcCartesianPoint position;

	@Description("The maximum distance from the light source for a surface still to be illuminated.  Definition from VRML97 - ISO/IEC 14772-1:1997: A Point light node illuminates geometry within radius of its location.")
	@DataMember(Order = 1)
	@Required()
	@Guid("e32ed7f9-1e64-44f1-890b-6a5b3397c943")
	@JacksonXmlProperty(isAttribute=false, localName = "radius")
	private IfcPositiveLengthMeasure radius;

	@Description("Definition from ISO/CD 10303-46:1992: This real indicates the value of the attenuation in the lighting equation that is constant.")
	@DataMember(Order = 2)
	@Required()
	@Guid("2effff58-264e-4ab4-9648-ba2409c15b7c")
	@JacksonXmlProperty(isAttribute=false, localName = "constantAttenuation")
	private IfcReal constantAttenuation;

	@Description("Definition from ISO/CD 10303-46:1992: This real indicates the value of the attenuation in the lighting equation that proportional to the distance from the light source.")
	@DataMember(Order = 3)
	@Required()
	@Guid("04cd93af-8e0e-4e24-bfeb-14b008f4908c")
	@JacksonXmlProperty(isAttribute=false, localName = "distanceAttenuation")
	private IfcReal distanceAttenuation;

	@Description("This real indicates the value of the attenuation in the lighting equation that proportional to the square value of the distance from the light source.")
	@DataMember(Order = 4)
	@Required()
	@Guid("1cda05dc-8988-4938-babb-95a4caa843f7")
	@JacksonXmlProperty(isAttribute=false, localName = "quadricAttenuation")
	private IfcReal quadricAttenuation;


	public IfcLightSourcePositional()
	{
	}

	public IfcLightSourcePositional(IfcColourRgb lightColour, IfcCartesianPoint position, IfcPositiveLengthMeasure radius,
									IfcReal constantAttenuation, IfcReal distanceAttenuation, IfcReal quadricAttenuation)
	{
		super(lightColour);
		this.position = position;
		this.radius = radius;
		this.constantAttenuation = constantAttenuation;
		this.distanceAttenuation = distanceAttenuation;
		this.quadricAttenuation = quadricAttenuation;
	}

	public IfcCartesianPoint getPosition() {
		return this.position;
	}

	public void setPosition(IfcCartesianPoint position) {
		this.position = position;
	}

	public IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}

	public IfcReal getConstantAttenuation() {
		return this.constantAttenuation;
	}

	public void setConstantAttenuation(IfcReal constantAttenuation) {
		this.constantAttenuation = constantAttenuation;
	}

	public IfcReal getDistanceAttenuation() {
		return this.distanceAttenuation;
	}

	public void setDistanceAttenuation(IfcReal distanceAttenuation) {
		this.distanceAttenuation = distanceAttenuation;
	}

	public IfcReal getQuadricAttenuation() {
		return this.quadricAttenuation;
	}

	public void setQuadricAttenuation(IfcReal quadricAttenuation) {
		this.quadricAttenuation = quadricAttenuation;
	}


}

