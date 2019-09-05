// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("166fb09e-156c-46c0-ae3d-c231cb40cd96")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyListValue extends IfcSimpleProperty
{
	@Description("List of property values.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@MinLength(1)
	@Guid("32f56438-324e-4cc0-a015-fd42bc1d2464")
	private List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> listValues = new ArrayList<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue>();

	@Description("Unit for the list values, if not given, the default value for the measure type (given by the TYPE of nominal value) is used as defined by the global unit assignment at IfcProject.")
	@Guid("6c1e2deb-0757-4bab-bcbd-d6199312452a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit;


	public IfcPropertyListValue()
	{
	}

	public IfcPropertyListValue(String name)
	{
		super(name);
	}

	public List<com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue> getListValues() {
		return this.listValues;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit unit) {
		this.unit = unit;
	}


}

