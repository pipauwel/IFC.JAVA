// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("5b9df3e2-be80-4922-9a85-8f8fb6e9cbef")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialClassificationRelationship
{
	@Description("The material classifications identifying the type of material.")
	@DataMember(Order = 0)
	@Required()
	@Guid("21ad3946-1327-4f45-b1c7-b34782cb57a2")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcClassificationSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "materialClassifications")
	private Set<IfcClassificationSelect> materialClassifications;

	@Description("Material being classified.")
	@DataMember(Order = 1)
	@Required()
	@Guid("2cb7cbb7-27a9-41ee-bb2f-4a418429e5e7")
	@JacksonXmlProperty(isAttribute=false, localName = "classifiedMaterial")
	private IfcMaterial classifiedMaterial;


	public IfcMaterialClassificationRelationship()
	{
	}

	public IfcMaterialClassificationRelationship(IfcClassificationSelect[] materialClassifications, IfcMaterial classifiedMaterial)
	{
		this.materialClassifications = new HashSet<>(Arrays.asList(materialClassifications));
		this.classifiedMaterial = classifiedMaterial;
	}

	public Set<IfcClassificationSelect> getMaterialClassifications() {
		return this.materialClassifications;
	}

	public IfcMaterial getClassifiedMaterial() {
		return this.classifiedMaterial;
	}

	public void setClassifiedMaterial(IfcMaterial classifiedMaterial) {
		this.classifiedMaterial = classifiedMaterial;
	}


}

