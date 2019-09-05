// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcApprovalResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("6de8ca8d-3bd7-4b78-8326-eece0c07a365")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceApprovalRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("Resource objects that are approved.")
	@Required()
	@MinLength(1)
	@Guid("c6883e2d-5f86-4009-859d-e33bbdc46730")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> relatedResourceObjects = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect>();

	@JacksonXmlProperty(isAttribute=false, localName = "RelatingApproval")
	@Description("The approval for the resource objects selected.")
	@Required()
	@Guid("7a73f010-f2e7-4683-b597-b07460897bf5")
	private com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval;


	public IfcResourceApprovalRelationship()
	{
	}

	public IfcResourceApprovalRelationship(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect[] relatedResourceObjects, com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval)
	{
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
		this.relatingApproval = relatingApproval;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}

	public com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}


}

