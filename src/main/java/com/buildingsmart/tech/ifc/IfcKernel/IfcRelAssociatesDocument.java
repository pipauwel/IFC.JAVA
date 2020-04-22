// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect;

@Guid("e5157cca-2d77-44ab-8df1-4977c66acd14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesDocument extends IfcRelAssociates
{
	@Description("Document information or reference which is applied to the objects.")
	@DataMember(Order = 0)
	@Required()
	@Guid("09cdb427-5879-4ede-bb38-2340a54d0a0b")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingDocument")
	private IfcDocumentSelect relatingDocument;


	public IfcRelAssociatesDocument()
	{
	}

	public IfcRelAssociatesDocument(String globalId, IfcDefinitionSelect[] relatedObjects, IfcDocumentSelect relatingDocument)
	{
		super(globalId, relatedObjects);
		this.relatingDocument = relatingDocument;
	}

	public IfcDocumentSelect getRelatingDocument() {
		return this.relatingDocument;
	}

	public void setRelatingDocument(IfcDocumentSelect relatingDocument) {
		this.relatingDocument = relatingDocument;
	}


}

