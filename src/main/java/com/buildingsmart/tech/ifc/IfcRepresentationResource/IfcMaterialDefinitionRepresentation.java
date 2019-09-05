// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("482a3c86-3ce0-47c4-936b-b783f9502b01")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialDefinitionRepresentation extends IfcProductRepresentation
{
	@JsonIgnore
	@Description("Reference to the material to which the representation applies.")
	@Required()
	@Guid("895fdfda-1b9b-4597-baa7-e6f4ebda24e9")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial representedMaterial;


	public IfcMaterialDefinitionRepresentation()
	{
	}

	public IfcMaterialDefinitionRepresentation(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentation[] representations, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial representedMaterial)
	{
		super(representations);
		this.representedMaterial = representedMaterial;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial getRepresentedMaterial() {
		return this.representedMaterial;
	}

	public void setRepresentedMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial representedMaterial) {
		this.representedMaterial = representedMaterial;
	}


}

