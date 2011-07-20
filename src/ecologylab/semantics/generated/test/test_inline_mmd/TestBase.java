package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_inline_mmd.MmdInlineItemInCollInTestBase;
import ecologylab.semantics.generated.test.test_inline_mmd.MmdInlineCompInTestBase;
import ecologylab.semantics.metadata.Metadata;

/**
*  TestBase.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/19/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TestBase extends Metadata
{
	/** 
	 * whatever scalar here ...
	 */ 
	@simpl_scalar	private MetadataString aScalar;

	/** 
	 */ 
	@simpl_composite @mm_name("comp")	private MmdInlineCompInTestBase comp;

	/** 
	 */ 
	@simpl_collection("item") @mm_name("coll")	private List<MmdInlineItemInCollInTestBase> coll;

	public TestBase()
	{ }

	public TestBase(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	aScalar()
	{
		MetadataString	result = this.aScalar;
		if (result == null)
		{
			result = new MetadataString();
			this.aScalar = result;
		}
		return result;
	}

	public String getAScalar()
	{
		return this.aScalar().getValue();
	}

	public MetadataString getAScalarMetadata()
	{
		return aScalar;
	}

	public void setAScalar(String aScalar)
	{
		this.aScalar().setValue(aScalar);
	}

	public void setAScalarMetadata(MetadataString aScalar)
	{
		this.aScalar = aScalar;
	}

	public MmdInlineCompInTestBase getComp()
	{
		return comp;
	}

	public void setComp(MmdInlineCompInTestBase comp)
	{
		this.comp = comp;
	}

	public List<MmdInlineItemInCollInTestBase> getColl()
	{
		return coll;
	}

	public void setColl(List<MmdInlineItemInCollInTestBase> coll)
	{
		this.coll = coll;
	}
}
