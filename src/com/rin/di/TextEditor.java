package com.rin.di;

public class TextEditor {
	private SpellChecker spellChecker;
	private Writer writer;
	
	public TextEditor(SpellChecker spellChecker, Writer writer) {
			System.out.println("これはtexteditorの構造方法です！");
			this.spellChecker = spellChecker;
			this.writer = writer;
	}
	
	public void editor() {
		spellChecker.checkSpelling();
		writer.wirte();
	}
}
