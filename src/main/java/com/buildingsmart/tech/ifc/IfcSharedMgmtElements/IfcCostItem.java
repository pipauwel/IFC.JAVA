// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedMgmtElements;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("78610aed-e656-483f-b7d3-8fc99b2c0312")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCostItem extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined generic type for a cost item that is specified in an enumeration. There may be a property set given specificly for the predefined types.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@Guid("b88a8628-6b2a-4c45-b51b-a20cbe67368c")
	private com.buildingsmart.tech.ifc.IfcSharedMgmtElements.IfcCostItemTypeEnum predefinedType;

	@Description("Component costs for which the total cost for the cost item is calculated, and then multiplied by the total <em>CostQuantities</em> if provided.      If <em>CostQuantities</em> is provided then values indicate unit costs, otherwise values indicate total costs.    For calculation purposes, the cost values may be directly added unless they have qualifications.  Cost values with qualifications (e.g. <em>IfcCostValue.ApplicableDate</em>, <em>IfcCostValue.FixedUntilDate</em>) should be excluded from such calculation if they do not apply.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@MinLength(1)
	@Guid("11b6d699-057d-44f9-b352-cffd41ba1269")
	private List<com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue> costValues = new ArrayList<com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue>();

	@Description("Component quantities of the same type for which the total quantity for the cost item is calculated as the sum.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added.</blockquote>")
	@MinLength(1)
	@Guid("b7296c99-1454-49d0-a548-09ac41553f78")
	private List<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity> costQuantities = new ArrayList<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity>();


	public IfcCostItem()
	{
	}

	public IfcCostItem(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedMgmtElements.IfcCostItemTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedMgmtElements.IfcCostItemTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public List<com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue> getCostValues() {
		return this.costValues;
	}

	public List<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity> getCostQuantities() {
		return this.costQuantities;
	}


}

