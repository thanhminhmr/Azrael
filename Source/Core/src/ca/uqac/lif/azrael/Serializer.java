/*
    A serializer for Java objects
    Copyright (C) 2016 Sylvain Hallé
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

public interface Serializer<T>
{
	public T serialize(Object o) throws SerializerException;
	
	public T serializeAs(Object o, Class<?> clazz) throws SerializerException;
	
	public Object deserializeAs(T e, Class<?> clazz) throws SerializerException;
	
	public void addClassLoader(ClassLoader cl);
	
	/**
	 * Attempts to return the class of given name, by going through all
	 * the class loaders until it is found.
	 * @param name The name of the class
	 * @return The class if found, null if no class loader could locate it
	 * @throws ClassNotFoundException If class cannot be found
	 */
	public Class<?> findClass(String name) throws ClassNotFoundException;
}
