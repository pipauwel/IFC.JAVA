// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a14f1e2c-6b41-4740-8797-3a51d8f35cc5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceConstraintRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingConstraint")
	@Description("The constraint that is to be related.")
	@Required()
	@Guid("e196ff69-9601-4f75-a1bf-5c093b548895")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint;

	@Description("The properties to which a constraint is to be related.")
	@Required()
	@MinLength(1)
	@Guid("8f528729-9ae0-43e9-9cdc-6f2923e574f4")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> relatedResourceObjects = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect>();


	public IfcResourceConstraintRelationship()
	{
	}

	public IfcResourceConstraintRelationship(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect[] relatedResourceObjects)
	{
		this.relatingConstraint = relatingConstraint;
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint getRelatingConstraint() {
		return this.relatingConstraint;
	}

	public void setRelatingConstraint(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint relatingConstraint) {
		this.relatingConstraint = relatingConstraint;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}


}

