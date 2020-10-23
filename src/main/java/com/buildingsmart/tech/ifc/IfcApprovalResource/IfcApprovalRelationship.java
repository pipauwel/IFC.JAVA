// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcApprovalResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("a303f452-ac6e-4cf8-aec2-92da14dd6675")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcApprovalRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("The approval that other approval is related to.")
	@DataMember(Order = 0)
	@Required()
	@Guid("087ff43e-9086-44f3-b2a4-d3d0f0d65c92")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingApproval")
	private IfcApproval relatingApproval;

	@Description("The approvals that are related to another (relating) approval.<blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality of this attribute has been changed to SET.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("027066b0-22f2-4641-858b-796e3ab8d77b")
	@MinLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcApproval")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedApprovals")*/
	@JsonIgnore
	private Set<IfcApproval> relatedApprovals;


	public IfcApprovalRelationship()
	{
	}

	public IfcApprovalRelationship(IfcApproval relatingApproval, IfcApproval[] relatedApprovals)
	{
		this.relatingApproval = relatingApproval;
		this.relatedApprovals = new HashSet<>(Arrays.asList(relatedApprovals));
	}

	public IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}

	public Set<IfcApproval> getRelatedApprovals() {
		return this.relatedApprovals;
	}


}

