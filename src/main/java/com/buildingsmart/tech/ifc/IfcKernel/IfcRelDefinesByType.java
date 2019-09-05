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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("92a2c20b-4c2f-4ed2-a2f1-5d0591fa26b2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByType extends IfcRelDefines
{
	@JsonIgnore
	@Required()
	@MinLength(1)
	@Guid("afa4df1e-7a6e-4b91-9f0a-ce4a0fcf0a0a")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObject> relatedObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcObject>();

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingType")
	@Description("Reference to the type (or style) information for that object or set of objects.")
	@Required()
	@Guid("4e3abe9a-b836-4453-bf32-432fd0f9e654")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject relatingType;


	public IfcRelDefinesByType()
	{
	}

	public IfcRelDefinesByType(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObject[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject relatingType)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingType = relatingType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObject> getRelatedObjects() {
		return this.relatedObjects;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject getRelatingType() {
		return this.relatingType;
	}

	public void setRelatingType(com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject relatingType) {
		this.relatingType = relatingType;
	}


}

