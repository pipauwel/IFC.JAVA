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
import com.buildingsmart.tech.ifc.IfcKernel.IfcResourceSelect;

@Guid("8e3fe369-7b2f-42e1-ba03-10771a673e88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToResource extends IfcRelAssigns
{
	@Description("Reference to the resource to which the objects are assigned to.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Datatype expanded to include <em>IfcResource</em> and <em>IfcTypeResource</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("72a6ed25-a274-4a9c-a9ac-7e183ce5c24c")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingResource")
	private IfcResourceSelect relatingResource;


	public IfcRelAssignsToResource()
	{
	}

	public IfcRelAssignsToResource(String globalId, IfcObjectDefinition[] relatedObjects, IfcResourceSelect relatingResource)
	{
		super(globalId, relatedObjects);
		this.relatingResource = relatingResource;
	}

	public IfcResourceSelect getRelatingResource() {
		return this.relatingResource;
	}

	public void setRelatingResource(IfcResourceSelect relatingResource) {
		this.relatingResource = relatingResource;
	}


}

