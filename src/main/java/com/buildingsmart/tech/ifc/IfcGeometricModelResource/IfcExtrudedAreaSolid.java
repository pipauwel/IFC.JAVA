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

@Guid("f65777d3-6cb6-48f6-8a26-d79b570cdfb2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid
{
	@JacksonXmlProperty(isAttribute=false, localName = "ExtrudedDirection")
	@Description("The direction in which the surface, provided by <em>SweptArea</em> is to be swept.")
	@Required()
	@Guid("aef4b8f4-190c-4dbd-a5ef-4ad2bf1d00a3")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection;

	@JacksonXmlProperty(isAttribute=true, localName = "Depth")
	@Description("The distance the surface is to be swept along the <em>ExtrudedDirection</em>.")
	@Required()
	@Guid("a0e24ce6-15a3-49a4-827b-25a7987a23f7")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth;


	public IfcExtrudedAreaSolid()
	{
	}

	public IfcExtrudedAreaSolid(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptArea, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth)
	{
		super(sweptArea);
		this.extrudedDirection = extrudedDirection;
		this.depth = depth;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection getExtrudedDirection() {
		return this.extrudedDirection;
	}

	public void setExtrudedDirection(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection extrudedDirection) {
		this.extrudedDirection = extrudedDirection;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}


}

