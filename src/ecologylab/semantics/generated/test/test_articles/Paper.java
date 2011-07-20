package ecologylab.semantics.generated.test.test_articles;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.test.test_articles.Paper;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_articles.MmdInlineTagInTagsInPaper;
import ecologylab.semantics.generated.test.test_articles.Article;

/**
*  Paper.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/19/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Paper extends Article
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("abstract")	@simpl_hints(Hint.XML_LEAF)	private MetadataString abstractField;

	/** 
	 * Papers cited by this paper.
	 */ 
	@simpl_collection("reference") @mm_name("references")	private List<Paper> references;

	/** 
	 * Papers that cite this paper.
	 */ 
	@simpl_collection("citation") @mm_name("citations")	private List<Paper> citations;

	/** 
	 */ 
	@simpl_collection("keyword") @mm_name("keywords")	private List<MetadataString> keywords;

	/** 
	 */ 
	@simpl_collection("tag") @mm_name("tags")	private List<MmdInlineTagInTagsInPaper> tags;

	public Paper()
	{ }

	public Paper(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField().getValue();
	}

	public MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public List<Paper> getReferences()
	{
		return references;
	}

	public void setReferences(List<Paper> references)
	{
		this.references = references;
	}

	public List<Paper> getCitations()
	{
		return citations;
	}

	public void setCitations(List<Paper> citations)
	{
		this.citations = citations;
	}

	public List<MetadataString> getKeywords()
	{
		return keywords;
	}

	public void setKeywords(List<MetadataString> keywords)
	{
		this.keywords = keywords;
	}

	public List<MmdInlineTagInTagsInPaper> getTags()
	{
		return tags;
	}

	public void setTags(List<MmdInlineTagInTagsInPaper> tags)
	{
		this.tags = tags;
	}
}