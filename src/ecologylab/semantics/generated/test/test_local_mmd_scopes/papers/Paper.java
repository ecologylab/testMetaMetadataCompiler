package ecologylab.semantics.generated.test.test_local_mmd_scopes.papers;

import java.util.List;

import ecologylab.semantics.generated.test.test_local_mmd_scopes.articles.Article;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  Paper.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Paper extends Article
{
	/** 
	 */ 
	@simpl_scalar	@simpl_tag("abstract")	@simpl_hints(Hint.XML_LEAF)	
	private ecologylab.semantics.metadata.scalar.MetadataString abstractField;

	/** 
	 * Papers cited by this paper.
	 */ 
	@simpl_collection("reference")	@mm_name("references")
	private List<Paper> references;

	/** 
	 * Papers that cite this paper.
	 */ 
	@simpl_collection("citation")	@mm_name("citations")
	private List<Paper> citations;

	/** 
	 */ 
	@simpl_collection("keyword")	@mm_name("keywords")
	private List<MetadataString> keywords;

	/** 
	 */ 
	@simpl_collection("tag")	@mm_name("tags")
	private List<Tag> tags;

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
		return this.abstractField == null ? null : abstractField().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(ecologylab.semantics.metadata.scalar.MetadataString abstractField)
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

	public List<Tag> getTags()
	{
		return tags;
	}

	public void setTags(List<Tag> tags)
	{
		this.tags = tags;
	}
}
