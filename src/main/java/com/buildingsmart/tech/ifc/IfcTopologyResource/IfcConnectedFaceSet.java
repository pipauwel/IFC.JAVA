// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("00739840-0188-4605-bb14-19851c954616")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcClosedShell.class, name = "IfcClosedShell"), @JsonSubTypes.Type(value = IfcOpenShell.class, name = "IfcOpenShell")})
public class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem
{
	@Description("The set of faces arcwise connected along common edges or vertices.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1fabb589-8fee-4286-8be7-1f8643ec33b7")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcFace")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "cfsFaces")
	private Set<IfcFace> cfsFaces;


	public IfcConnectedFaceSet()
	{
	}

	public IfcConnectedFaceSet(IfcFace[] cfsFaces)
	{
		this.cfsFaces = new HashSet<>(Arrays.asList(cfsFaces));
	}

	public Set<IfcFace> getCfsFaces() {
		return this.cfsFaces;
	}


}

