// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5b9df3e2-be80-4922-9a85-8f8fb6e9cbef")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialClassificationRelationship
{
	@Description("The material classifications identifying the type of material.")
	@Required()
	@MinLength(1)
	@Guid("21ad3946-1327-4f45-b1c7-b34782cb57a2")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect> materialClassifications = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect>();

	@JacksonXmlProperty(isAttribute=false, localName = "ClassifiedMaterial")
	@Description("Material being classified.")
	@Required()
	@Guid("2cb7cbb7-27a9-41ee-bb2f-4a418429e5e7")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial classifiedMaterial;


	public IfcMaterialClassificationRelationship()
	{
	}

	public IfcMaterialClassificationRelationship(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect[] materialClassifications, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial classifiedMaterial)
	{
		this.materialClassifications = new HashSet<>(Arrays.asList(materialClassifications));
		this.classifiedMaterial = classifiedMaterial;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect> getMaterialClassifications() {
		return this.materialClassifications;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial getClassifiedMaterial() {
		return this.classifiedMaterial;
	}

	public void setClassifiedMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial classifiedMaterial) {
		this.classifiedMaterial = classifiedMaterial;
	}


}

