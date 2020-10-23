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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("51ba0123-164c-4caf-8ba8-61e9906b07c0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByObject extends IfcRelDefines
{
	@Description("Objects being part of an object occurrence decomposition, acting as the \"reflecting parts\" in the relationship.")
	@DataMember(Order = 0)
	@Required()
	@Guid("b81537b0-1b16-446d-9317-86a93844053b")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcObject")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedObjects")
	private Set<IfcObject> relatedObjects;

	@Description("Object being part of an object type decomposition, acting as the \"declaring part\" in the relationship.")
	@DataMember(Order = 1)
	@Required()
	@Guid("e0f7bc77-e70c-4ecd-a3f4-9b587acb6df1")
	@JsonIgnore
	private IfcObject relatingObject;


	public IfcRelDefinesByObject()
	{
	}

	public IfcRelDefinesByObject(String globalId, IfcObject[] relatedObjects, IfcObject relatingObject)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingObject = relatingObject;
	}

	public Set<IfcObject> getRelatedObjects() {
		return this.relatedObjects;
	}

	public IfcObject getRelatingObject() {
		return this.relatingObject;
	}

	public void setRelatingObject(IfcObject relatingObject) {
		this.relatingObject = relatingObject;
	}


}

