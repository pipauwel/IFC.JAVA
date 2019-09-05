// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("3ca4cc70-a4c3-45fa-8e65-f85288defd8b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPresentationStyleAssignment implements IfcStyleAssignmentSelect
{
	@Description("A set of presentation styles that are assigned to styled items.")
	@Required()
	@MinLength(1)
	@Guid("a2fe78b6-621d-4fb6-9d05-6f1b465dc3c0")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyleSelect> styles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyleSelect>();


	public IfcPresentationStyleAssignment()
	{
	}

	public IfcPresentationStyleAssignment(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyleSelect[] styles)
	{
		this.styles = new HashSet<>(Arrays.asList(styles));
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyleSelect> getStyles() {
		return this.styles;
	}


}

