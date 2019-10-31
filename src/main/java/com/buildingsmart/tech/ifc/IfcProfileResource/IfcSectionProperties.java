// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionTypeEnum;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;

@Guid("88f4e944-e940-4485-bd81-77b90b8076a4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSectionProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPreDefinedProperties
{
	@Description("An indicator whether a specific piece of a cross section is uniform or tapered in longitudinal direction.")
	@Required()
	@Guid("cc454ee2-b89a-4f3c-aaa7-9165bdb8fc51")
	@JacksonXmlProperty(isAttribute=true, localName = "SectionType")
	private IfcSectionTypeEnum sectionType;

	@Description("The cross section profile at the start point of the longitudinal section.")
	@Required()
	@Guid("805a8e86-a781-43fd-948f-70de4614c75e")
	@JacksonXmlProperty(isAttribute=false, localName = "StartProfile")
	private IfcProfileDef startProfile;

	@Description("The cross section profile at the end point of the longitudinal section.")
	@Guid("fcdf8b3f-90a8-4932-b4a8-576c91bf66e8")
	@JacksonXmlProperty(isAttribute=false, localName = "EndProfile")
	private IfcProfileDef endProfile;


	public IfcSectionProperties()
	{
	}

	public IfcSectionProperties(IfcSectionTypeEnum sectionType, IfcProfileDef startProfile)
	{
		this.sectionType = sectionType;
		this.startProfile = startProfile;
	}

	public IfcSectionTypeEnum getSectionType() {
		return this.sectionType;
	}

	public void setSectionType(IfcSectionTypeEnum sectionType) {
		this.sectionType = sectionType;
	}

	public IfcProfileDef getStartProfile() {
		return this.startProfile;
	}

	public void setStartProfile(IfcProfileDef startProfile) {
		this.startProfile = startProfile;
	}

	public IfcProfileDef getEndProfile() {
		return this.endProfile;
	}

	public void setEndProfile(IfcProfileDef endProfile) {
		this.endProfile = endProfile;
	}


}

