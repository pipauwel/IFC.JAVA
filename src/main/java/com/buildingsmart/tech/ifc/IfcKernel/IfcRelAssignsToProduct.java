// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("72eec376-bbab-40d5-9342-93108c172713")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToProduct extends IfcRelAssigns
{
	@Description("Reference to the product or product type to which the objects are assigned to.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Datatype expanded to include <em>IfcProduct</em> and <em>IfcTypeProduct</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("2daaadb6-2a0e-43bc-8f2b-5cdcdce021dd")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingProduct")
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

