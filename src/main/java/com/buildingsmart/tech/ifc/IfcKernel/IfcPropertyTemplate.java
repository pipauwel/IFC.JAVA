// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("dfa52a71-6e64-4b4c-af07-d476c558c888")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPropertyTemplate extends IfcPropertyTemplateDefinition
{
	@Description("Reference to a complex property templates. It should only be provided, if the <em>PropertyType</em> of the referenced complex property template is set to <small>COMPLEX</small>.")
	@Guid("c8bb95e2-205f-47e2-988e-debdc6a2ef7c")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplate> partOfComplexTemplate = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplate>();

	@Description("Reference to the <em>IfcPropertySetTemplate</em> that defines the scope for the <em>IfcPropertyTemplate</em>. A single <em>IfcPropertyTemplate</em> can be defined within the scope of zero, one or many <em>IfcPropertySetTemplate</em>'.")
	@Guid("8118417e-88aa-422d-889f-ee94c54dd384")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate> partOfPsetTemplate = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate>();


	public IfcPropertyTemplate()
	{
	}

	public IfcPropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcComplexPropertyTemplate> getPartOfComplexTemplate() {
		return this.partOfComplexTemplate;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetTemplate> getPartOfPsetTemplate() {
		return this.partOfPsetTemplate;
	}


}

