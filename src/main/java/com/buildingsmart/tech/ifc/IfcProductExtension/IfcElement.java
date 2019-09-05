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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("9ab3f33b-7e80-4290-afe5-1e7a055cd3ac")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct implements com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralActivityAssignmentSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Tag")
	@Description("The tag (or label) identifier at the particular instance of a product, e.g. the serial number, or the position number. It is the identifier at the occurrence level.")
	@Guid("dcdb600f-7074-41a2-b876-9fb8a9bdb8ec")
	private String tag;

	@Description("Reference to the <em>IfcRelFillsElement</em> Relationship that puts the element as a filling into the opening created within another element.")
	@MaxLength(1)
	@Guid("013896b3-ab8f-4c8f-b6e5-b79d6fd26de9")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelFillsElement> fillsVoids = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelFillsElement>();

	@Description("Reference to the element connection relationship. The relationship then refers to the other element to which this element is connected to.")
	@Guid("5cf4ed22-8e56-4d03-b682-58bb0794ddac")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements> connectedTo = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements>();

	@Description("Reference to the interference relationship to indicate the element that is interfered. The relationship, if provided, indicates that this element has an interference with one or many other elements.  <blockquote class=\"note\">NOTE&nbsp; There is no indication of precedence between <em>IsInterferedByElements</em> and <em>InterferesElements</em>. </blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  New inverse relationship.</blockquote>")
	@Guid("3c54bf0c-7ae9-4dc5-ab08-97a56e21f509")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements> isInterferedByElements = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements>();

	@Description("Reference to the interference relationship to indicate the element that interferes. The relationship, if provided, indicates that this element has an interference with one or many other elements.  <blockquote class=\"note\">NOTE&nbsp; There is no indication of precedence between <em>IsInterferedByElements</em> and <em>InterferesElements</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  New inverse relationship.</blockquote>")
	@Guid("458d5013-ddf1-45f7-b9e5-f043c827ad9c")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements> interferesElements = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasProjections")
	@Description("Projection relationship that adds a feature (using a Boolean union) to the <em>IfcBuildingElement</em>.")
	@Guid("4faee8d9-3beb-4087-9728-11eb04b2e9dd")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement> hasProjections = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement>();

	@Description("Reference relationship to the spatial structure element, to which the element is additionally associated. This relationship may not be hierarchical, an element may be referenced by zero, one or many spatial structure elements.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The inverse attribute has been added with upward compatibility for file based exchange.</blockquote>")
	@Guid("f72e6148-b614-4908-b276-5d15ac3222ce")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure> referencedInStructures = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure>();

	@JacksonXmlProperty(isAttribute=false, localName = "HasOpenings")
	@Description("Reference to the <em>IfcRelVoidsElement</em> relationship that creates an opening in an element. An element can incorporate zero-to-many openings. For each opening, that voids the element, a new relationship <em>IfcRelVoidsElement</em> is generated.")
	@Guid("887366e1-d446-4f3b-8643-605d00ce2c16")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement> hasOpenings = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement>();

	@Description("Reference to the connection relationship with realizing element. The relationship, if provided, assigns this element as the realizing element to the connection, which provides the physical manifestation of the connection relationship.")
	@Guid("093ff6ec-c8af-4a34-8578-91694c1273f1")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsWithRealizingElements> isConnectionRealization = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsWithRealizingElements>();

	@Description("Reference to space boundaries by virtue of the objectified relationship <em>IfcRelSpaceBoundary</em>. It defines the concept of an element bounding spaces.")
	@Guid("94ab1bc4-3273-4afe-998f-9be7c26a2294")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary> providesBoundaries = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary>();

	@Description("Reference to the element connection relationship. The relationship then refers to the other element that is connected to this element.")
	@Guid("2bd302cf-6ded-4b81-ae7b-34c479d3014c")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements> connectedFrom = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements>();

	@Description("Containment relationship to the spatial structure element, to which the element is primarily associated. This containment relationship has to be hierachical, i.e. an element may only be assigned directly to zero or one spatial structure.")
	@MaxLength(1)
	@Guid("e0676768-f79e-407b-9147-49374bb82e14")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> containedInStructure = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure>();

	@Description("Reference to <em>IfcCovering</em> by virtue of the objectified relationship <em>IfcRelCoversBldgElement</em>. It defines the concept of an element having coverings associated.")
	@Guid("e73f220c-19f9-4fbd-9302-9b407708ffdf")
	private Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversBldgElements> hasCoverings = new HashSet<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversBldgElements>();


	public IfcElement()
	{
	}

	public IfcElement(String globalId)
	{
		super(globalId);
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelFillsElement> getFillsVoids() {
		return this.fillsVoids;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements> getConnectedTo() {
		return this.connectedTo;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements> getIsInterferedByElements() {
		return this.isInterferedByElements;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelInterferesElements> getInterferesElements() {
		return this.interferesElements;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelProjectsElement> getHasProjections() {
		return this.hasProjections;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		return this.referencedInStructures;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement> getHasOpenings() {
		return this.hasOpenings;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsWithRealizingElements> getIsConnectionRealization() {
		return this.isConnectionRealization;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelSpaceBoundary> getProvidesBoundaries() {
		return this.providesBoundaries;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements> getConnectedFrom() {
		return this.connectedFrom;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return this.containedInStructure;
	}

	public Set<com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelCoversBldgElements> getHasCoverings() {
		return this.hasCoverings;
	}


}

