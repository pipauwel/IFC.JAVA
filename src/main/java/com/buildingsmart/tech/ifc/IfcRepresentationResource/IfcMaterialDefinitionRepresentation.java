// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcRepresentationResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

