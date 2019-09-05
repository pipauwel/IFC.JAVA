// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d7038275-a6b7-4293-86c1-f69337a29534")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelCoversSpaces extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingSpace")
	@Description("Relationship to the space object that is covered.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute name has been changed from <em>RelatedSpace</em> to <em>RelatingSpace</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("934695b7-b499-4d39-a698-18b232840eaf")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpace relatingSpace;

	@Description("Relationship to the set of coverings covering that cover surfaces of this space.")
	@Required()
	@MinLength(1)
	@Guid("18964ad6-f7f4-49e7-b15b-0b72b0b504e5")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering> relatedCoverings = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering>();


	public IfcRelCoversSpaces()
	{
	}

	public IfcRelCoversSpaces(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpace relatingSpace, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering[] relatedCoverings)
	{
		super(globalId);
		this.relatingSpace = relatingSpace;
		this.relatedCoverings = new HashSet<>(Arrays.asList(relatedCoverings));
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpace getRelatingSpace() {
		return this.relatingSpace;
	}

	public void setRelatingSpace(com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpace relatingSpace) {
		this.relatingSpace = relatingSpace;
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering> getRelatedCoverings() {
		return this.relatedCoverings;
	}


}

