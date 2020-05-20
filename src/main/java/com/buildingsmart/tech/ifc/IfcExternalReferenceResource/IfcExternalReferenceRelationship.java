// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("d82462fa-c9f8-472b-a7e9-0f1f7136fdfa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcExternalReferenceRelationship extends IfcResourceLevelRelationship
{
	@Description("An external reference that can be used to tag an object within the range of <em>IfcResourceObjectSelect</em>.   <blockquote class=\"note\">   NOTE&nbsp; External references can be a library reference (for example a dictionary or a catalogue reference), a classification reference, or a documentation reference.<br>  </blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("d01def8d-ec4f-4bb4-b0d4-15ab85764b7a")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingReference")
	private IfcExternalReference relatingReference;

	@Description("Objects within the list of <em>IfcResourceObjectSelect</em> that can be tagged by an external reference to a dictionary, library, catalogue, classification or documentation.")
	@DataMember(Order = 1)
	@Required()
	@Guid("bf374582-c84f-44fd-adb8-bb8df33a5f01")
	@MinLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceObjectSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedResourceObjects")*/
	@JsonIgnore
	private Set<IfcResourceObjectSelect> relatedResourceObjects;


	public IfcExternalReferenceRelationship()
	{
	}

	public IfcExternalReferenceRelationship(IfcExternalReference relatingReference, IfcResourceObjectSelect[] relatedResourceObjects)
	{
		this.relatingReference = relatingReference;
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
	}

	public IfcExternalReference getRelatingReference() {
		return this.relatingReference;
	}

	public void setRelatingReference(IfcExternalReference relatingReference) {
		this.relatingReference = relatingReference;
	}

	public Set<IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}


}

