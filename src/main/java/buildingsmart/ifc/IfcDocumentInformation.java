// This file was automatically generated from IFCDOC at www.buildingsmart-tech.org.
// IFC content is copyright (C) 1996-2013 BuildingSMART International Ltd.

package buildingsmart.ifc
{
	public class IfcDocumentInformation extends IfcBase
	{
		private string DocumentId;
		private string Name;
		private string Description;
		private IfcDocumentReference[] DocumentReferences;
		private string Purpose;
		private string IntendedUse;
		private string Scope;
		private string Revision;
		private IfcActorSelect DocumentOwner;
		private IfcActorSelect[] Editors;
		private IfcDateAndTime CreationTime;
		private IfcDateAndTime LastRevisionTime;
		private IfcDocumentElectronicFormat ElectronicFormat;
		private IfcCalendarDate ValidFrom;
		private IfcCalendarDate ValidUntil;
		private IfcDocumentConfidentialityEnum Confidentiality;
		private IfcDocumentStatusEnum Status;
		private IfcDocumentInformationRelationship[] IsPointedTo;
		private IfcDocumentInformationRelationship[] IsPointer;
	}
}
