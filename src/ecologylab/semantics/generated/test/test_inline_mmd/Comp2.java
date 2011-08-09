package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.test.test_inline_mmd.Comp;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Comp2.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Comp2 extends Comp
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString snippet;

	public Comp2()
	{ }

	public Comp2(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	snippet()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.snippet;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.snippet = result;
		}
		return result;
	}

	public java.lang.String getSnippet()
	{
		return this.snippet == null ? null : snippet().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSnippetMetadata()
	{
		return snippet;
	}

	public void setSnippet(java.lang.String snippet)
	{
		if (snippet != null)
			this.snippet().setValue(snippet);
	}

	public void setSnippetMetadata(ecologylab.semantics.metadata.scalar.MetadataString snippet)
	{
		this.snippet = snippet;
	}
}