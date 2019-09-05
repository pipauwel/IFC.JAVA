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

@Guid("e06621e1-1a92-4dd8-8a42-1bba3e74e221")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSweptSurface extends IfcSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "SweptCurve")
	@Description("The curve to be swept in defining the surface. The curve is defined as a profile within the position coordinate system.")
	@Required()
	@Guid("8b9e9fbb-a7a2-4104-90fd-d098f43dd8c8")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptCurve;

	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	@Description("Position coordinate system for the swept surface, provided by a profile definition within the XY plane of the <em>Position</em> coordinates. If not provided, the position of the profile being swept is determined by the object coordinate system. In this case, the swept surface is not repositioned.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@Guid("f0c754b3-e364-4ba8-a03c-0167ea0aaded")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position;


	public IfcSweptSurface()
	{
	}

	public IfcSweptSurface(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptCurve)
	{
		this.sweptCurve = sweptCurve;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getSweptCurve() {
		return this.sweptCurve;
	}

	public void setSweptCurve(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef sweptCurve) {
		this.sweptCurve = sweptCurve;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D position) {
		this.position = position;
	}


}

