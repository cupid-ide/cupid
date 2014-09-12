/*
 * tuProlog - Copyright (C) 2001-2007 aliCE team at deis.unibo.it
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package alice.tuprolog;

import java.util.NoSuchElementException;

/**
 * This class represents an iterator of terms from a string.
 *
 * @see Term
 */
class TermIterator implements java.util.Iterator, java.io.Serializable {
	
	private Parser parser;
	private boolean hasNext;
	private Term next;
	private String parserError;
	
	TermIterator(Parser p) {
		parser = p;
		try {
			next = parser.nextTerm(true);
			hasNext = (next != null);
		} catch (InvalidTermException e) {
			parserError = e.getMessage();
			hasNext = false;
		}	
	}
	
	public Object next() {
		if (hasNext) {
			if (next == null)
				try {
					next = parser.nextTerm(true);
					if (next == null)
						throw new NoSuchElementException();
				} catch (InvalidTermException e) {
					throw new NoSuchElementException();
				}
			hasNext = false;
			Term temp = next;
			next = null;
			return temp;
		} else
			if (hasNext()) {
				hasNext = false;
				Term temp = next;
				next = null;
				return temp;
			}
		throw new NoSuchElementException();
	}
	
	public boolean hasNext() {
		if (hasNext)
			return hasNext;
		if (parserError != null)
			return hasNext; // should always be false if parserError is not null
		try {
			next = parser.nextTerm(true);
			if (next != null)
				hasNext = true;
		} catch (InvalidTermException e) {
			parserError = e.getMessage();
			next = null;
			hasNext = false;
		}
		return hasNext;
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns what was wrong in the parser if the {@link TermIterator#hasNext()}
	 * or {@link TermIterator#next()} methods catch an {@link InvalidTermException}.
	 */
	public String getParserError() {
		return parserError;
	}
	
}