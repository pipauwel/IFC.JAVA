// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("006b5d7c-0365-48b1-85a4-b7cc46bfe68e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements
{
	@Description("Defines the elements that realize a connection relationship.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d81eeca1-759e-48b4-9c08-b45f1385450f")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RealizingElements")
	private Set<IfcElement> realizingElements;

	@Description("The type of the connection given for informal purposes, it may include labels, like 'joint', 'rigid joint', 'flexible joint', etc.")
	@DataMember(Order = 1)
	@Guid("cd071293-ee93-4630-9dc7-8272188f95f5")
	@JacksonXmlProperty(isAttribute=true, localName = "ConnectionType")
	private String connectionType;


	public IfcRelConnectsWithRealizingElements()
	{
	}

	public IfcRelConnectsWithRealizingElements(String globalId, IfcElement relatingElement, IfcElement relatedElement, IfcElement[] realizingElements)
	{
		super(globalId, relatingElement, relatedElement);
		this.realizingElements = new HashSet<>(Arrays.asList(realizingElements));
	}

	public Set<IfcElement> getRealizingElements() {
		return this.realizingElements;
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}


}

