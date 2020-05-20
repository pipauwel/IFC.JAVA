// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f65777d3-6cb6-48f6-8a26-d79b570cdfb2")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcExtrudedAreaSolidTapered.class, name = "IfcExtrudedAreaSolidTapered"))
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid
{
	@Description("The direction in which the surface, provided by <em>SweptArea</em> is to be swept.")
	@DataMember(Order = 0)
	@Required()
	@Guid("aef4b8f4-190c-4dbd-a5ef-4ad2bf1d00a3")
	@JacksonXmlProperty(isAttribute=false, localName = "extrudedDirection")
	private IfcDirection extrudedDirection;

	@Description("The distance the surface is to be swept along the <em>ExtrudedDirection</em>.")
	@DataMember(Order = 1)
	@Required()
	@Guid("a0e24ce6-15a3-49a4-827b-25a7987a23f7")
	@JacksonXmlProperty(isAttribute=false, localName = "depth")
	private IfcPositiveLengthMeasure depth;


	public IfcExtrudedAreaSolid()
	{
	}

	public IfcExtrudedAreaSolid(IfcProfileDef sweptArea, IfcDirection extrudedDirection, IfcPositiveLengthMeasure depth)
	{
		super(sweptArea);
		this.extrudedDirection = extrudedDirection;
		this.depth = depth;
	}

	public IfcDirection getExtrudedDirection() {
		return this.extrudedDirection;
	}

	public void setExtrudedDirection(IfcDirection extrudedDirection) {
		this.extrudedDirection = extrudedDirection;
	}

	public IfcPositiveLengthMeasure getDepth() {
		return this.depth;
	}

	public void setDepth(IfcPositiveLengthMeasure depth) {
		this.depth = depth;
	}


}

