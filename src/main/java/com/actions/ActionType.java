package com.actions;

import java.io.Serializable;

/**
 * Basic enum to determine what possible map type there is to query against.
 *
 * @author <a href="mailto:mxt4877@rit.edu">Mike Thomsen</a>
 */
public enum ActionType implements Serializable {
	FIELD, METHOD, EXPRESSION, DANGLING_EXPRESSION, LOOP_OR_IF, IDENTIFIER, CLASS, ENUM, RESERVED_METHOD, IMPORT, EXCEPTION;
}
