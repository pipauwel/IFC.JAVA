// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5b0d04f-2b00-489b-a200-4b5b96eaec68")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentReference extends IfcExternalReference implements IfcDocumentSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Description of the document reference for informational purposes.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@Guid("a10271e3-eeec-494c-a378-fdf227220c4f")
	private String description;

	@JacksonXmlProperty(isAttribute=false, localName = "ReferencedDocument")
	@Description("The document that is referenced.")
	@Guid("596a3a71-9490-4e46-ba9f-1a65ad2002e3")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation referencedDocument;

	@Description("The document reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@Guid("5c1212d9-a944-4a61-a6ec-2de838a530bb")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument> documentRefForObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument>();


	public IfcDocumentReference()
	{
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation getReferencedDocument() {
		return this.referencedDocument;
	}

	public void setReferencedDocument(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentInformation referencedDocument) {
		this.referencedDocument = referencedDocument;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument> getDocumentRefForObjects() {
		return this.documentRefForObjects;
	}


}

