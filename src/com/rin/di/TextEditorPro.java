package com.rin.di;

public class TextEditorPro {
	private SpellChecker spellChecker;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("这是set方法！");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	
	public void editor() {
		spellChecker.checkSpelling();
	}
}
