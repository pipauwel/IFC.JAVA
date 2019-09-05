// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("7d000d8f-2938-439d-93a8-c32b17a46db8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMeasureWithUnit implements com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect
{
	@Description("The value of the physical quantity when expressed in the specified units.")
	@Required()
	@Guid("479106c8-2fd8-47ea-b8d8-b7c2b4500827")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue valueComponent;

	@Description("The unit in which the physical quantity is expressed.")
	@Required()
	@Guid("0b956010-ecb4-40fe-abb6-f9f75898b3f4")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unitComponent;


	public IfcMeasureWithUnit()
	{
	}

	public IfcMeasureWithUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue valueComponent, com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unitComponent)
	{
		this.valueComponent = valueComponent;
		this.unitComponent = unitComponent;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue getValueComponent() {
		return this.valueComponent;
	}

	public void setValueComponent(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue valueComponent) {
		this.valueComponent = valueComponent;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getUnitComponent() {
		return this.unitComponent;
	}

	public void setUnitComponent(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unitComponent) {
		this.unitComponent = unitComponent;
	}


}

