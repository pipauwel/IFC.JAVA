// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("68083c6e-1181-46f4-84da-7cd237846083")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesMaterial extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@Description("Material definition assigned to the elements or element types.")
	@Required()
	@Guid("463ce87e-d144-4166-8fe4-c3c46fd0dd1d")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect relatingMaterial;


	public IfcRelAssociatesMaterial()
	{
	}

	public IfcRelAssociatesMaterial(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedObjects, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect relatingMaterial)
	{
		super(globalId, relatedObjects);
		this.relatingMaterial = relatingMaterial;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect getRelatingMaterial() {
		return this.relatingMaterial;
	}

	public void setRelatingMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect relatingMaterial) {
		this.relatingMaterial = relatingMaterial;
	}


}

