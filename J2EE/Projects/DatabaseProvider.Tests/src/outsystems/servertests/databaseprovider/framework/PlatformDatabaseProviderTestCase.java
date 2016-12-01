/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.servertests.databaseprovider.framework;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.configurationservice.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.configurationservice.IRuntimeDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.platform.IPlatformDatabaseProvider;


public class PlatformDatabaseProviderTestCase extends BaseDatabaseProviderTest.BaseDatabaseProviderTestCase<IPlatformDatabaseProvider, IPlatformDatabaseServices> {
    public static final TypeInformation<PlatformDatabaseProviderTestCase> TypeInfo = TypeInformation.get(PlatformDatabaseProviderTestCase.class);
    
    public void initializeServices(IPlatformDatabaseProvider provider, IRuntimeDatabaseConfiguration runtimeConfiguration, IRuntimeDatabaseConfiguration bootstrapConfiguration, boolean runWithBootstrapServices) {
        
        setRuntimeServices( provider.getPlatformDatabaseServices(runtimeConfiguration) );
        setBootstrapServices( provider.getPlatformDatabaseServices(bootstrapConfiguration) );
        setRunWithBootstrapServices( runWithBootstrapServices );
    }
    public PlatformDatabaseProviderTestCase() {
        super(TypeInformation.get(IPlatformDatabaseProvider.class), TypeInformation.get(IPlatformDatabaseServices.class));
    }
}