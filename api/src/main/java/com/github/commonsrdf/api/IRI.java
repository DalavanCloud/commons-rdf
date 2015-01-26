/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.commonsrdf.api;

/**
 * An <a href= "http://www.w3.org/TR/rdf11-concepts/#dfn-iri" >RDF-1.1 IRI</a>,
 * as defined by <a href= "http://www.w3.org/TR/rdf11-concepts/" >RDF-1.1
 * Concepts and Abstract Syntax</a>, a W3C Recommendation published on 25
 * February 2014.<br>
 */
public interface IRI extends BlankNodeOrIRI {

	/**
	 * Return the IRI encoded as a native Unicode String.<br>
	 * 
	 * The returned string must not include URL-encoding to escape non-ASCII
	 * characters.
	 * 
	 * @return The IRI encoded as a native Unicode String.
	 */
	String getIRIString();

	/**
	 * Check it this IRI is equal to another IRI. <blockquote> <a
	 * href="http://www.w3.org/TR/rdf11-concepts/#section-IRIs">IRI
	 * equality</a>: Two IRIs are equal if and only if they are equivalent under
	 * Simple String Comparison according to section 5.1 of [RFC3987]. Further
	 * normalization MUST NOT be performed when comparing IRIs for equality.
	 * </blockquote>
	 * <p>
	 * Two IRIs are equal are in the same local scope and their
	 * {@link #getIRIString()} are equal.
	 * </p>
	 * <p>
	 * Implementations MAY check the local scope for IRI comparison.
	 * </p>
	 * <p>
	 * Implementations MUST also override {@link #hashCode()} so that two equal
	 * IRIs produce the same hash code.
	 * </p>
	 * 
	 * @see Object#equals(Object)
	 * 
	 * @param other
	 *            Another object
	 * @return true if other is an IRI and is equal to this
	 */
	@Override
	public boolean equals(Object other);

	/**
	 * Calculate a hash code for this IRI.
	 * <p>
	 * This method MUST be implemented when implementing {@link #equals(Object)}
	 * so that two equal IRIs produce the same hash code.
	 * 
	 * @see Object#hashCode()
	 * 
	 * @return a hash code value for this IRI.
	 */
	@Override
	public int hashCode();
}
