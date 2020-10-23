// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis1Placement;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcLine;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPlaneAngleMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("81970f2f-c63e-4133-adaf-c74d522cb449")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRevolvedAreaSolidTapered.class, name = "IfcRevolvedAreaSolidTapered"))
public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid
{
	@Description("Axis about which revolution will take place.")
	@DataMember(Order = 0)
	@Required()
	@Guid("7d721792-8d9e-4a49-84d2-65251bbed28a")
	@JacksonXmlProperty(isAttribute=false, localName = "axis")
	private IfcAxis1Placement axis;

	@Description("The angle through which the sweep will be made. This angle is measured from the plane of the swept area provided by the XY plane of the position coordinate system.")
	@DataMember(Order = 1)
	@Required()
	@Guid("1119b572-18c2-4c9a-b4cf-e146b2426614")
	@JacksonXmlProperty(isAttribute=true, localName = "angle")
	private IfcPlaneAngleMeasure angle;


	public IfcRevolvedAreaSolid()
	{
	}

	public IfcRevolvedAreaSolid(IfcProfileDef sweptArea, IfcAxis1Placement axis, IfcPlaneAngleMeasure angle)
	{
		super(sweptArea);
		this.axis = axis;
		this.angle = angle;
	}

	public IfcAxis1Placement getAxis() {
		return this.axis;
	}

	public void setAxis(IfcAxis1Placement axis) {
		this.axis = axis;
	}

	public IfcPlaneAngleMeasure getAngle() {
		return this.angle;
	}

	public void setAngle(IfcPlaneAngleMeasure angle) {
		this.angle = angle;
	}

	@JsonIgnore
	public IfcLine getAxisLine() {
		//AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(Axis.Location,
		// IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(Axis.Z,1.0));
		return new IfcLine(axis.getLocation(),new IfcVector(axis.getZ(),new IfcLengthMeasure(1.0)));
	}


}

