// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssigns;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProductSelect;

@Guid("72eec376-bbab-40d5-9342-93108c172713")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToProduct extends IfcRelAssigns
{
	@Description("Reference to the product or product type to which the objects are assigned to.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Datatype expanded to include <em>IfcProduct</em> and <em>IfcTypeProduct</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("2daaadb6-2a0e-43bc-8f2b-5cdcdce021dd")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingProduct")
	private IfcProductSelect relatingProduct;


	public IfcRelAssignsToProduct()
	{
	}

	public IfcRelAssignsToProduct(String globalId, IfcObjectDefinition[] relatedObjects, IfcProductSelect relatingProduct)
	{
		super(globalId, relatedObjects);
		this.relatingProduct = relatingProduct;
	}

	public IfcProductSelect getRelatingProduct() {
		return this.relatingProduct;
	}

	public void setRelatingProduct(IfcProductSelect relatingProduct) {
		this.relatingProduct = relatingProduct;
	}


}

