/*
    Azrael, a serializer for Java objects
    Copyright (C) 2016-2019 Sylvain Hallé
    Laboratoire d'informatique formelle
    Université du Québec à Chicoutimi, Canada
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.
    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ca.uqac.lif.azrael;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public interface ObjectReader
{
	public Object read(Object t) throws ReadException;
	
	public Boolean readBoolean(Object o) throws ReadException;
	 
	public Number readNumber(Object o) throws ReadException;
	
	public String readString(Object o) throws ReadException;
	
	public Map<String,?> readMap(Object o) throws ReadException;
	
	public List<?> readList(Object o) throws ReadException;
	
	public Queue<?> readQueue(Object o) throws ReadException;
	
	public Set<?> readSet(Object o) throws ReadException;
	
}