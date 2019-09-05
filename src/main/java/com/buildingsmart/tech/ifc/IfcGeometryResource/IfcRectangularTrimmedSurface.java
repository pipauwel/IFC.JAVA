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

@Guid("25bb1436-242e-4954-a716-597d8e9ba615")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangularTrimmedSurface extends IfcBoundedSurface
{
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	@Description("Surface being trimmed.")
	@Required()
	@Guid("2b292506-6136-479a-9255-a02ef4d16fa9")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface;

	@JacksonXmlProperty(isAttribute=true, localName = "U1")
	@Description("First u parametric value.")
	@Required()
	@Guid("15237180-8fcc-4bed-a1ef-26b540fe861e")
	private double u1;

	@JacksonXmlProperty(isAttribute=true, localName = "V1")
	@Description("First v parametric value.")
	@Required()
	@Guid("f0aaaef2-f79e-42d5-85f8-c8494f5a575b")
	private double v1;

	@JacksonXmlProperty(isAttribute=true, localName = "U2")
	@Description("Second u parametric value.")
	@Required()
	@Guid("1f5188e3-40dc-4708-9067-d8ce2a75609e")
	private double u2;

	@JacksonXmlProperty(isAttribute=true, localName = "V2")
	@Description("Second v parametric value.")
	@Required()
	@Guid("fdec4f9a-ac75-4d58-8ca8-70266df5c502")
	private double v2;

	@JacksonXmlProperty(isAttribute=true, localName = "Usense")
	@Description("Flag to indicate whether the direction of the first parameter of the trimmed surface agrees with or opposes the sense of u in the basis surface.")
	@Required()
	@Guid("84dd552c-ed43-4b01-ad77-9d47469c7b67")
	private Boolean usense;

	@JacksonXmlProperty(isAttribute=true, localName = "Vsense")
	@Description("Flag to indicate whether the direction of the second parameter of the trimmed surface agrees with or opposes the sense of v in the basis surface.")
	@Required()
	@Guid("3236b0bf-0d50-4b41-a891-8356e96558f8")
	private Boolean vsense;


	public IfcRectangularTrimmedSurface()
	{
	}

	public IfcRectangularTrimmedSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface, double u1, double v1, double u2, double v2, Boolean usense, Boolean vsense)
	{
		this.basisSurface = basisSurface;
		this.u1 = u1;
		this.v1 = v1;
		this.u2 = u2;
		this.v2 = v2;
		this.usense = usense;
		this.vsense = vsense;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public double getU1() {
		return this.u1;
	}

	public void setU1(double u1) {
		this.u1 = u1;
	}

	public double getV1() {
		return this.v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getU2() {
		return this.u2;
	}

	public void setU2(double u2) {
		this.u2 = u2;
	}

	public double getV2() {
		return this.v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}

	public Boolean getUsense() {
		return this.usense;
	}

	public void setUsense(Boolean usense) {
		this.usense = usense;
	}

	public Boolean getVsense() {
		return this.vsense;
	}

	public void setVsense(Boolean vsense) {
		this.vsense = vsense;
	}


}

