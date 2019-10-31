// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBlock;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcRectangularPyramid;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcRightCircularCone;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcRightCircularCylinder;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSphere;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;

@Guid("538f2550-e0fc-4704-97f7-66d555de1ae4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBlock.class, name = "IfcBlock"), @JsonSubTypes.Type(value = IfcRectangularPyramid.class, name = "IfcRectangularPyramid"), @JsonSubTypes.Type(value = IfcRightCircularCone.class, name = "IfcRightCircularCone"), @JsonSubTypes.Type(value = IfcRightCircularCylinder.class, name = "IfcRightCircularCylinder"), @JsonSubTypes.Type(value = IfcSphere.class, name = "IfcSphere")})
public abstract class IfcCsgPrimitive3D extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, IfcCsgSelect
{
	@Description("The placement coordinate system to which the parameters of each individual CSG primitive apply.")
	@Required()
	@Guid("623bbeab-dc08-4cb6-83ef-232501104ec3")
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
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

	public int getDim() {
		return 0;
	}


}

