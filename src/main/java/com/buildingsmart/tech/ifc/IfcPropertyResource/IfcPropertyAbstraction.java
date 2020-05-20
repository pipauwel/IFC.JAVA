// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("3981f908-e217-4f02-92e8-517147b40572")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcExtendedProperties.class, name = "IfcExtendedProperties"), @JsonSubTypes.Type(value = IfcPreDefinedProperties.class, name = "IfcPreDefinedProperties"), @JsonSubTypes.Type(value = IfcProperty.class, name = "IfcProperty"), @JsonSubTypes.Type(value = IfcPropertyEnumeration.class, name = "IfcPropertyEnumeration")})
public abstract class IfcPropertyAbstraction implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the property definition.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("45118fce-f74b-4602-880f-2edf8fda5e98")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReferences")
	private Set<IfcExternalReferenceRelationship> hasExternalReferences;


	public IfcPropertyAbstraction()
	{
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return this.hasExternalReferences;
	}


}

