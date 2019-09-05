// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("e5157cca-2d77-44ab-8df1-4977c66acd14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesDocument extends IfcRelAssociates
{
	@Description("Document information or reference which is applied to the objects.")
	@Required()
	@Guid("09cdb427-5879-4ede-bb38-2340a54d0a0b")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect relatingDocument;


	public IfcRelAssociatesDocument()
	{
	}

	public IfcRelAssociatesDocument(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedObjects, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect relatingDocument)
	{
		super(globalId, relatedObjects);
		this.relatingDocument = relatingDocument;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect getRelatingDocument() {
		return this.relatingDocument;
	}

	public void setRelatingDocument(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcDocumentSelect relatingDocument) {
		this.relatingDocument = relatingDocument;
	}


}

