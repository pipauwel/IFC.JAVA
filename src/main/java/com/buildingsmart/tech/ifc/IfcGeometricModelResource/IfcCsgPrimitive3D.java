// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("538f2550-e0fc-4704-97f7-66d555de1ae4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcCsgPrimitive3D extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, IfcCsgSelect
{
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("The placement coordinate system to which the parameters of each individual CSG primitive apply.")
	@Required()
	@Guid("623bbeab-dc08-4cb6-83ef-232501104ec3")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position;


	public IfcCsgPrimitive3D()
	{
	}

	public IfcCsgPrimitive3D(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position)
	{
		this.position = position;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position) {
		this.position = position;
	}

	public int getDim() {
		return 0;
	}


}

