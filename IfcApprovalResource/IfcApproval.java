// This file was automatically generated from IFCDOC at www.buildingsmart-tech.org.
// IFC content is copyright (C) 1996-2013 BuildingSMART International Ltd.

package buildingsmart.ifc
{
	public class IfcApproval extends IfcBase
	{
		private string Identifier;
		private string Name;
		private string Description;
		private string TimeOfApproval;
		private string Status;
		private string Level;
		private string Qualifier;
		private IfcActorSelect RequestingApproval;
		private IfcActorSelect GivingApproval;
		private IfcExternalReferenceRelationship[] HasExternalReferences;
		private IfcRelAssociatesApproval[] ApprovedObjects;
		private IfcResourceApprovalRelationship[] ApprovedResources;
		private IfcApprovalRelationship[] IsRelatedWith;
		private IfcApprovalRelationship[] Relates;
	}
}
