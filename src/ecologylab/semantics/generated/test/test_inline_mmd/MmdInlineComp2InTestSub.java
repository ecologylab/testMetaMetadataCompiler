package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_inline_mmd.MmdInlineCompInTestBase;

/**
*  MmdInlineComp2InTestSub.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineComp2InTestSub extends MmdInlineCompInTestBase
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString snippet;

	public MmdInlineComp2InTestSub()
	{ }

	public MmdInlineComp2InTestSub(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	snippet()
	{
		MetadataString	result = this.snippet;
		if (result == null)
		{
			result = new MetadataString();
			this.snippet = result;
		}
		return result;
	}

	public String getSnippet()
	{
		return this.snippet().getValue();
	}

	public MetadataString getSnippetMetadata()
	{
		return snippet;
	}

	public void setSnippet(String snippet)
	{
		this.snippet().setValue(snippet);
	}

	public void setSnippetMetadata(MetadataString snippet)
	{
		this.snippet = snippet;
	}
}
