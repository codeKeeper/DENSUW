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
 
public interface DENSUW_ITEM{
	
	public class DENSUW_PUZZLEITEM implements DENSUW_ITEM{
		private DENSUW_SOLUTION mSolution;
		private String mDefinition;
		
		public DENSUW_PUZZLEITEM(DENSUW_SOLUTION aSolution, String aDef){
			mSolution = aSolution;
			mDefinition = aDef;
		}
		
		public boolean isCorrect(String aGuess){
			return mSolution.isCorrect(aGuess);
		}

		public String printDef(){
			System.out.println(mDefinition);
		}
	}

	public class DENSUW_WEAPON implements DENSUW_ITEM{
		//To implement
	}
}
