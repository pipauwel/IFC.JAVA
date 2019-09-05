// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("00739840-0188-4605-bb14-19851c954616")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConnectedFaceSet extends IfcTopologicalRepresentationItem
{
	@Description("The set of faces arcwise connected along common edges or vertices.")
	@Required()
	@MinLength(1)
	@Guid("1fabb589-8fee-4286-8be7-1f8643ec33b7")
	private Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace> cfsFaces = new HashSet<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace>();


	public IfcConnectedFaceSet()
	{
	}

	public IfcConnectedFaceSet(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace[] cfsFaces)
	{
		this.cfsFaces = new HashSet<>(Arrays.asList(cfsFaces));
	}

	public Set<com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFace> getCfsFaces() {
		return this.cfsFaces;
	}


}

