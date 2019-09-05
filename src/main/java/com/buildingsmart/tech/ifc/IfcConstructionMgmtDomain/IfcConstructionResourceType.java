// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c642ffe1-4447-43e7-935a-fa0b8f9420ed")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcConstructionResourceType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeResource
{
	@Description("Indicates the unit costs and environmental impacts for which accrued amounts should be calculated.  Such unit costs may be split into <em>Name</em> designations (e.g. 'Standard', 'Overtime'), and may contain a hierarchy of cost values that apply at different dates (using <em>IfcCostValue.ApplicableDate</em> and <em>IfcCostValue.FixedUntilDate</em>).    <p></p>")
	@MinLength(1)
	@Guid("fab31804-3e6a-456a-bae2-2138c73e4b1f")
	private List<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue> baseCosts = new ArrayList<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue>();

	@JacksonXmlProperty(isAttribute=false, localName = "BaseQuantity")
	@Description("Identifies the quantity for which the <em>BaseQuantityProduced</em> applies.  The <em>Name</em> of the <em>IfcPhysicalQuantity</em> identifies the quantity definition being measured, e.g. \"GrossVolume\".  For production-based resources (e.g. carpentry labor), this value refers to quantities on <em>IfcProduct</em>(s) to which the assigned <em>IfcTask</em> is assigned.  For duration-based resources (e.g. safety inspector, fuel for equipment), this value refers to quantities that may be assigned to occurrences of the assigned <em>IfcTaskType</em>.    <p></p>")
	@Guid("e52f14a1-d244-46eb-8c1f-d7685c63d749")
	private com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity baseQuantity;


	public IfcConstructionResourceType()
	{
	}

	public IfcConstructionResourceType(String globalId)
	{
		super(globalId);
	}

	public List<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue> getBaseCosts() {
		return this.baseCosts;
	}

	public com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity getBaseQuantity() {
		return this.baseQuantity;
	}

	public void setBaseQuantity(com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity baseQuantity) {
		this.baseQuantity = baseQuantity;
	}


}

