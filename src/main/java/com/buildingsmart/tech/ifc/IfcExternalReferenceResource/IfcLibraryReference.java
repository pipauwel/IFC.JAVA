// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("739c22f8-9791-4f05-b25d-70ddc3ed443f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Additional description provided for the library reference.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("c36f2056-db4c-4e1e-b01c-a5a7d5794c09")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "Language")
	@Description("The language in which a library reference is expressed.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("48d70f10-19be-4364-a36d-d32efe9e72de")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLanguageId language;

	@JacksonXmlProperty(isAttribute=false, localName = "ReferencedLibrary")
	@Description("The library information that is being referenced.")
	@Guid("0ddfeb57-9edd-46aa-8369-dff55be36456")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryInformation referencedLibrary;

	@Description("The library reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New inverse attribute.  </blockquote>")
	@Guid("369a8e6b-21f9-42f6-82fc-0feec6c5a0fe")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary> libraryRefForObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary>();


	public IfcLibraryReference()
	{
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLanguageId getLanguage() {
		return this.language;
	}

	public void setLanguage(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLanguageId language) {
		this.language = language;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryInformation getReferencedLibrary() {
		return this.referencedLibrary;
	}

	public void setReferencedLibrary(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryInformation referencedLibrary) {
		this.referencedLibrary = referencedLibrary;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary> getLibraryRefForObjects() {
		return this.libraryRefForObjects;
	}


}

