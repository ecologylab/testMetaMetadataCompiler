package ecologylab.semantics.generated.test.test_articles;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_articles.MmdInlineAuthorInAuthorsInArticle;
import ecologylab.semantics.generated.test.test_articles.MmdInlineSourceInArticle;

/**
*  Article.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Article extends Document
{
	/** 
	 * The Title of the article.
	 */ 
	@simpl_scalar	@simpl_hints(Hint.XML_LEAF)	private ecologylab.semantics.metadata.scalar.MetadataString title;

	/** 
	 */ 
	@simpl_collection("author") @mm_name("authors")	private List<MmdInlineAuthorInAuthorsInArticle> authors;

	/** 
	 * Metadata related to where an article is published.
	 */ 
	@simpl_composite @mm_name("source")	private MmdInlineSourceInArticle source;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString pages;

	public Article()
	{ }

	public Article(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	title()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.title;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.title = result;
		}
		return result;
	}

	public java.lang.String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(java.lang.String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString title)
	{
		this.title = title;
	}

	public List<MmdInlineAuthorInAuthorsInArticle> getAuthors()
	{
		return authors;
	}

	public void setAuthors(List<MmdInlineAuthorInAuthorsInArticle> authors)
	{
		this.authors = authors;
	}

	public MmdInlineSourceInArticle getSource()
	{
		return source;
	}

	public void setSource(MmdInlineSourceInArticle source)
	{
		this.source = source;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	pages()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.pages;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.pages = result;
		}
		return result;
	}

	public java.lang.String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(java.lang.String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}
}
