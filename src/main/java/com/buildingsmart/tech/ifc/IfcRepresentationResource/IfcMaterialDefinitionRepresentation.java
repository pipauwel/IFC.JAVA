// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

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
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcProductRepresentation;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial;

@Guid("482a3c86-3ce0-47c4-936b-b783f9502b01")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialDefinitionRepresentation extends IfcProductRepresentation
{
	@Description("Reference to the material to which the representation applies.")
	@DataMember(Order = 0)
	@Required()
	@Guid("895fdfda-1b9b-4597-baa7-e6f4ebda24e9")
	@JsonIgnore
	private IfcMaterial representedMaterial;


	public IfcMaterialDefinitionRepresentation()
	{
	}

	public IfcMaterialDefinitionRepresentation(IfcRepresentation[] representations, IfcMaterial representedMaterial)
	{
		super(representations);
		this.representedMaterial = representedMaterial;
	}

	public IfcMaterial getRepresentedMaterial() {
		return this.representedMaterial;
	}

	public void setRepresentedMaterial(IfcMaterial representedMaterial) {
		this.representedMaterial = representedMaterial;
	}


}

