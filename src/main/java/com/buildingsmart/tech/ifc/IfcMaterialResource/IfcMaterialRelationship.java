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

@Guid("6e3cd925-5085-4070-91c6-868ff915e9ae")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingMaterial")
	@Description("Reference to the relating material (the composite).")
	@Required()
	@Guid("e999e1a6-2c9d-42cc-906e-aa2f77ff42dd")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial relatingMaterial;

	@Description("Reference to related materials (as constituents of composite material).")
	@Required()
	@MinLength(1)
	@Guid("c4283d48-f0a8-4323-802a-02c8c67cb8b6")
	private Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial> relatedMaterials = new HashSet<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial>();

	@JacksonXmlProperty(isAttribute=true, localName = "Expression")
	@Description("Information about the material relationship refering for example to the amount of related materials in the composite material.   <blockquote class=\"note\">NOTE&nbsp; Any formal meaning of the <em>Expression</em> string value has to be established in model view definitions or implementer agreements. No such formal language is provided as part of this specification.</blockquote>")
	@Guid("06e78a67-c146-48c1-a11c-c8b9a2752c74")
	private String expression;


	public IfcMaterialRelationship()
	{
	}

	public IfcMaterialRelationship(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial relatingMaterial, com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial[] relatedMaterials)
	{
		this.relatingMaterial = relatingMaterial;
		this.relatedMaterials = new HashSet<>(Arrays.asList(relatedMaterials));
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial getRelatingMaterial() {
		return this.relatingMaterial;
	}

	public void setRelatingMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial relatingMaterial) {
		this.relatingMaterial = relatingMaterial;
	}

	public Set<com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial> getRelatedMaterials() {
		return this.relatedMaterials;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}


}

