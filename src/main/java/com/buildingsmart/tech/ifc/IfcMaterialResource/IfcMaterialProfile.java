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

@Guid("b6fed4e6-ea5a-425b-a9b3-54d96e75f62b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfile extends IfcMaterialDefinition
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name by which the material profile is known.")
	@Guid("1b62c1d3-3352-4939-90c9-2f85a6eb8a8f")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Definition of the material profile in descriptive terms.")
	@Guid("b84c1f3a-f5f2-49bc-a2ac-049c1bbd8755")
	private String description;

	@JacksonXmlProperty(isAttribute=false, localName = "Material")
	@Description("Optional reference to the material from which the profile is constructed.")
	@Guid("3e27fe58-b578-432b-9e96-3e6a093b469d")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material;

	@JacksonXmlProperty(isAttribute=false, localName = "Profile")
	@Description("Identification of the profile for which this material profile is associating material.")
	@Required()
	@Guid("0724aa33-c5b4-42bb-a9ad-24e0948919a5")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profile;

	@JacksonXmlProperty(isAttribute=true, localName = "Priority")
	@Description("The relative priority of the profile, expressed as normalised integer range [0..100]. Controls how profiles intersect in connections and corners of building elements: A profile from one element protrudes into (i.e. displaces) a profile from another element in a joint of these elements if the former element's profile has higher priority than the latter. The priority value for a material profile in an element has to be set and maintained by software applications in relation to the material profiles in connected elements.")
	@Guid("34b4027d-5a6d-4ca7-9e38-938813104361")
	private int priority;

	@JacksonXmlProperty(isAttribute=true, localName = "Category")
	@Description("Category of the material profile, e.g. the role it has in the profile set it belongs to. The list of keywords might be extended by model view definitions, however the following keywords shall apply in general:  <ul>   <li class=\"small\">'LoadBearing' &mdash; the material profile having a load bearing function.</li>   <li class=\"small\">'Insulation' &mdash; the material profile having an insolating function.</li>   <li class=\"small\">'Finish' &mdash; the material profile being the finish.</li>  </ul>")
	@Guid("1eae177e-bf43-4c31-8ee1-ead88a469691")
	private String category;

	@Description("Material profile set in which this material profile is included.")
	@Guid("5b1cac06-3b41-4dc5-b115-73766008da55")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet toMaterialProfileSet;


	public IfcMaterialProfile()
	{
	}

	public IfcMaterialProfile(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profile)
	{
		this.profile = profile;
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

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getProfile() {
		return this.profile;
	}

	public void setProfile(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef profile) {
		this.profile = profile;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet getToMaterialProfileSet() {
		return this.toMaterialProfileSet;
	}

	public void setToMaterialProfileSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet toMaterialProfileSet) {
		this.toMaterialProfileSet = toMaterialProfileSet;
	}


}

