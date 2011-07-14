package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.test.test_inline_mmd.MmdInlineNestedItemInMmdInlineItemInCollInTestBase;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineNewNestedItemInMmdInlineColl2InColl2InTestSub.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineNewNestedItemInMmdInlineColl2InColl2InTestSub extends MmdInlineNestedItemInMmdInlineItemInCollInTestBase
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString descr;

	public MmdInlineNewNestedItemInMmdInlineColl2InColl2InTestSub()
	{ }

	public MmdInlineNewNestedItemInMmdInlineColl2InColl2InTestSub(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	descr()
	{
		MetadataString	result = this.descr;
		if (result == null)
		{
			result = new MetadataString();
			this.descr = result;
		}
		return result;
	}

	public String getDescr()
	{
		return this.descr().getValue();
	}

	public void setDescr(String descr)
	{
		this.descr().setValue(descr);
	}

}
