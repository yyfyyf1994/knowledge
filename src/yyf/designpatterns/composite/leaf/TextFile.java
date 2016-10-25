package yyf.designpatterns.composite.leaf;

import yyf.designpatterns.composite.comonpent.AbstractFile;

public class TextFile implements AbstractFile {
	private String fileName;

	public TextFile(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void add(AbstractFile f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(AbstractFile f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("  ");
		}
		System.out.println("|" + fileName);
	}

}