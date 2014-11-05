/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data;

import outsystems.hubedition.extensibility.data.configurationservice.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.extensibility.data.dmlservice.*;
import outsystems.hubedition.extensibility.data.executionservice.*;
import outsystems.hubedition.extensibility.data.introspectionservice.*;
import outsystems.hubedition.extensibility.data.transactionservice.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.configurationservice.IRuntimeDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.databaseobjects.IDatabaseObjectFactory;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLService;
import outsystems.hubedition.extensibility.data.executionservice.IExecutionService;
import outsystems.hubedition.extensibility.data.introspectionservice.IIntrospectionService;
import outsystems.hubedition.extensibility.data.transactionservice.ITransactionService;



/**
 *	Represents the set of services that needs to be implemented to add support for a new database.
 */
public interface IDatabaseServices
{
    
    /**
	 *	Gets the IIntegrationDatabaseConfigurationobject associated with a database. It encapsulates the necessary information to connect to a database instance.
	 */
    public IRuntimeDatabaseConfiguration getDatabaseConfiguration();
    
    /**
	 *	Returns a factory capable of creating database information objects from qualified names. If required, this object might access the database.
	 */
    public IDatabaseObjectFactory getObjectFactory();
    
    /**
	 *	Gets the ITransactionServiceobject associated with a database. Represents a specific database connection or transaction.
	 */
    public ITransactionService getTransactionService();
    
    /**
	 *	Gets the IExecutionService associated with the database. Represents an execution context to run SQL commands on a database.
	 */
    public IExecutionService getExecutionService();
    
    /**
	 *	Gets the IDMLServiceobject associated with the database. Represents a service that generates SQL statements.
	 */
    public IDMLService getDMLService();
    
    /**
	 *	Gets the IIntrospectionServiceobject associated with the database. Represents a service that provides information about meta-data of the database.
	 */
    public IIntrospectionService getIntrospectionService();
}