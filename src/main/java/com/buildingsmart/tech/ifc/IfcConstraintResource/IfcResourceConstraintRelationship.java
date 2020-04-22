// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

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
import com.buildingsmart.tech.ifc.IfcConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect;

@Guid("a14f1e2c-6b41-4740-8797-3a51d8f35cc5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceConstraintRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("The constraint that is to be related.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e196ff69-9601-4f75-a1bf-5c093b548895")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingConstraint")
	private IfcConstraint relatingConstraint;

	@Description("The properties to which a constraint is to be related.")
	@DataMember(Order = 1)
	@Required()
	@Guid("8f528729-9ae0-43e9-9cdc-6f2923e574f4")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceObjectSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedResourceObjects")
	private Set<IfcResourceObjectSelect> relatedResourceObjects;


	public IfcResourceConstraintRelationship()
	{
	}

	public IfcResourceConstraintRelationship(IfcConstraint relatingConstraint, IfcResourceObjectSelect[] relatedResourceObjects)
	{
		this.relatingConstraint = relatingConstraint;
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
	}

	public IfcConstraint getRelatingConstraint() {
		return this.relatingConstraint;
	}

	public void setRelatingConstraint(IfcConstraint relatingConstraint) {
		this.relatingConstraint = relatingConstraint;
	}

	public Set<IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}


}

