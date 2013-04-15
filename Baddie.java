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
public class Baddie{
	
	private int mDamage;
	private int mArmor;
	private String mName;
	
	/** This constructs the baddie object
	 * 
	 * name: Baddie
	 * @param aName the name of the enemy
	 * @param aDamage the damage of the enemy
	 * @param aArmor
	 * 
	 */
	public Baddie(String aName, int aDamage, int aArmor){
		mName = aName;
		mDamage = aDamage;
		mArmor = aArmor;
	}
	
	/** Gets the damage of this enemy
	 *  @return the damage of this enemy
	 */
	public int getDamage(){
		return mDamage;
	}
	
	/** Gets the name of this enemy
	 * 	@return the name of this enemy
	 */
	public String getName(){
		return mName;
	}
	
	/** Gets the armor value of this enemy
	 *  @return the armor value of this enemy
	 */
	public int getArmor(){
		return mArmor;
	}
}
