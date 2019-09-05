// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("e991a118-741e-4598-a023-d9ad58f0f717")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGroup extends IfcObject
{
	@Description("Reference to the relationship <em>IfcRelAssignsToGroup</em> that assigns the one to many group members to the <em>IfcGroup</em> object.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality has been changed from 1..1 to 0..? in order to allow the exchange of a group concept without having already group members assigned. It now also allows the use of many instances of <em>IfcRelAssignsToGroup</em> to assign the group members. The change has been done with upward compatibility for file based exchange.</blockquote>")
	@Guid("d62fb122-4977-4bdd-9663-ff15e288c506")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToGroup> isGroupedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToGroup>();


	public IfcGroup()
	{
	}

	public IfcGroup(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToGroup> getIsGroupedBy() {
		return this.isGroupedBy;
	}


}

