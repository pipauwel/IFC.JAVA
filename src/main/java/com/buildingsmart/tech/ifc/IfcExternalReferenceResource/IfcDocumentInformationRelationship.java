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

@Guid("79f322fe-2390-4be9-ac5e-2c79ccbfc1d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentInformationRelationship extends IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingDocument")
	@Description("The document that acts as the parent, referencing or original document in a relationship.")
	@Required()
	@Guid("aa89e7a7-4654-4e52-af82-fda6e179130a")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation relatingDocument;

	@Description("The document that acts as the child, referenced or replacing document in a relationship.")
	@Required()
	@MinLength(1)
	@Guid("785f2826-b24e-4a4e-ba65-203c8c439d34")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation> relatedDocuments = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation>();

	@JacksonXmlProperty(isAttribute=true, localName = "RelationshipType")
	@Description("Describes the type of relationship between documents. This could be sub-document, replacement etc. The interpretation has to be established in an application context.")
	@Guid("b23740b1-d36a-4d3d-88df-c8e7e0d1efbf")
	private String relationshipType;


	public IfcDocumentInformationRelationship()
	{
	}

	public IfcDocumentInformationRelationship(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation relatingDocument, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation[] relatedDocuments)
	{
		this.relatingDocument = relatingDocument;
		this.relatedDocuments = new HashSet<>(Arrays.asList(relatedDocuments));
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation getRelatingDocument() {
		return this.relatingDocument;
	}

	public void setRelatingDocument(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation relatingDocument) {
		this.relatingDocument = relatingDocument;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation> getRelatedDocuments() {
		return this.relatedDocuments;
	}

	public String getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}


}

