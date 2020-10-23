// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcCompositeProfileDef;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("e0fca8fd-d265-44c8-a538-722ea9b7a1a2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfileSet extends IfcMaterialDefinition
{
	@Description("The name by which the material profile set is known.")
	@DataMember(Order = 0)
	@Guid("575e5fc0-0fb3-43df-bc1f-398c3df06e28")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Definition of the material profile set in descriptive terms.")
	@DataMember(Order = 1)
	@Guid("96616325-fa1f-4b5b-9ad7-4f5ea7bd82ae")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Identification of the profiles from which the material profile set is composed.")
	@DataMember(Order = 2)
	@Required()
	@Guid("0bc09f75-2471-4b85-ab7d-c1f65511961c")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterialProfile")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "materialProfiles")
	private List<IfcMaterialProfile> materialProfiles;

	@Description("Reference to the composite profile definition for which this material profile set associates material to each of its individual profiles. If only a single material profile is used (the most typical case) then no <em>CompositeProfile</em> is asserted.    <blockquote class=\"note\">NOTE&nbsp; The referenced <em>IfcCompositeProfileDef</em> instance shall be composed of all of the <em>IfcProfileDef</em> instances which are used via the MaterialProfiles list in the current <em>IfcMaterialProfileSet</em>.  </blockquote>")
	@DataMember(Order = 3)
	@Guid("46d8d3f2-4791-4c45-b7a3-1d9a006595fb")
	@JacksonXmlProperty(isAttribute=false, localName = "compositeProfile")
	private IfcCompositeProfileDef compositeProfile;


	public IfcMaterialProfileSet()
	{
	}

	public IfcMaterialProfileSet(IfcMaterialProfile[] materialProfiles)
	{
		this.materialProfiles = new ArrayList<>(Arrays.asList(materialProfiles));
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public List<IfcMaterialProfile> getMaterialProfiles() {
		return this.materialProfiles;
	}

	public IfcCompositeProfileDef getCompositeProfile() {
		return this.compositeProfile;
	}

	public void setCompositeProfile(IfcCompositeProfileDef compositeProfile) {
		this.compositeProfile = compositeProfile;
	}


}

