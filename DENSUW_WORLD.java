/*
 * DENSUW_ITEM.java
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
 * 
 */
 
//This is a graph
public class DENSUW_WORLD {
	private LinkedList<DENSUW_ROOM> mVertices;
	private LinkedList<DENSUW_HALL> mEdges;
	
	public DENSUW_WORLD(){
		mVertices = new LinkedList<DENSUW_ROOM>();
		mEdges = new LinkedList<DENSUW_HALL>();
	}
	
	public int numRooms(){
		return mVertices.size();
	}
	
	public int numHalls(){
		return mEdges.size();
	}
	
	public Iterable<DENSUW_ROOM> rooms(){
		return mVertices;
	}
	
	public Iterable<DENSUW_HALL> halls(){
		return mEdges;
	}
	
	public Iterable<DENSUW_HALL> incidentHalls(DENSUW_ROOM aRoom){
		return aRoom.mEdges;
	}
	
	public DENSUW_ROOM[] endRooms(DENSUW_HALL aHall){
		return aHall.mEndpoints;
	}
	
	public DENSUW_ROOM opposite(DENSUW_ROOM aRoom, DENSUW_HALL aHall){
		for (DENSUW_HALL lCur : incidentHalls(aRoom)){
			if (lCur == aHall){
				if (aHall.mEndpoints[0] == aRoom){
					return aHall.mEndpoints[1];
				} else {
					return aHall.mEndpoints[0];
				}
			}
		}
		return null;
	}
	
	public boolean areAdjacent(DENSUW_ROOM aRoom, DENSUW_ROOM aSecond){
		
	}
}

