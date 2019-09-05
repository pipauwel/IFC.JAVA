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

@Guid("a303f452-ac6e-4cf8-aec2-92da14dd6675")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcApprovalRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingApproval")
	@Description("The approval that other approval is related to.")
	@Required()
	@Guid("087ff43e-9086-44f3-b2a4-d3d0f0d65c92")
	private com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval;

	@Description("The approvals that are related to another (relating) approval.<blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality of this attribute has been changed to SET.</blockquote>")
	@Required()
	@MinLength(1)
	@Guid("027066b0-22f2-4641-858b-796e3ab8d77b")
	private Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval> relatedApprovals = new HashSet<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval>();


	public IfcApprovalRelationship()
	{
	}

	public IfcApprovalRelationship(com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval, com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval[] relatedApprovals)
	{
		this.relatingApproval = relatingApproval;
		this.relatedApprovals = new HashSet<>(Arrays.asList(relatedApprovals));
	}

	public com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}

	public Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval> getRelatedApprovals() {
		return this.relatedApprovals;
	}


}

