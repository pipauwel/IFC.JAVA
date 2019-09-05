// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("de606da2-a6cd-4560-a4c7-0e89276bc4ca")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "ExtrudedDirection")
	@Description("The direction of the extrusion.")
	@Required()
	@Guid("0f7fc3fd-9211-4ce1-8cc9-408ea774da47")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection;

	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("The depth of the extrusion, it determines the parameterization.")
	@Required()
	@Guid("4a50c089-187a-47a1-bae2-528540dc9218")
	private double depth;


	public IfcSurfaceOfLinearExtrusion()
	{
	}

	public IfcSurfaceOfLinearExtrusion(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptCurve, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection, double depth)
	{
		super(sweptCurve);
		this.extrudedDirection = extrudedDirection;
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getExtrudedDirection() {
		return this.extrudedDirection;
	}

	public void setExtrudedDirection(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection) {
		this.extrudedDirection = extrudedDirection;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector getExtrusionAxis() {
		return null;
	}


}

