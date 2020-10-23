// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("a833ffe8-a590-4380-90b8-dd32167b36f6")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelNests extends IfcRelDecomposes
{
	@Description("The object definition, either an non-product object type or a non-product object occurrence, that represents the nest. It is the whole within the whole/part relationship.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been demoted from the supertype <em>IfcRelDecomposes</em> and defines the ordered nesting relationship.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("240bd13f-f0fa-45d0-81f6-b72e46d8ce4d")
	@JsonIgnore
	private IfcObjectDefinition relatingObject;

	@Description("The object definitions, either non-product object occurrences or non-product object types, that are being nestes. They are defined as the parts in the ordered whole/part relationship -  i.e. there is an implied order among the parts expressed by the position within the list of <em>RelatedObjects</em>.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been demoted from the supertype <em>IfcRelDecomposes</em> and defines the ordered set of parts within the nest.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("c36c3044-0ef2-4acb-ba8c-e40b8a465e33")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcObjectDefinition")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedObjects")
	private List<IfcObjectDefinition> relatedObjects;


	public IfcRelNests()
	{
	}

	public IfcRelNests(String globalId, IfcObjectDefinition relatingObject, IfcObjectDefinition[] relatedObjects)
	{
		super(globalId);
		this.relatingObject = relatingObject;
		this.relatedObjects = new ArrayList<>(Arrays.asList(relatedObjects));
	}

	public IfcObjectDefinition getRelatingObject() {
		return this.relatingObject;
	}

	public void setRelatingObject(IfcObjectDefinition relatingObject) {
		this.relatingObject = relatingObject;
	}

	public List<IfcObjectDefinition> getRelatedObjects() {
		return this.relatedObjects;
	}


}

