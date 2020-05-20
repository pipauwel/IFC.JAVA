// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("538f2550-e0fc-4704-97f7-66d555de1ae4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBlock.class, name = "IfcBlock"), @JsonSubTypes.Type(value = IfcRectangularPyramid.class, name = "IfcRectangularPyramid"), @JsonSubTypes.Type(value = IfcRightCircularCone.class, name = "IfcRightCircularCone"), @JsonSubTypes.Type(value = IfcRightCircularCylinder.class, name = "IfcRightCircularCylinder"), @JsonSubTypes.Type(value = IfcSphere.class, name = "IfcSphere")})
public abstract class IfcCsgPrimitive3D extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, IfcCsgSelect
{
	@Description("The placement coordinate system to which the parameters of each individual CSG primitive apply.")
	@DataMember(Order = 0)
	@Required()
	@Guid("623bbeab-dc08-4cb6-83ef-232501104ec3")
	@JacksonXmlProperty(isAttribute=false, localName = "position")
	private IfcAxis2Placement3D position;


	public IfcCsgPrimitive3D()
	{
	}

	public IfcCsgPrimitive3D(IfcAxis2Placement3D position)
	{
		this.position = position;
	}

	public IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(IfcAxis2Placement3D position) {
		this.position = position;
	}

	@JsonIgnore
	public int getDim() {
		return 3;
	}


}

