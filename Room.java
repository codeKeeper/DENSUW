/*
 * DENSUW_Room.java
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
public interface Room{
	
	//Gets the full description of the room
	public String fullDesc();
	
	//Gets the short description of the room
	public String shortDesc();
	
	//Gets the Item array related with this room
	public Item[] getItems();
	
	//Gets the Baddie in this room if there is one
	public Baddie getBaddie();
	
	//Gets the name of this room
	public String getName();
}
