// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("8672f3a9-df18-46b2-9783-ede9bc362146")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcDistributionControlElement.class, name = "IfcDistributionControlElement"), @JsonSubTypes.Type(value = IfcDistributionFlowElement.class, name = "IfcDistributionFlowElement")})
public class IfcDistributionElement extends IfcElement
{
	@Description("Reference to the element to port connection relationship. The relationship then refers to the port which is contained in this element.    <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The inverse attribute is deprecated. Relationship to ports, contained within the <em>IfcDistributionElement</em> is now realized by the inverse relationship <em>NestedBy</em> referencing <em>IfcRelNests</em>.  </blockquote>")
	@Guid("da8a54e0-2b6b-4b7e-91fb-2087561bccf5")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsPortToElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasPorts")
	private Set<IfcRelConnectsPortToElement> hasPorts;


	public IfcDistributionElement()
	{
	}

	public IfcDistributionElement(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelConnectsPortToElement> getHasPorts() {
		return this.hasPorts;
	}


}

