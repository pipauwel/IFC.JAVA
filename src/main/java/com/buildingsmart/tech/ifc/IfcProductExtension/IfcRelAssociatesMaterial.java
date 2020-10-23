// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("68083c6e-1181-46f4-84da-7cd237846083")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesMaterial extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@Description("Material definition assigned to the elements or element types.")
	@DataMember(Order = 0)
	@Required()
	@Guid("463ce87e-d144-4166-8fe4-c3c46fd0dd1d")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingMaterial")
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

