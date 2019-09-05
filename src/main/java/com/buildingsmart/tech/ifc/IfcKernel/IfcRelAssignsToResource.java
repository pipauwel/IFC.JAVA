// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("8e3fe369-7b2f-42e1-ba03-10771a673e88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToResource extends IfcRelAssigns
{
	@Description("Reference to the resource to which the objects are assigned to.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Datatype expanded to include <em>IfcResource</em> and <em>IfcTypeResource</em>.</blockquote>")
	@Required()
	@Guid("72a6ed25-a274-4a9c-a9ac-7e183ce5c24c")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcResourceSelect relatingResource;


	public IfcRelAssignsToResource()
	{
	}

	public IfcRelAssignsToResource(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcResourceSelect relatingResource)
	{
		super(globalId, relatedObjects);
		this.relatingResource = relatingResource;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcResourceSelect getRelatingResource() {
		return this.relatingResource;
	}

	public void setRelatingResource(com.buildingsmart.tech.ifc.IfcKernel.IfcResourceSelect relatingResource) {
		this.relatingResource = relatingResource;
	}


}

