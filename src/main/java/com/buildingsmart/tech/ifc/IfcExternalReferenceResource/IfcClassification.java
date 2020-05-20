// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDate;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesClassification;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Set;

@Guid("86dd2655-910b-4394-9cd1-3478de9e1798")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcClassification extends IfcExternalInformation implements IfcClassificationReferenceSelect, IfcClassificationSelect
{
	@Description("Source (or publisher) for this classification.  <blockquote class=\"note\">NOTE&nbsp; that the source of the classification means the person or organization that was the original author or the person or organization currently acting as the publisher.</blockquote>")
	@DataMember(Order = 0)
	@Guid("9e6953d3-314a-47fc-b390-73bf49075875")
	@JacksonXmlProperty(isAttribute=false, localName = "source")
	private IfcLabel source;

	@Description("The edition or version of the classification system from which the classification notation is derived.  <blockquote class=\"note\">NOTE&nbsp; the version labeling system is specific to the classification system.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The attribute has been changed to be optional.</blockquote>")
	@DataMember(Order = 1)
	@Guid("d1895997-09d2-4095-803d-a71ad237c6de")
	@JacksonXmlProperty(isAttribute=false, localName = "edition")
	private IfcLabel edition;

	@Description("The date on which the edition of the classification used became valid.  <blockquote class=\"note\">NOTE&nbsp; The indication of edition may be sufficient to identify the classification source uniquely but the edition date is provided as an optional attribute to enable more precise identification where required.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The data type has been changed to <em>IfcDate</em>, the date string according to ISO8601.</blockquote>")
	@DataMember(Order = 2)
	@Guid("f59698df-a014-4cac-9b67-5ca649051dfa")
	@JacksonXmlProperty(isAttribute=false, localName = "editionDate")
	private IfcDate editionDate;

	@Description("The name or label by which the classification used is normally known.  <blockquote class=\"note\">NOTE&nbsp; Examples of names include CI/SfB, Masterformat, BSAB, Uniclass, STABU, DIN276, DIN277 etc.</blockquote>")
	@DataMember(Order = 3)
	@Required()
	@Guid("85cb5672-fa71-455e-b1ab-7ab4259f6b9c")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Additional description provided for the classification.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@DataMember(Order = 4)
	@Guid("60678a0a-cb22-4814-a99e-b13fb1a3eb07")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("Resource identifier or locator, provided as URI, URN or URL, of the classification.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 5)
	@Guid("420c7a7d-5921-456f-b645-20a0b62bf121")
	@JacksonXmlProperty(isAttribute=false, localName = "location")
	private IfcURIReference location;

	@Description("The delimiter tokens that are used to mark the boundaries of individual facets (substrings) in a classification reference.  <br><br>  This typically applies then the <em>IfcClassification</em> is used in  conjuction with <em>IfcClassificationReference</em>'s. If only one <em>ReferenceToken</em> is provided, it applies to all boundaries of individual facets, if more than one <em>ReferenceToken</em> are provided, the first token applies to the first boundary, the second token to the second boundary, and the n<super>th</super> token to the n<super>th</super> and any additional boundary.     <blockquote class=\"note\">NOTE&nbsp; Tokens are typically recommended within the classification itself and each token will have a particular role.</blockquote>  <blockquote class=\"example\">  EXAMPLE&nbsp;1 To indicate that the facet delimiter used for DIN277-2 reference key \"2.1\" (\"Office rooms\") is \".\", a single <em>ReferenceToken</em> ['.'] is provided. To indicate that the facet delimiter used for Omniclass Table 13 (space by function) reference key \"13-15 11 34 11\" (\"Office\") are \"-\" and \" \", two <em>ReferenceToken</em>'s ['-', ' '] are provided.   </blockquote>  <blockquote class=\"example\">  EXAMPLE&nbsp;2 The use of <em>ReferenceTokens</em> can also be extended to include masks. The use need to be agreed in view definitions or implementer agreements that stipulates a \"mask syntax\" that should be used.    </blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.</blockquote>")
	@DataMember(Order = 6)
	@Guid("fa9292d9-ac78-4c50-9cca-c5c5171cdbe1")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIdentifier")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "referenceTokens")
	private List<IfcIdentifier> referenceTokens;

	@Description("The classification with which objects are associated.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatingClassification", Range = "IfcRelAssociatesClassification")
	@Guid("4d93c948-effe-49fa-b9d7-d6aaae000629")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesClassification")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "classificationForObjects")*/
	@JsonIgnore
	private Set<IfcRelAssociatesClassification> classificationForObjects;

	@Description("The classification references to which the classification applies. It can either be the final classification notation, or an intermediate classification item.")
	@InverseProperty(InverseProp = "referencedSource", Range = "IfcClassificationReference")
	@Guid("35467369-dd27-41ae-99ba-466f5c1e23ab")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcClassificationReference")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasReferences")
	private Set<IfcClassificationReference> hasReferences;


	public IfcClassification()
	{
	}

	public IfcClassification(IfcLabel name)
	{
		this.name = name;
	}

	public IfcLabel getSource() {
		return this.source;
	}

	public void setSource(IfcLabel source) {
		this.source = source;
	}

	public IfcLabel getEdition() {
		return this.edition;
	}

	public void setEdition(IfcLabel edition) {
		this.edition = edition;
	}

	public IfcDate getEditionDate() {
		return this.editionDate;
	}

	public void setEditionDate(IfcDate editionDate) {
		this.editionDate = editionDate;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcURIReference getLocation() {
		return this.location;
	}

	public void setLocation(IfcURIReference location) {
		this.location = location;
	}

	public List<IfcIdentifier> getReferenceTokens() {
		return this.referenceTokens;
	}

	public Set<IfcRelAssociatesClassification> getClassificationForObjects() {
		return this.classificationForObjects;
	}

	public Set<IfcClassificationReference> getHasReferences() {
		return this.hasReferences;
	}


}

