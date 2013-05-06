/*
 * DENSUW_ROOM.java
 * 
 * Copyright 2013 Robin McNally
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 */ 

import java.util.LinkedList;

public class DENSUW_ROOM{
	
	protected LinkedList<DENSUW_ITEM> mItems = new LinkedList<DENSUW_ITEM>();
	protected LinkedList<DENSUW_SOLUTION> mSolutions = new LinkedList<DENSUW_SOLUTION>(); 
	protected LinkedList<DENSUW_HALL> mEdges = new LinkedList<DENSUW_HALL>();
	private Baddie mBaddie;
	private String mShortDesc;
	private String mFullDesc;
	private String mName;
	
	public DENSUW_Room(){
		
	}
	
	public String fullDesc(){
		return mFullDesc;
	}
	
	public String shortDesc(){
		return mShortDesc;
	}
	
	public Item[] getItems(){
		return mItems;
	}
	
	public Baddie getBaddie(){
		return mBaddie;
	}
	
	public String getName(){
		return mName;
	}
	
}
