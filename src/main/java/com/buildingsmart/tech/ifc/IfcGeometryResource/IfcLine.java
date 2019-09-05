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

@Guid("28220f1d-2ef9-48f4-9aa6-198f7af996d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLine extends IfcCurve
{
	@JacksonXmlProperty(isAttribute=false, localName = "Pnt")
	@Description("The location of the <em>IfcLine</em>.")
	@Required()
	@Guid("efe6be19-11b9-4b75-9821-ae20d1d465ad")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint pnt;

	@JacksonXmlProperty(isAttribute=false, localName = "Dir")
	@Description("The direction of the <em>IfcLine</em>, the magnitude and units of <em>Dir</em> affect the parameterization of the line.")
	@Required()
	@Guid("da76faa5-1c45-41b8-80ce-79d00d362cd1")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector dir;


	public IfcLine()
	{
	}

	public IfcLine(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint pnt, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector dir)
	{
		this.pnt = pnt;
		this.dir = dir;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint getPnt() {
		return this.pnt;
	}

	public void setPnt(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint pnt) {
		this.pnt = pnt;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector getDir() {
		return this.dir;
	}

	public void setDir(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcVector dir) {
		this.dir = dir;
	}


}

