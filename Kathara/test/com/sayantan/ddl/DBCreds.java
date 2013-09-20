package com.sayantan.ddl;

/**
 * @author zayantan
 * To be used by all util and config classes that define db connectivity
 * These are MySQL credentials
 */
public enum DBCreds {
	LOGIN_ID {
		public String toString(){
			return "root";
		}
	},
	PASSWD {
		public String toString(){
			return "*****";
		}
	};
}
