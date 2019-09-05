// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("8e5675b7-1eab-4355-967e-bd85ba01ab9d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyBoundedValue extends IfcSimpleProperty
{
	@Description("Upper bound value for the interval defining the property value. If the value is not given, it indicates an open bound (all values to be greater than or equal to <em>LowerBoundValue</em>).")
	@Guid("28c3b4b3-6d57-4edb-be6d-3ab7531478c1")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue upperBoundValue;

	@Description("Lower bound value for the interval defining the property value. If the value is not given, it indicates an open bound (all values to be lower than or equal to <em>UpperBoundValue</em>).")
	@Guid("8511d45b-6a0b-497c-ba87-ff8eb107d34f")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue lowerBoundValue;

	@Description("Unit for the upper and lower bound values, if not given, the default value for the measure type is used as defined by the global unit assignment at <em>IfcProject.UnitInContext</em>. The applicable unit is then selected by the underlying TYPE of the <em>UpperBoundValue</em>, <em>LowerBoundValue</em>, and <em>SetPointValue</em>)")
	@Guid("efcd98c4-2c73-40ff-a47a-51ee91f65800")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit;

	@Description("Set point value as typically used for operational value setting.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of the attribute list.</blockquote>")
	@Guid("618fe876-362a-4c92-a92c-7dd103266ac3")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue setPointValue;


	public IfcPropertyBoundedValue()
	{
	}

	public IfcPropertyBoundedValue(String name)
	{
		super(name);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue getUpperBoundValue() {
		return this.upperBoundValue;
	}

	public void setUpperBoundValue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue upperBoundValue) {
		this.upperBoundValue = upperBoundValue;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue getLowerBoundValue() {
		return this.lowerBoundValue;
	}

	public void setLowerBoundValue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue lowerBoundValue) {
		this.lowerBoundValue = lowerBoundValue;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit) {
		this.unit = unit;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue getSetPointValue() {
		return this.setPointValue;
	}

	public void setSetPointValue(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue setPointValue) {
		this.setPointValue = setPointValue;
	}


}

