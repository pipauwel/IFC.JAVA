// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcSimpleProperty;

@Guid("166fb09e-156c-46c0-ae3d-c231cb40cd96")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyListValue extends IfcSimpleProperty
{
	@Description("List of property values.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Guid("32f56438-324e-4cc0-a015-fd42bc1d2464")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ListValues")
	private List<IfcValue> listValues;

	@Description("Unit for the list values, if not given, the default value for the measure type (given by the TYPE of nominal value) is used as defined by the global unit assignment at IfcProject.")
	@DataMember(Order = 1)
	@Guid("6c1e2deb-0757-4bab-bcbd-d6199312452a")
	@JacksonXmlProperty(isAttribute=true, localName = "Unit")
	private IfcUnit unit;


	public IfcPropertyListValue()
	{
	}

	public IfcPropertyListValue(String name)
	{
		super(name);
	}

	public List<IfcValue> getListValues() {
		return this.listValues;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}


}

