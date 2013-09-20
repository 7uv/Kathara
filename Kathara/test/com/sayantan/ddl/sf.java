/**
 * 
 */
package com.sayantan.ddl;

/**
 * @author zayantan
 * 
 */
public enum sf {
	SUCCESS {
		public String toString() {
			return "success";
		}
	},
	FAIL {
		public String toString() {
			return "failure";
		}
	},
	INPUT {
		public String toString() {
			return "input";
		}
	};
}
