// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcGrid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("c88238d9-0400-4b8f-846c-03fd460a7fa9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGridAxis
{
	@Description("The tag or name for this grid axis.")
	@DataMember(Order = 0)
	@Guid("f222aeae-6918-400f-8a3a-d30bc1517fdd")
	@JacksonXmlProperty(isAttribute=false, localName = "axisTag")
	private IfcLabel axisTag;

	@Description("Underlying curve which provides the geometry for this grid axis.")
	@DataMember(Order = 1)
	@Required()
	@Guid("589c5a86-2e76-4350-a83e-c51111d24192")
	@JacksonXmlProperty(isAttribute=false, localName = "axisCurve")
	private IfcCurve axisCurve;

	@Description("Defines whether the original sense of curve is used or whether it is reversed in the context of the grid axis.")
	@DataMember(Order = 2)
	@Required()
	@Guid("64d5940a-89dc-4943-b2bb-32f8fabbef9c")
	@JacksonXmlProperty(isAttribute=false, localName = "sameSense")
	private IfcBoolean sameSense;

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>WAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "wAxes", Range = "IfcGrid")
	@Guid("37f2104e-edaa-42e5-9169-517462c7484e")
	@MaxLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcGrid")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfW")*/
	@JsonIgnore
	private Set<IfcGrid> partOfW;

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>VAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "vAxes", Range = "IfcGrid")
	@Guid("2d9d9cfa-15a7-4eba-9d29-d6c6b56c8ca7")
	@MaxLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcGrid")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfV")*/
	@JsonIgnore
	private Set<IfcGrid> partOfV;

	@Description("If provided, the <em>IfcGridAxis</em> is part of the <em>UAxes</em> of <em>IfcGrid</em>.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "uAxes", Range = "IfcGrid")
	@Guid("a67ae0fa-6b90-407b-a0af-d5724a050f0d")
	@MaxLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcGrid")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "partOfU")*/
	@JsonIgnore
	private Set<IfcGrid> partOfU;

	@Description("The reference to a set of <IfcVirtualGridIntersection</em>'s, that connect other grid axes to this grid axis.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "intersectingAxes", Range = "IfcVirtualGridIntersection")
	@Guid("351beb68-0443-424d-8205-71b6086c5eb7")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcVirtualGridIntersection")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasIntersections")
	private Set<IfcVirtualGridIntersection> hasIntersections;


	public IfcGridAxis()
	{
	}

	public IfcGridAxis(IfcCurve axisCurve, IfcBoolean sameSense)
	{
		this.axisCurve = axisCurve;
		this.sameSense = sameSense;
	}

	public IfcLabel getAxisTag() {
		return this.axisTag;
	}

	public void setAxisTag(IfcLabel axisTag) {
		this.axisTag = axisTag;
	}

	public IfcCurve getAxisCurve() {
		return this.axisCurve;
	}

	public void setAxisCurve(IfcCurve axisCurve) {
		this.axisCurve = axisCurve;
	}

	public IfcBoolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(IfcBoolean sameSense) {
		this.sameSense = sameSense;
	}

	public Set<IfcGrid> getPartOfW() {
		return this.partOfW;
	}

	public Set<IfcGrid> getPartOfV() {
		return this.partOfV;
	}

	public Set<IfcGrid> getPartOfU() {
		return this.partOfU;
	}

	public Set<IfcVirtualGridIntersection> getHasIntersections() {
		return this.hasIntersections;
	}


}

