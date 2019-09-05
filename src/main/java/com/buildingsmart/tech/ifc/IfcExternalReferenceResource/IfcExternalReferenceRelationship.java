// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d82462fa-c9f8-472b-a7e9-0f1f7136fdfa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingReference")
	@Description("An external reference that can be used to tag an object within the range of <em>IfcResourceObjectSelect</em>.   <blockquote class=\"note\">   NOTE&nbsp; External references can be a library reference (for example a dictionary or a catalogue reference), a classification reference, or a documentation reference.<br>  </blockquote>")
	@Required()
	@Guid("d01def8d-ec4f-4bb4-b0d4-15ab85764b7a")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference relatingReference;

	@Description("Objects within the list of <em>IfcResourceObjectSelect</em> that can be tagged by an external reference to a dictionary, library, catalogue, classification or documentation.")
	@Required()
	@MinLength(1)
	@Guid("bf374582-c84f-44fd-adb8-bb8df33a5f01")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> relatedResourceObjects = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect>();


	public IfcExternalReferenceRelationship()
	{
	}

	public IfcExternalReferenceRelationship(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference relatingReference, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect[] relatedResourceObjects)
	{
		this.relatingReference = relatingReference;
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference getRelatingReference() {
		return this.relatingReference;
	}

	public void setRelatingReference(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference relatingReference) {
		this.relatingReference = relatingReference;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}


}

