package com.adamrosenfield.wordswithcrosses.puz;

import java.io.Serializable;
import java.util.Calendar;

import com.adamrosenfield.wordswithcrosses.puz.Playboard.Position;

public class PuzzleMeta implements Serializable {

    private static final long serialVersionUID = -3211472808737203931L;

    public int id;
    public String filename;
    public boolean archived;
	public String author;
	public String title;
	public String source;
	public Calendar date;
	public int percentComplete;
	public String sourceUrl;
	public Position position;
	public boolean across;

	@Override
    public String toString(){
		return new StringBuilder("id: ")
		.append(id)
		.append(" filename: ")
		.append(filename)
		.append(" archived: ")
		.append(archived)
		.append("author: ")
		.append(author)
		.append(" title: ")
		.append(title)
		.append(" source: ")
		.append(source)
		.append(" sourceUrl: ")
		.append(sourceUrl)
		.append(" date: " )
		.append(date)
		.append(" percentCompelete: ")
		.append(percentComplete)
		.append(" position: ")
		.append(position)
		.append(" across: ")
		.append(across)
		.toString();
	}
}