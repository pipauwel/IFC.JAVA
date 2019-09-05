// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("032e8ec4-b702-496b-b1c7-582032fc9a31")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcPort extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("Reference to the element to port connection relationship. The relationship then refers to the element in which this port is contained.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The cardinality has been changed from 1:1 to 0:1.  IFC4 DEPRECATION&nbsp; The inverse relationship is deprecated for fixed ports due to deprecation of <em>IfcRelConnectsPortToElement</em> for this usage. Use inverse relationship <em>Nests</em> instead.  </blockquote>")
	@MaxLength(1)
	@Guid("36e82fa5-2db1-4c7a-8ef6-45624460a621")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPortToElement> containedIn = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPortToElement>();

	@Description("Reference to a port that is connected by the objectified relationship.")
	@MaxLength(1)
	@Guid("1bb39505-d966-41c3-af7f-7fb70e99a055")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts> connectedFrom = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts>();

	@Description("Reference to the port connection relationship. The relationship then refers to the other port to which this port is connected.")
	@MaxLength(1)
	@Guid("ab8ec2a9-69ab-4668-b82d-b20d591cbd40")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts> connectedTo = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts>();


	public IfcPort()
	{
	}

	public IfcPort(String globalId)
	{
		super(globalId);
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPortToElement> getContainedIn() {
		return this.containedIn;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts> getConnectedFrom() {
		return this.connectedFrom;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsPorts> getConnectedTo() {
		return this.connectedTo;
	}


}

