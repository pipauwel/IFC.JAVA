// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("921a1a16-20f9-45bc-956b-62e09d80fa95")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelCoversBldgElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Relationship to the element that is covered. It includes building elements for coverings such as flooring or cladding, or distribution elements for coverings such as sleeving or wrapping.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9c474fe1-510a-4abc-a5df-1d393a70137d")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingBuildingElement")
	private IfcElement relatingBuildingElement;

	@Description("Relationship to the set of coverings that are assigned to this element.")
	@DataMember(Order = 1)
	@Required()
	@Guid("4422a81c-654e-4da3-84be-ef46e94d3d3a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCovering")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "relatedCoverings")
	private Set<IfcCovering> relatedCoverings;


	public IfcRelCoversBldgElements()
	{
	}

	public IfcRelCoversBldgElements(String globalId, IfcElement relatingBuildingElement, IfcCovering[] relatedCoverings)
	{
		super(globalId);
		this.relatingBuildingElement = relatingBuildingElement;
		this.relatedCoverings = new HashSet<>(Arrays.asList(relatedCoverings));
	}

	public IfcElement getRelatingBuildingElement() {
		return this.relatingBuildingElement;
	}

	public void setRelatingBuildingElement(IfcElement relatingBuildingElement) {
		this.relatingBuildingElement = relatingBuildingElement;
	}

	public Set<IfcCovering> getRelatedCoverings() {
		return this.relatedCoverings;
	}


}

