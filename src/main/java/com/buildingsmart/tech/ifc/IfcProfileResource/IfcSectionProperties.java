// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("88f4e944-e940-4485-bd81-77b90b8076a4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@JacksonXmlProperty(isAttribute=true, localName = "SectionType")
	@Description("An indicator whether a specific piece of a cross section is uniform or tapered in longitudinal direction.")
	@Required()
	@Guid("cc454ee2-b89a-4f3c-aaa7-9165bdb8fc51")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionTypeEnum sectionType;

	@JacksonXmlProperty(isAttribute=false, localName = "StartProfile")
	@Description("The cross section profile at the start point of the longitudinal section.")
	@Required()
	@Guid("805a8e86-a781-43fd-948f-70de4614c75e")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef startProfile;

	@JacksonXmlProperty(isAttribute=false, localName = "EndProfile")
	@Description("The cross section profile at the end point of the longitudinal section.")
	@Guid("fcdf8b3f-90a8-4932-b4a8-576c91bf66e8")
	private com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endProfile;


	public IfcSectionProperties()
	{
	}

	public IfcSectionProperties(com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionTypeEnum sectionType, com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef startProfile)
	{
		this.sectionType = sectionType;
		this.startProfile = startProfile;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionTypeEnum getSectionType() {
		return this.sectionType;
	}

	public void setSectionType(com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionTypeEnum sectionType) {
		this.sectionType = sectionType;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getStartProfile() {
		return this.startProfile;
	}

	public void setStartProfile(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef startProfile) {
		this.startProfile = startProfile;
	}

	public com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef getEndProfile() {
		return this.endProfile;
	}

	public void setEndProfile(com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef endProfile) {
		this.endProfile = endProfile;
	}


}

