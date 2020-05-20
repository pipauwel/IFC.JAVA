// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("6e3cd925-5085-4070-91c6-868ff915e9ae")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("Reference to the relating material (the composite).")
	@DataMember(Order = 0)
	@Required()
	@Guid("e999e1a6-2c9d-42cc-906e-aa2f77ff42dd")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingMaterial")
	private IfcMaterial relatingMaterial;

	@Description("Reference to related materials (as constituents of composite material).")
	@DataMember(Order = 1)
	@Required()
	@Guid("c4283d48-f0a8-4323-802a-02c8c67cb8b6")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterial")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedMaterials")
	private Set<IfcMaterial> relatedMaterials;

	@Description("Information about the material relationship refering for example to the amount of related materials in the composite material.   <blockquote class=\"note\">NOTE&nbsp; Any formal meaning of the <em>Expression</em> string value has to be established in model view definitions or implementer agreements. No such formal language is provided as part of this specification.</blockquote>")
	@DataMember(Order = 2)
	@Guid("06e78a67-c146-48c1-a11c-c8b9a2752c74")
	@JacksonXmlProperty(isAttribute=false, localName = "expression")
	private IfcLabel expression;


	public IfcMaterialRelationship()
	{
	}

	public IfcMaterialRelationship(IfcMaterial relatingMaterial, IfcMaterial[] relatedMaterials)
	{
		this.relatingMaterial = relatingMaterial;
		this.relatedMaterials = new HashSet<>(Arrays.asList(relatedMaterials));
	}

	public IfcMaterial getRelatingMaterial() {
		return this.relatingMaterial;
	}

	public void setRelatingMaterial(IfcMaterial relatingMaterial) {
		this.relatingMaterial = relatingMaterial;
	}

	public Set<IfcMaterial> getRelatedMaterials() {
		return this.relatedMaterials;
	}

	public IfcLabel getExpression() {
		return this.expression;
	}

	public void setExpression(IfcLabel expression) {
		this.expression = expression;
	}


}

