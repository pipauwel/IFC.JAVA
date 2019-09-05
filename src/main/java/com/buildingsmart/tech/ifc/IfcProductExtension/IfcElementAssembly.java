// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("80060d73-7260-4e2d-8f9b-46819d547abe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElementAssembly extends IfcElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "AssemblyPlace")
	@Description("A designation of where the assembly is intended to take place defined by an Enum.")
	@Guid("1d9c3c37-5ade-4dce-84eb-639544d907bb")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum assemblyPlace;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined generic types for a element assembly that are specified in an enumeration. There might be property sets defined specifically for each predefined type.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional.</blockquote>")
	@Guid("52e54ce3-c706-4309-8db3-88ec5a4386ac")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementAssemblyTypeEnum predefinedType;


	public IfcElementAssembly()
	{
	}

	public IfcElementAssembly(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum getAssemblyPlace() {
		return this.assemblyPlace;
	}

	public void setAssemblyPlace(com.buildingsmart.tech.ifc.IfcProductExtension.IfcAssemblyPlaceEnum assemblyPlace) {
		this.assemblyPlace = assemblyPlace;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementAssemblyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementAssemblyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

