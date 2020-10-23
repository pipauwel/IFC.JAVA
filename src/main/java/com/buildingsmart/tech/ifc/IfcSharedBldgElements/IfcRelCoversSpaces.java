// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("d7038275-a6b7-4293-86c1-f69337a29534")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelCoversSpaces extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Relationship to the space object that is covered.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute name has been changed from <em>RelatedSpace</em> to <em>RelatingSpace</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("934695b7-b499-4d39-a698-18b232840eaf")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingSpace")
	private IfcSpace relatingSpace;

	@Description("Relationship to the set of coverings covering that cover surfaces of this space.")
	@DataMember(Order = 1)
	@Required()
	@Guid("18964ad6-f7f4-49e7-b15b-0b72b0b504e5")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCovering")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedCoverings")
	private Set<IfcCovering> relatedCoverings;


	public IfcRelCoversSpaces()
	{
	}

	public IfcRelCoversSpaces(String globalId, IfcSpace relatingSpace, IfcCovering[] relatedCoverings)
	{
		super(globalId);
		this.relatingSpace = relatingSpace;
		this.relatedCoverings = new HashSet<>(Arrays.asList(relatedCoverings));
	}

	public IfcSpace getRelatingSpace() {
		return this.relatingSpace;
	}

	public void setRelatingSpace(IfcSpace relatingSpace) {
		this.relatingSpace = relatingSpace;
	}

	public Set<IfcCovering> getRelatedCoverings() {
		return this.relatedCoverings;
	}


}

