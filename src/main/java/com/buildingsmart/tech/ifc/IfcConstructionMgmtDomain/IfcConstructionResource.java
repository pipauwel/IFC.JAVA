// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcResourceTime;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("8d7d96c2-5987-41a0-aa66-ab3c2f3443bf")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcConstructionEquipmentResource.class, name = "IfcConstructionEquipmentResource"), @JsonSubTypes.Type(value = IfcConstructionMaterialResource.class, name = "IfcConstructionMaterialResource"), @JsonSubTypes.Type(value = IfcConstructionProductResource.class, name = "IfcConstructionProductResource"), @JsonSubTypes.Type(value = IfcCrewResource.class, name = "IfcCrewResource"), @JsonSubTypes.Type(value = IfcLaborResource.class, name = "IfcLaborResource"), @JsonSubTypes.Type(value = IfcSubContractResource.class, name = "IfcSubContractResource")})
public abstract class IfcConstructionResource extends com.buildingsmart.tech.ifc.IfcKernel.IfcResource
{
	@Description("Indicates the work, usage, and times scheduled and completed.  Some attributes on this object may have associated constraints or time series; see documentation of <em>IfcResourceTime</em> for specific usage.  If the resource is nested, then certain values may be calculated based on the component resources as indicated at <em>IfcResourceTime</em>.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@DataMember(Order = 0)
	@Guid("a310105d-c221-4f71-b051-9391d731cec8")
	@JacksonXmlProperty(isAttribute=false, localName = "usage")
	private IfcResourceTime usage;

	@Description("Indicates the unit costs for which accrued amounts should be calculated.  Such unit costs may be split into <em>Name</em> designations (for example, 'Standard', 'Overtime'), and may contain a hierarchy of cost values that apply at different dates (using <em>IfcCostValue.ApplicableDate</em> and <em>IfcCostValue.FixedUntilDate</em>).    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@DataMember(Order = 1)
	@Guid("c897428f-689a-4abb-9fb4-b5dffaf945e6")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAppliedValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "baseCosts")
	private List<IfcAppliedValue> baseCosts;

	@Description("Identifies the base quantity consumed of the resource relative to assignments.      For crew, labour, subcontract, and equipment resources, this refers to <i>IfcQuantityTime</i>.    For material resources, this refers to <i>IfcQuantityVolume</i>.    For product resources, this refers to <i>IfcQuantityCount</i>.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.</blockquote>")
	@DataMember(Order = 2)
	@Guid("4da46f38-bb04-4ce9-88fb-8b7ca2c524a7")
	@JacksonXmlProperty(isAttribute=false, localName = "baseQuantity")
	private IfcPhysicalQuantity baseQuantity;


	public IfcConstructionResource()
	{
	}

	public IfcConstructionResource(String globalId)
	{
		super(globalId);
	}

	public IfcResourceTime getUsage() {
		return this.usage;
	}

	public void setUsage(IfcResourceTime usage) {
		this.usage = usage;
	}

	public List<IfcAppliedValue> getBaseCosts() {
		return this.baseCosts;
	}

	public IfcPhysicalQuantity getBaseQuantity() {
		return this.baseQuantity;
	}

	public void setBaseQuantity(IfcPhysicalQuantity baseQuantity) {
		this.baseQuantity = baseQuantity;
	}


}

