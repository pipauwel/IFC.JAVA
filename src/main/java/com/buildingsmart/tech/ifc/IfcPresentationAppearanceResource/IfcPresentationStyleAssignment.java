// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyleSelect;

@Guid("3ca4cc70-a4c3-45fa-8e65-f85288defd8b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPresentationStyleAssignment implements IfcStyleAssignmentSelect
{
	@Description("A set of presentation styles that are assigned to styled items.")
	@DataMember(Order = 0)
	@Required()
	@Guid("a2fe78b6-621d-4fb6-9d05-6f1b465dc3c0")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPresentationStyleSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Styles")
	private Set<IfcPresentationStyleSelect> styles;


	public IfcPresentationStyleAssignment()
	{
	}

	public IfcPresentationStyleAssignment(IfcPresentationStyleSelect[] styles)
	{
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public Set<IfcPresentationStyleSelect> getStyles() {
		return this.styles;
	}


}

