// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesClassification;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("d6845f56-93c2-41ea-bd7e-edbfea1e9068")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcClassificationReference extends IfcExternalReference implements IfcClassificationReferenceSelect, IfcClassificationSelect
{
	@Description("The classification system or source that is referenced.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type changed to <em>IfcClassificationReferenceSelect</em>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("4bb1e966-6ba7-4148-bab9-33623a5c9511")
	@JsonIgnore
	private IfcClassificationReferenceSelect referencedSource;

	@Description("Description of the classification reference for informational purposes.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 1)
	@Guid("845d48a5-3d35-4d28-81cf-d0819a0660f0")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Optional identifier to sort the set of classification references within the referenced source (either a classification facet of higher level, or the classification system itself).  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 2)
	@Guid("5fcf5d22-605e-4ade-97d7-a582739f6d22")
	@JacksonXmlProperty(isAttribute=false, localName = "sort")
	private IfcIdentifier sort;

	@Description("The classification reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatingClassification", Range = "IfcRelAssociatesClassification")
	@Guid("3d62bf91-0b17-40a0-80f8-79ba693f2372")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesClassification")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "classificationRefForObjects")*/
	@JsonIgnore
	private Set<IfcRelAssociatesClassification> classificationRefForObjects;

	@Description("The parent classification references to which this child classification reference applies. It can either be the final classification item leaf node, or an intermediate classification item.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "referencedSource", Range = "IfcClassificationReference")
	@Guid("cd72476e-c741-4de9-8ab5-603aacea15d6")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcClassificationReference")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasReferences")
	private Set<IfcClassificationReference> hasReferences;


	public IfcClassificationReference()
	{
	}

	public IfcClassificationReferenceSelect getReferencedSource() {
		return this.referencedSource;
	}

	public void setReferencedSource(IfcClassificationReferenceSelect referencedSource) {
		this.referencedSource = referencedSource;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcIdentifier getSort() {
		return this.sort;
	}

	public void setSort(IfcIdentifier sort) {
		this.sort = sort;
	}

	public Set<IfcRelAssociatesClassification> getClassificationRefForObjects() {
		return this.classificationRefForObjects;
	}

	public Set<IfcClassificationReference> getHasReferences() {
		return this.hasReferences;
	}


}

