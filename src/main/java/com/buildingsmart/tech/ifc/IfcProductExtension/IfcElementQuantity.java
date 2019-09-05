// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f1e9cf21-4f13-485c-a608-e1f0beac34f7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElementQuantity extends com.buildingsmart.tech.ifc.IfcKernel.IfcQuantitySet
{
	@JacksonXmlProperty(isAttribute=true, localName = "MethodOfMeasurement")
	@Description("Name of the method of measurement used to calculate the element quantity. The method of measurement attribute has to be made recognizable by further agreements.    <blockquote class=\"change-ifc2x2\">IFC2x2 Addendum 1 change: The attribute has been changed to be optional </blockquote>")
	@Guid("e8632959-d375-4923-bc11-6da33c9c455b")
	private String methodOfMeasurement;

	@Description("The individual quantities for the element, can be a set of length, area, volume, weight or count based quantities.")
	@Required()
	@MinLength(1)
	@Guid("fff9aa2e-b2ad-44a5-a09f-13be4f49a1a1")
	private Set<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity> quantities = new HashSet<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity>();


	public IfcElementQuantity()
	{
	}

	public IfcElementQuantity(String globalId, com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity[] quantities)
	{
		super(globalId);
		this.quantities = new HashSet<>(Arrays.asList(quantities));
	}

	public String getMethodOfMeasurement() {
		return this.methodOfMeasurement;
	}

	public void setMethodOfMeasurement(String methodOfMeasurement) {
		this.methodOfMeasurement = methodOfMeasurement;
	}

	public Set<com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity> getQuantities() {
		return this.quantities;
	}


}

