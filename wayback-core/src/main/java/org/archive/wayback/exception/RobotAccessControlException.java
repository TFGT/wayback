/* RobotAccessControlException
 *
 * $Id$:
 *
 * Created on Mar 25, 2010.
 *
 * Copyright (C) 2006 Internet Archive.
 *
 * This file is part of Wayback.
 *
 * Wayback is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * any later version.
 *
 * Wayback is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser Public License
 * along with Wayback; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.archive.wayback.exception;

/**
 * @author brad
 *
 */
public class RobotAccessControlException extends AccessControlException {
	protected static final String ID = "accessRobots";

	/**
	 * @param message
	 */
	public RobotAccessControlException(String message) {
		super("Blocked By Robots",message);
		id = ID;
	}
}