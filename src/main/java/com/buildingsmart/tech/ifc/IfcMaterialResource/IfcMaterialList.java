// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("e2c88e35-f4a8-464a-8816-1b1ae58202f5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialList implements IfcMaterialSelect
{
	@Description("Materials used in a composition of substances.")
	@Required()
	@MinLength(1)
	@Guid("f7c9c7a0-f7e3-4163-b9a3-36a6ead9e8a2")
	private List<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial> materials = new ArrayList<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial>();


	public IfcMaterialList()
	{
	}

	public IfcMaterialList(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial[] materials)
	{
		this.materials = new ArrayList<>(Arrays.asList(materials));
	}

	public List<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial> getMaterials() {
		return this.materials;
	}


}

