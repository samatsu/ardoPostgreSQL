/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.transactionservice;

import java.sql.Connection;
import java.sql.SQLException;

import outsystems.hubedition.databaseabstractionlayer.adoadapters.ConnectionUtils;
import outsystems.runtimeservices.db.jdbcpool.JDBCPool;

public class ConnectionPoolBridge {
	private String connectionFactoryClassName;
	
	public ConnectionPoolBridge(String connectionFactoryClassName) {
		this.connectionFactoryClassName = connectionFactoryClassName;
	}
	private volatile JDBCPool pool;	
	
	public Connection getConnection(String connectionString) throws SQLException {
		return getConnection(connectionString, "");
	}

	public Connection getConnection(String connectionString, String onsConfig) throws SQLException {
	    if (pool == null) {
            synchronized (this) {
                if (pool == null) {
                    pool = JDBCPool.getInstance(ConnectionUtils.debugConnections());
                }
            }
        }
	    
	    Connection conn = pool.getConnection(connectionString, onsConfig, connectionFactoryClassName);
	    
	    /* NOTE: We want to start as auto-commit because, when we don't use transactions, we want to have auto-commit behavior...
         * When we start a transaction we set the auto-commit to false... 
         * See the constructor of ADOTransaction. 
         */
	    conn.setAutoCommit(true);	    
	    ConnectionUtils.logOpenConnection(conn);
        return conn;
	}

	public void invalidateConnectionInPool(Connection conn) {
        pool.invalidateConnectionInPool(conn);
    }
}