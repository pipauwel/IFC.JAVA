// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("32a170a7-e0ba-48c0-9f27-f2a1df1265d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourcePositional extends IfcLightSource
{
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("Definition from ISO/CD 10303-46:1992: The Cartesian point indicates the position of the light source.  Definition from VRML97 - ISO/IEC 14772-1:1997: A Point light node illuminates geometry within radius of its location.")
	@Required()
	@Guid("b14f2740-7faa-41bf-b16f-b3811cd24338")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint position;

	@JacksonXmlProperty(isAttribute=true, localName = "Radius")
	@Description("The maximum distance from the light source for a surface still to be illuminated.  Definition from VRML97 - ISO/IEC 14772-1:1997: A Point light node illuminates geometry within radius of its location.")
	@Required()
	@Guid("e32ed7f9-1e64-44f1-890b-6a5b3397c943")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius;

	@JacksonXmlProperty(isAttribute=true, localName = "ConstantAttenuation")
	@Description("Definition from ISO/CD 10303-46:1992: This real indicates the value of the attenuation in the lighting equation that is constant.")
	@Required()
	@Guid("2effff58-264e-4ab4-9648-ba2409c15b7c")
	private double constantAttenuation;

	@JacksonXmlProperty(isAttribute=true, localName = "DistanceAttenuation")
	@Description("Definition from ISO/CD 10303-46:1992: This real indicates the value of the attenuation in the lighting equation that proportional to the distance from the light source.")
	@Required()
	@Guid("04cd93af-8e0e-4e24-bfeb-14b008f4908c")
	private double distanceAttenuation;

	@JacksonXmlProperty(isAttribute=true, localName = "QuadricAttenuation")
	@Description("This real indicates the value of the attenuation in the lighting equation that proportional to the square value of the distance from the light source.")
	@Required()
	@Guid("1cda05dc-8988-4938-babb-95a4caa843f7")
	private double quadricAttenuation;


	public IfcLightSourcePositional()
	{
	}

	public IfcLightSourcePositional(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb lightColour, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint position, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius, double constantAttenuation, double distanceAttenuation, double quadricAttenuation)
	{
		super(lightColour);
		this.position = position;
		this.radius = radius;
		this.constantAttenuation = constantAttenuation;
		this.distanceAttenuation = distanceAttenuation;
		this.quadricAttenuation = quadricAttenuation;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint position) {
		this.position = position;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getRadius() {
		return this.radius;
	}

	public void setRadius(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure radius) {
		this.radius = radius;
	}

	public double getConstantAttenuation() {
		return this.constantAttenuation;
	}

	public void setConstantAttenuation(double constantAttenuation) {
		this.constantAttenuation = constantAttenuation;
	}

	public double getDistanceAttenuation() {
		return this.distanceAttenuation;
	}

	public void setDistanceAttenuation(double distanceAttenuation) {
		this.distanceAttenuation = distanceAttenuation;
	}

	public double getQuadricAttenuation() {
		return this.quadricAttenuation;
	}

	public void setQuadricAttenuation(double quadricAttenuation) {
		this.quadricAttenuation = quadricAttenuation;
	}


}

