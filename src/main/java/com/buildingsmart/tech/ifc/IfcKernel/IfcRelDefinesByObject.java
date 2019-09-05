// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("51ba0123-164c-4caf-8ba8-61e9906b07c0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByObject extends IfcRelDefines
{
	@Description("Objects being part of an object occurrence decomposition, acting as the \"reflecting parts\" in the relationship.")
	@Required()
	@MinLength(1)
	@Guid("b81537b0-1b16-446d-9317-86a93844053b")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObject> relatedObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcObject>();

	@JsonIgnore
	@Description("Object being part of an object type decomposition, acting as the \"declaring part\" in the relationship.")
	@Required()
	@Guid("e0f7bc77-e70c-4ecd-a3f4-9b587acb6df1")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcObject relatingObject;


	public IfcRelDefinesByObject()
	{
	}

	public IfcRelDefinesByObject(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObject[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcObject relatingObject)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingObject = relatingObject;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObject> getRelatedObjects() {
		return this.relatedObjects;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcObject getRelatingObject() {
		return this.relatingObject;
	}

	public void setRelatingObject(com.buildingsmart.tech.ifc.IfcKernel.IfcObject relatingObject) {
		this.relatingObject = relatingObject;
	}


}

