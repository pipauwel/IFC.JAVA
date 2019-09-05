// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c88238d9-0400-4b8f-846c-03fd460a7fa9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGridAxis
{
	@JacksonXmlProperty(isAttribute=true, localName = "AxisTag")
	@Description("The tag or name for this grid axis.")
	@Guid("f222aeae-6918-400f-8a3a-d30bc1517fdd")
	private String axisTag;

	@JacksonXmlProperty(isAttribute=false, localName = "AxisCurve")
	@Description("Underlying curve which provides the geometry for this grid axis.")
	@Required()
	@Guid("589c5a86-2e76-4350-a83e-c51111d24192")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve axisCurve;

	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	@Description("Defines whether the original sense of curve is used or whether it is reversed in the context of the grid axis.")
	@Required()
	@Guid("64d5940a-89dc-4943-b2bb-32f8fabbef9c")
	private Boolean sameSense;

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>WAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@MaxLength(1)
	@Guid("37f2104e-edaa-42e5-9169-517462c7484e")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> partOfW = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid>();

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>VAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@MaxLength(1)
	@Guid("2d9d9cfa-15a7-4eba-9d29-d6c6b56c8ca7")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> partOfV = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid>();

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>UAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@MaxLength(1)
	@Guid("a67ae0fa-6b90-407b-a0af-d5724a050f0d")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> partOfU = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid>();

	@Description("The reference to a set of <IfcVirtualGridIntersection</em>'s, that connect other grid axes to this grid axis.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("351beb68-0443-424d-8205-71b6086c5eb7")
	private Set<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcVirtualGridIntersection> hasIntersections = new HashSet<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcVirtualGridIntersection>();


	public IfcGridAxis()
	{
	}

	public IfcGridAxis(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve axisCurve, Boolean sameSense)
	{
		this.axisCurve = axisCurve;
		this.sameSense = sameSense;
	}

	public String getAxisTag() {
		return this.axisTag;
	}

	public void setAxisTag(String axisTag) {
		this.axisTag = axisTag;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getAxisCurve() {
		return this.axisCurve;
	}

	public void setAxisCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve axisCurve) {
		this.axisCurve = axisCurve;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> getPartOfW() {
		return this.partOfW;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> getPartOfV() {
		return this.partOfV;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid> getPartOfU() {
		return this.partOfU;
	}

	public Set<com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcVirtualGridIntersection> getHasIntersections() {
		return this.hasIntersections;
	}


}

