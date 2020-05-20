// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcExternallyDefinedHatchStyle;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcExternallyDefinedSurfaceStyle;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcExternallyDefinedTextFont;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("89de2ef7-7bc1-4682-ac3b-f058ab404fad")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcClassificationReference.class, name = "IfcClassificationReference"), @JsonSubTypes.Type(value = IfcDocumentReference.class, name = "IfcDocumentReference"), @JsonSubTypes.Type(value = IfcExternallyDefinedHatchStyle.class, name = "IfcExternallyDefinedHatchStyle"), @JsonSubTypes.Type(value = IfcExternallyDefinedSurfaceStyle.class, name = "IfcExternallyDefinedSurfaceStyle"), @JsonSubTypes.Type(value = IfcExternallyDefinedTextFont.class, name = "IfcExternallyDefinedTextFont"), @JsonSubTypes.Type(value = IfcLibraryReference.class, name = "IfcLibraryReference")})
public abstract class IfcExternalReference implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, IfcResourceObjectSelect
{
	@Description("Location, where the external source (classification, document or library) can be accessed by electronic means. The electronic location is provided as an URI, and would normally be given as an URL location string.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcLabel</em> to <em>IfcURIReference</em><br>.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("d4dad48f-1dac-4cbb-99d0-7819c93da6c2")
	@JacksonXmlProperty(isAttribute=false, localName = "location")
	private IfcURIReference location;

	@Description("The <em>Identification</em> provides a unique identifier of the referenced item within the external source (classification, document or library). It may be provided as   <ul>   <li>a key, e.g. a classification notation, like NF2.3</li>   <li>a handle</li>   <li>a uuid or guid</li>  </ul>  It may be human readable (such as a key) or not (such as a handle or uuid) depending on the context of its usage (which has to be determined by local agreement).  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE  Attribute renamed from <em>ItemReference</em> for consistency.<br>  </blockquote>")
	@DataMember(Order = 1)
	@Guid("09ae4612-f2b3-4ae7-af75-4b0061f86545")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("Optional name to further specify the reference. It can provide a human readable identifier (which does not necessarily need to have a counterpart in the internal structure of the document).")
	@DataMember(Order = 2)
	@Guid("7a104ce3-e53d-4544-bffa-c17f3be9adc3")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("Reference to all associations between this external reference and objects within the <em>IfcResourceObjectSelect</em> that are tagged by the external reference.   <blockquote class=\"change-ifc2x4\">   IFC4 CHANGE&nbsp; New inverse attribute added with upward compatibility.<br>  </blockquote>")
	@InverseProperty(InverseProp = "relatingReference", Range = "IfcExternalReferenceRelationship")
	@Guid("52adb1da-05bd-4f8b-bd47-3c140643a153")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "externalReferenceForResources")*/
	private Set<IfcExternalReferenceRelationship> externalReferenceForResources;


	public IfcExternalReference()
	{
	}

	public IfcURIReference getLocation() {
		return this.location;
	}

	public void setLocation(IfcURIReference location) {
		this.location = location;
	}

	public IfcIdentifier getIdentification() {
		return this.identification;
	}

	public void setIdentification(IfcIdentifier identification) {
		this.identification = identification;
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public Set<IfcExternalReferenceRelationship> getExternalReferenceForResources() {
		return this.externalReferenceForResources;
	}


}

