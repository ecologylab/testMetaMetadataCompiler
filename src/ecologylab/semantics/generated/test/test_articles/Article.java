package ecologylab.semantics.generated.test.test_articles;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_articles.MmdInlineAuthorInAuthorsInArticle;
import ecologylab.semantics.generated.test.test_articles.MmdInlineSourceInArticle;

/**
*  Article.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
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
	@simpl_scalar	@simpl_hints(Hint.XML_LEAF)	private MetadataString title;

	/** 
	 */ 
	@simpl_collection("author") @mm_name("authors")	private ArrayList<MmdInlineAuthorInAuthorsInArticle> authors;

	/** 
	 * Metadata related to where an article is published.
	 */ 
	@simpl_composite @mm_name("source")	private MmdInlineSourceInArticle source;

	/** 
	 */ 
	@simpl_scalar	private MetadataString pages;

	public Article()
	{ }

	public Article(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title().getValue();
	}

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}


	public ArrayList<MmdInlineAuthorInAuthorsInArticle> getAuthors()
	{
		return authors;
	}

	public void setAuthors(ArrayList<MmdInlineAuthorInAuthorsInArticle> authors)
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
	public MetadataString	pages()
	{
		MetadataString	result = this.pages;
		if (result == null)
		{
			result = new MetadataString();
			this.pages = result;
		}
		return result;
	}

	public String getPages()
	{
		return this.pages().getValue();
	}

	public void setPages(String pages)
	{
		this.pages().setValue(pages);
	}

}
