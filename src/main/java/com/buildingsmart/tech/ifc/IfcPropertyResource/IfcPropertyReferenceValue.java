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
import com.buildingsmart.tech.ifc.IfcPropertyResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcSimpleProperty;

@Guid("7c1a56a5-26cf-4e5b-932f-55d94501a267")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyReferenceValue extends IfcSimpleProperty
{
	@Description("Description of the use of the referenced value within the property. It is a descriptive text that may hold an expression or other additional information.")
	@DataMember(Order = 0)
	@Guid("3f4121ae-3567-4718-8910-fd4fd7fc9822")
	@JacksonXmlProperty(isAttribute=true, localName = "UsageName")
	private String usageName;

	@Description("Reference to another property entity through one of the select types in the <em>IfcObjectReferenceSelect</em>.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been made optional with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Guid("adf61d9f-3105-4adb-bf7d-b567adaae2f6")
	@JacksonXmlProperty(isAttribute=true, localName = "PropertyReference")
	private IfcObjectReferenceSelect propertyReference;


	public IfcPropertyReferenceValue()
	{
	}

	public IfcPropertyReferenceValue(String name)
	{
		super(name);
	}

	public String getUsageName() {
		return this.usageName;
	}

	public void setUsageName(String usageName) {
		this.usageName = usageName;
	}

	public IfcObjectReferenceSelect getPropertyReference() {
		return this.propertyReference;
	}

	public void setPropertyReference(IfcObjectReferenceSelect propertyReference) {
		this.propertyReference = propertyReference;
	}


}

