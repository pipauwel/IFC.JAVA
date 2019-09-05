// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("beba5e9b-c73b-48e0-8a6d-b5d65ddbaaf1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialConstituent extends IfcMaterialDefinition
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name by which the material constituent is known.")
	@Guid("cd111960-1bdc-4bb1-82cf-eb8857fc7dae")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Definition of the material constituent in descriptive terms.")
	@Guid("ebe9ac22-8c7f-4eb2-a71e-4fd081367dcf")
	private String description;

	@JacksonXmlProperty(isAttribute=false, localName = "Material")
	@Description("Reference to the material from which the constituent is constructed.")
	@Required()
	@Guid("8f4bb525-9e74-4e8e-bc69-8cd29d76032e")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material;

	@JacksonXmlProperty(isAttribute=true, localName = "Fraction")
	@Description("Optional provision of a fraction of the total amount (volume or weight) that applies to the <em>IfcMaterialConstituentSet</em> that is contributed by this <em>IfcMaterialConstituent</em>.")
	@Guid("c7db76e7-d83a-421c-a53d-714aef504ca3")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure fraction;

	@JacksonXmlProperty(isAttribute=true, localName = "Category")
	@Description("Category of the material constituent, e.g. the role it has in the constituent set it belongs to.")
	@Guid("e83b8380-8104-4922-8366-c2cda154c85c")
	private String category;

	@Description("Material constituent set in which this material constituent is included.")
	@Guid("209ecc93-41cf-491d-b4e8-7e22cada303e")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialConstituentSet toMaterialConstituentSet;


	public IfcMaterialConstituent()
	{
	}

	public IfcMaterialConstituent(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material)
	{
		this.material = material;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial getMaterial() {
		return this.material;
	}

	public void setMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material) {
		this.material = material;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure getFraction() {
		return this.fraction;
	}

	public void setFraction(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNormalisedRatioMeasure fraction) {
		this.fraction = fraction;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialConstituentSet getToMaterialConstituentSet() {
		return this.toMaterialConstituentSet;
	}

	public void setToMaterialConstituentSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialConstituentSet toMaterialConstituentSet) {
		this.toMaterialConstituentSet = toMaterialConstituentSet;
	}


}

