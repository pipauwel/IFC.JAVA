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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefines;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObject;
import com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject;

@Guid("92a2c20b-4c2f-4ed2-a2f1-5d0591fa26b2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByType extends IfcRelDefines
{
	@DataMember(Order = 0)
	@Required()
	@Guid("afa4df1e-7a6e-4b91-9f0a-ce4a0fcf0a0a")
	@MinLength(1)
	@JsonIgnore
	private Set<IfcObject> relatedObjects;

	@Description("Reference to the type (or style) information for that object or set of objects.")
	@DataMember(Order = 1)
	@Required()
	@Guid("4e3abe9a-b836-4453-bf32-432fd0f9e654")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingType")
	private IfcTypeObject relatingType;


	public IfcRelDefinesByType()
	{
	}

	public IfcRelDefinesByType(String globalId, IfcObject[] relatedObjects, IfcTypeObject relatingType)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingType = relatingType;
	}

	public Set<IfcObject> getRelatedObjects() {
		return this.relatedObjects;
	}

	public IfcTypeObject getRelatingType() {
		return this.relatingType;
	}

	public void setRelatingType(IfcTypeObject relatingType) {
		this.relatingType = relatingType;
	}


}

