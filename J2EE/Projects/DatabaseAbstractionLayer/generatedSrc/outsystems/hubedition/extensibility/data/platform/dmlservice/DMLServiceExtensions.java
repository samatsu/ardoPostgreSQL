/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.platform.dmlservice;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.databaseobjects.IDatabaseObjectFactory;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLService;
import outsystems.hubedition.extensibility.data.IDatabaseServices;


public class DMLServiceExtensions {
    public static final TypeInformation<DMLServiceExtensions> TypeInfo = TypeInformation.get(DMLServiceExtensions.class);
    /**
	 *	Returns an escaped identifier representing an object (e.g. table or view) that is qualified using  the information provided by the DatabaseConfiguration associated with the outsystems.hubedition.extensibility.data.platform.dmlservice. NOTE: This method uses the createLocalDatabaseInfo for qualification.
	 *	@param	identifiers	IPlatformDMLIdentifiers to use for qualification
	 *	@param	objectName	Name of the database object (e.g. table, view, stored procedure).
	 *	@return	A string representing the escaped and qualified identifier.
	 */
    public static String escapeAndQualifyIdentifierForLocalDatabase(IPlatformDMLIdentifiers identifiers, String objectName) {
        return identifiers.escapeAndQualifyIdentifier(identifiers.getDMLService().getDatabaseServices().getObjectFactory().createLocalDatabaseInfo(), objectName);
    }
}