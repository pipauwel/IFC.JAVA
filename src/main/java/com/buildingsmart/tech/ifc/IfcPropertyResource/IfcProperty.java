// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("911b51d0-e3e7-45db-a881-520360ded638")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcProperty extends IfcPropertyAbstraction
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Name for this property. This label is the significant name string that defines the semantic meaning for the property.")
	@Required()
	@Guid("cec40e31-025d-4bcc-ae89-09d7916a8ee6")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Informative text to explain the property.")
	@Guid("563a5298-c546-435f-98d5-4d192815257f")
	private String description;

	@Description("Reference to the <em>IfcPropertySet</em> by which the <em>IfcProperty</em> is referenced.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute to navigate from <em>IfcProperty</em> to <em>IfcPropertySet</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("79ce08ab-7c92-4db4-9325-4a08c1c70c38")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySet> partOfPset = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySet>();

	@Description("The property on whose value that of another property depends.")
	@Guid("386eb852-dc2b-4164-963e-1d2791e03caf")
	private Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship> propertyForDependance = new HashSet<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship>();

	@Description("The relating property on which the value of the property depends.")
	@Guid("a26503fc-f130-45bc-90c4-05998f9e5137")
	private Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship> propertyDependsOn = new HashSet<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship>();

	@Description("Reference to the <em>IfcComplexProperty</em> in which the <em>IfcProperty</em> is contained.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality has changed to 0..n to allow reuse of instances of <em>IfcProperty</em> in several <em>IfcComplexProperty</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("be34513c-c6e4-4dd1-b6be-63ae5e66413f")
	private Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcComplexProperty> partOfComplex = new HashSet<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcComplexProperty>();

	@Description("User-defined constraints for the property.")
	@Guid("33bd1930-a3a9-40cd-a3cc-6c31ed80b89f")
	private Set<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship> hasConstraints = new HashSet<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship>();

	@Description("User-defined approvals for the property.")
	@Guid("a25de802-e2fe-47f2-adcd-e56cdc287d21")
	private Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship> hasApprovals = new HashSet<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship>();


	public IfcProperty()
	{
	}

	public IfcProperty(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySet> getPartOfPset() {
		return this.partOfPset;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship> getPropertyForDependance() {
		return this.propertyForDependance;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyDependencyRelationship> getPropertyDependsOn() {
		return this.propertyDependsOn;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPropertyResource.IfcComplexProperty> getPartOfComplex() {
		return this.partOfComplex;
	}

	public Set<com.buildingsmart.tech.ifc.IfcConstraintResource.IfcResourceConstraintRelationship> getHasConstraints() {
		return this.hasConstraints;
	}

	public Set<com.buildingsmart.tech.ifc.IfcApprovalResource.IfcResourceApprovalRelationship> getHasApprovals() {
		return this.hasApprovals;
	}


}

