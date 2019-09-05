// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("349d602e-d775-4785-ac74-0632e4fdd015")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByProperties extends IfcRelDefines
{
	@JsonIgnore
	@Description("Reference to the objects (or single object) to which the property definition applies.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type promoted from subtype <em>IfcObject</em>.  </blockquote>")
	@Required()
	@MinLength(1)
	@Guid("bdb132c9-664c-4197-bf3d-a2f2c81af4cb")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition> relatedObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition>();

	@Description("Reference to the property set definition for that object or set of objects.")
	@Required()
	@Guid("b4e540ff-8ce0-4a5c-a495-3452883ceea7")
	private com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSelect relatingPropertyDefinition;


	public IfcRelDefinesByProperties()
	{
	}

	public IfcRelDefinesByProperties(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition[] relatedObjects, com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSelect relatingPropertyDefinition)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingPropertyDefinition = relatingPropertyDefinition;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition> getRelatedObjects() {
		return this.relatedObjects;
	}

	public com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSelect getRelatingPropertyDefinition() {
		return this.relatingPropertyDefinition;
	}

	public void setRelatingPropertyDefinition(com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSelect relatingPropertyDefinition) {
		this.relatingPropertyDefinition = relatingPropertyDefinition;
	}


}

