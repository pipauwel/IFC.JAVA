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

@Guid("dc96d6f9-b8ed-4899-979b-8cc86974ea2d")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPropertySetDefinition extends IfcPropertyDefinition implements IfcPropertySetDefinitionSelect
{
	@Description("The type object to which the property set is assigned. The property set acts as a shared property set to all occurrences of the type object.  <blockquote class=\"note\">  NOTE&nbsp; The relationship between the <em>IfcPropertySetDefinition</em> and the <em>IfcTypeObject</em> is a direct relationship, not utilizing <em>IfcRelDefinesByProperties</em>, for maintaining compatibility with earlier releases of this standard.  </blockquote>  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp;  The cardinality has been changed from 0:1 to 0:? with upward compatibility for file based exchange.  </blockquote>")
	@Guid("5aee7ab3-dcb7-4abe-8fa5-d2b2f2c37083")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject> definesType = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject>();

	@Description("Relation to the property set template, via the objectified relationship <em>IfcRelDefinesByTemplate</em>, that, if given, provides the definition template for the property set or quantity set and its properties.   <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; New inverse relationship, change made with upward compatibility for file based exchange.  </blockquote>")
	@Guid("e9541680-618c-49dc-a052-7d13de3fd336")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByTemplate> isDefinedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByTemplate>();

	@Description("Reference to the relation to one or many object occurrences that are characterized by the property set definition. A single property set can be assigned to multiple object occurrences using the objectified relationship <em>IfcRefDefinesByProperties</em>.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE Inverse attribute renamed from PropertyDefinitionOf with upward compatibility for file-based exchange.  </blockquote>")
	@Guid("74a32a1f-15b3-4366-a7ac-3776403dd4dd")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> definesOccurrence = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties>();


	public IfcPropertySetDefinition()
	{
	}

	public IfcPropertySetDefinition(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcTypeObject> getDefinesType() {
		return this.definesType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByTemplate> getIsDefinedBy() {
		return this.isDefinedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> getDefinesOccurrence() {
		return this.definesOccurrence;
	}


}

