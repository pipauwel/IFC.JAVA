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

@Guid("921a1a16-20f9-45bc-956b-62e09d80fa95")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelCoversBldgElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingBuildingElement")
	@Description("Relationship to the element that is covered. It includes building elements for coverings such as flooring or cladding, or distribution elements for coverings such as sleeving or wrapping.")
	@Required()
	@Guid("9c474fe1-510a-4abc-a5df-1d393a70137d")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement;

	@Description("Relationship to the set of coverings that are assigned to this element.")
	@Required()
	@MinLength(1)
	@Guid("4422a81c-654e-4da3-84be-ef46e94d3d3a")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering> relatedCoverings = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering>();


	public IfcRelCoversBldgElements()
	{
	}

	public IfcRelCoversBldgElements(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering[] relatedCoverings)
	{
		super(globalId);
		this.relatingBuildingElement = relatingBuildingElement;
		this.relatedCoverings = new HashSet<>(Arrays.asList(relatedCoverings));
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRelatingBuildingElement() {
		return this.relatingBuildingElement;
	}

	public void setRelatingBuildingElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement) {
		this.relatingBuildingElement = relatingBuildingElement;
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering> getRelatedCoverings() {
		return this.relatedCoverings;
	}


}

