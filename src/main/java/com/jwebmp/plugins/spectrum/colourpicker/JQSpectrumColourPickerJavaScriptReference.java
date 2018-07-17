/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.spectrum.colourpicker;

import com.jwebmp.base.references.JavascriptReference;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
class JQSpectrumColourPickerJavaScriptReference
		extends JavascriptReference
{

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public JQSpectrumColourPickerJavaScriptReference()
	{
		super("JWColourPickerJS", 1.113, "bower_components/spectrum/spectrum.js", "bower_components/spectrum/spectrum.js");
	}
}