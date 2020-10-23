// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcApprovalResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("6de8ca8d-3bd7-4b78-8326-eece0c07a365")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceApprovalRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("Resource objects that are approved.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c6883e2d-5f86-4009-859d-e33bbdc46730")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceObjectSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedResourceObjects")
	private Set<IfcResourceObjectSelect> relatedResourceObjects;

	@Description("The approval for the resource objects selected.")
	@DataMember(Order = 1)
	@Required()
	@Guid("7a73f010-f2e7-4683-b597-b07460897bf5")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingApproval")
	private IfcApproval relatingApproval;


	public IfcResourceApprovalRelationship()
	{
	}

	public IfcResourceApprovalRelationship(IfcResourceObjectSelect[] relatedResourceObjects, IfcApproval relatingApproval)
	{
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
		this.relatingApproval = relatingApproval;
	}

	public Set<IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}

	public IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}


}

