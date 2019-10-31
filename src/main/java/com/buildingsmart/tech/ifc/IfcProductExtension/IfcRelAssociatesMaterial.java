// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect;

@Guid("68083c6e-1181-46f4-84da-7cd237846083")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesMaterial extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@Description("Material definition assigned to the elements or element types.")
	@Required()
	@Guid("463ce87e-d144-4166-8fe4-c3c46fd0dd1d")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingMaterial")
	private IfcMaterialSelect relatingMaterial;


	public IfcRelAssociatesMaterial()
	{
	}

	public IfcRelAssociatesMaterial(String globalId, IfcDefinitionSelect[] relatedObjects, IfcMaterialSelect relatingMaterial)
	{
		super(globalId, relatedObjects);
		this.relatingMaterial = relatingMaterial;
	}

	public IfcMaterialSelect getRelatingMaterial() {
		return this.relatingMaterial;
	}

	public void setRelatingMaterial(IfcMaterialSelect relatingMaterial) {
		this.relatingMaterial = relatingMaterial;
	}


}

