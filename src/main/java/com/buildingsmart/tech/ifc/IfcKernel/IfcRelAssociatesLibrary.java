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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect;

@Guid("023ad93b-f1e9-4695-9464-50b0caeabeba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesLibrary extends IfcRelAssociates
{
	@Description("Reference to a library, from which the definition of the property set is taken.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4cafd610-1742-487c-a6bf-cf5786b0fc9c")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingLibrary")
	private IfcLibrarySelect relatingLibrary;


	public IfcRelAssociatesLibrary()
	{
	}

	public IfcRelAssociatesLibrary(String globalId, IfcDefinitionSelect[] relatedObjects, IfcLibrarySelect relatingLibrary)
	{
		super(globalId, relatedObjects);
		this.relatingLibrary = relatingLibrary;
	}

	public IfcLibrarySelect getRelatingLibrary() {
		return this.relatingLibrary;
	}

	public void setRelatingLibrary(IfcLibrarySelect relatingLibrary) {
		this.relatingLibrary = relatingLibrary;
	}


}

