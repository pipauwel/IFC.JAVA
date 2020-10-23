// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e5157cca-2d77-44ab-8df1-4977c66acd14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesDocument extends IfcRelAssociates
{
	@Description("Document information or reference which is applied to the objects.")
	@DataMember(Order = 0)
	@Required()
	@Guid("09cdb427-5879-4ede-bb38-2340a54d0a0b")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingDocument")
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

