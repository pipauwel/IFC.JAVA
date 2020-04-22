// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference;

@Guid("d5b0d04f-2b00-489b-a200-4b5b96eaec68")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentReference extends IfcExternalReference implements IfcDocumentSelect
{
	@Description("Description of the document reference for informational purposes.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 0)
	@Guid("a10271e3-eeec-494c-a378-fdf227220c4f")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The document that is referenced.")
	@DataMember(Order = 1)
	@Guid("596a3a71-9490-4e46-ba9f-1a65ad2002e3")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferencedDocument")
	private IfcDocumentInformation referencedDocument;

	@Description("The document reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "RelatingDocument", Range = "IfcRelAssociatesDocument")
	@Guid("5c1212d9-a944-4a61-a6ec-2de838a530bb")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesDocument")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "DocumentRefForObjects")
	private Set<IfcRelAssociatesDocument> documentRefForObjects;


	public IfcDocumentReference()
	{
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public IfcDocumentInformation getReferencedDocument() {
		return this.referencedDocument;
	}

	public void setReferencedDocument(IfcDocumentInformation referencedDocument) {
		this.referencedDocument = referencedDocument;
	}

	public Set<IfcRelAssociatesDocument> getDocumentRefForObjects() {
		return this.documentRefForObjects;
	}


}

