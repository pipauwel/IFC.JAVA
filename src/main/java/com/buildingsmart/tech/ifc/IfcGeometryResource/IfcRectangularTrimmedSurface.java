// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcParameterValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("25bb1436-242e-4954-a716-597d8e9ba615")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRectangularTrimmedSurface extends IfcBoundedSurface
{
	@Description("Surface being trimmed.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2b292506-6136-479a-9255-a02ef4d16fa9")
	@JacksonXmlProperty(isAttribute=false, localName = "basisSurface")
	private IfcSurface basisSurface;

	@Description("First u parametric value.")
	@DataMember(Order = 1)
	@Required()
	@Guid("15237180-8fcc-4bed-a1ef-26b540fe861e")
	@JacksonXmlProperty(isAttribute=false, localName = "u1")
	private IfcParameterValue u1;

	@Description("First v parametric value.")
	@DataMember(Order = 2)
	@Required()
	@Guid("f0aaaef2-f79e-42d5-85f8-c8494f5a575b")
	@JacksonXmlProperty(isAttribute=false, localName = "v1")
	private IfcParameterValue v1;

	@Description("Second u parametric value.")
	@DataMember(Order = 3)
	@Required()
	@Guid("1f5188e3-40dc-4708-9067-d8ce2a75609e")
	@JacksonXmlProperty(isAttribute=false, localName = "u2")
	private IfcParameterValue u2;

	@Description("Second v parametric value.")
	@DataMember(Order = 4)
	@Required()
	@Guid("fdec4f9a-ac75-4d58-8ca8-70266df5c502")
	@JacksonXmlProperty(isAttribute=false, localName = "v2")
	private IfcParameterValue v2;

	@Description("Flag to indicate whether the direction of the first parameter of the trimmed surface agrees with or opposes the sense of u in the basis surface.")
	@DataMember(Order = 5)
	@Required()
	@Guid("84dd552c-ed43-4b01-ad77-9d47469c7b67")
	@JacksonXmlProperty(isAttribute=false, localName = "usense")
	private IfcBoolean usense;

	@Description("Flag to indicate whether the direction of the second parameter of the trimmed surface agrees with or opposes the sense of v in the basis surface.")
	@DataMember(Order = 6)
	@Required()
	@Guid("3236b0bf-0d50-4b41-a891-8356e96558f8")
	@JacksonXmlProperty(isAttribute=false, localName = "vsense")
	private IfcBoolean vsense;


	public IfcRectangularTrimmedSurface()
	{
	}

	public IfcRectangularTrimmedSurface(IfcSurface basisSurface, IfcParameterValue u1, IfcParameterValue v1,
										IfcParameterValue u2, IfcParameterValue v2, IfcBoolean usense, IfcBoolean vsense)
	{
		this.basisSurface = basisSurface;
		this.u1 = u1;
		this.v1 = v1;
		this.u2 = u2;
		this.v2 = v2;
		this.usense = usense;
		this.vsense = vsense;
	}

	public IfcSurface getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcSurface basisSurface) {
		this.basisSurface = basisSurface;
	}

	public IfcParameterValue getU1() {
		return this.u1;
	}

	public void setU1(IfcParameterValue u1) {
		this.u1 = u1;
	}

	public IfcParameterValue getV1() {
		return this.v1;
	}

	public void setV1(IfcParameterValue v1) {
		this.v1 = v1;
	}

	public IfcParameterValue getU2() {
		return this.u2;
	}

	public void setU2(IfcParameterValue u2) {
		this.u2 = u2;
	}

	public IfcParameterValue getV2() {
		return this.v2;
	}

	public void setV2(IfcParameterValue v2) {
		this.v2 = v2;
	}

	public IfcBoolean getUsense() {
		return this.usense;
	}

	public void setUsense(IfcBoolean usense) {
		this.usense = usense;
	}

	public IfcBoolean getVsense() {
		return this.vsense;
	}

	public void setVsense(IfcBoolean vsense) {
		this.vsense = vsense;
	}


}

