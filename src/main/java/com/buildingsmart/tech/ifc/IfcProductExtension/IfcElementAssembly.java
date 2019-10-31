// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("80060d73-7260-4e2d-8f9b-46819d547abe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElementAssembly extends IfcElement
{
	@Description("A designation of where the assembly is intended to take place defined by an Enum.")
	@Guid("1d9c3c37-5ade-4dce-84eb-639544d907bb")
	@JacksonXmlProperty(isAttribute=true, localName = "AssemblyPlace")
	private IfcAssemblyPlaceEnum assemblyPlace;

	@Description("Predefined generic types for a element assembly that are specified in an enumeration. There might be property sets defined specifically for each predefined type.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional.</blockquote>")
	@Guid("52e54ce3-c706-4309-8db3-88ec5a4386ac")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcElementAssemblyTypeEnum predefinedType;


	public IfcElementAssembly()
	{
	}

	public IfcElementAssembly(String globalId)
	{
		super(globalId);
	}

	public IfcAssemblyPlaceEnum getAssemblyPlace() {
		return this.assemblyPlace;
	}

	public void setAssemblyPlace(IfcAssemblyPlaceEnum assemblyPlace) {
		this.assemblyPlace = assemblyPlace;
	}

	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcElementAssemblyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

