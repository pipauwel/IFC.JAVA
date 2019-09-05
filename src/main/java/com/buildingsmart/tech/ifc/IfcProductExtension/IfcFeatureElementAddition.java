// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("818c820c-139e-4825-96bc-6c16e6f606d4")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcFeatureElementAddition extends IfcFeatureElement
{
	@Description("Reference to the <em>IfcRelProjectsElement</em> relationship that uses this <em>IfcFeatureElementAddition</em> to create a volume addition at an element. The <em>IfcFeatureElementAddition</em> can only be used to create a single addition at a single element using Boolean addition operation.")
	@Guid("916482f1-a6fe-4d2a-86b0-8f9c6796f946")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement projectsElements;


	public IfcFeatureElementAddition()
	{
	}

	public IfcFeatureElementAddition(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement getProjectsElements() {
		return this.projectsElements;
	}

	public void setProjectsElements(com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement projectsElements) {
		this.projectsElements = projectsElements;
	}


}

