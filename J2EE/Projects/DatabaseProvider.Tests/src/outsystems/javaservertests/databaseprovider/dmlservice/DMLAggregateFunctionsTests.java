/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.javaservertests.databaseprovider.dmlservice;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import outsystems.servertests.databaseprovider.framework.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLAggregateFunctions;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLService;
import outsystems.hubedition.extensibility.data.IDatabaseServices;
import outsystems.junit.framework.DashboardTestFixture;
import outsystems.junit.framework.IterativeTestCase;
import outsystems.junit.framework.TestDetails;
import outsystems.servertests.databaseprovider.framework.BaseDatabaseProviderTest;
import outsystems.servertests.databaseprovider.framework.DashboardTest;
import outsystems.servertests.databaseprovider.framework.DatabaseProviderTestCase;



@org.junit.runner.RunWith(outsystems.junit.logic.DashboardTestRunner.class)
@DashboardTestFixture(testKind=DashboardTest.DashboardTestKind)
public class DMLAggregateFunctionsTests extends DMLTest {
    public static final TypeInformation<DMLAggregateFunctionsTests> TypeInfo = TypeInformation.get(DMLAggregateFunctionsTests.class);
    
    private static final String SQL_FORMAT = "SELECT {0} FROM PERSON{1}";
    private static final String ERROR_MESSAGE_FORMAT = "Error executing function {0} with SQL: {1}";
    
    private static <T> void assertValues(final TypeInformation<T> methodTypeArg_T, IDatabaseServices services, String sqlFunctionFragment, T expectedValue) throws Exception {
        SQLExecutor sqlExecutor = new SQLExecutor(services);
        String sql = StringUtils.format(SQL_FORMAT, new Object[] {sqlFunctionFragment, getMachineName()});
        T result = sqlExecutor.executeScalar(sql).<T>runtimeValue(methodTypeArg_T);
        assertEqual(expectedValue, result, StringUtils.format(ERROR_MESSAGE_FORMAT, new Object[] {sqlFunctionFragment, sql}));
    }
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Avg function is correct. Null values should be ignored.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testAvg(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<BigDecimal>assertValues(TypeInformation.BigDecimal, databaseServices, databaseServices.getDMLService().getAggregateFunctions().avg("AGE"), new BigDecimal("25.5"));
        DMLAggregateFunctionsTests.<BigDecimal>assertValues(TypeInformation.BigDecimal, databaseServices, databaseServices.getDMLService().getAggregateFunctions().avg("WEIGHT"), new BigDecimal("90.7"));
    }
    
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Count (no parameters) function is correct.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testCountAsterisk(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count(), 3);
    }
    
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Count function is correct. Null values should be ignored.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testCount(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("PERSONID"), 3);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("NAME"), 3);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("AGE"), 2);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("WEIGHT"), 2);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("DEAD"), 1);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().count("LASTLOGIN"), 2);
    }
    
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Max function is correct. Null values should be ignored.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testMax(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().max("PERSONID"), 3);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().max("AGE"), 30);
        DMLAggregateFunctionsTests.<BigDecimal>assertValues(TypeInformation.BigDecimal, databaseServices, databaseServices.getDMLService().getAggregateFunctions().max("WEIGHT"), new BigDecimal("100.9"));
        DMLAggregateFunctionsTests.<DateTime>assertValues(TypeInformation.get(DateTime.class), databaseServices, databaseServices.getDMLService().getAggregateFunctions().max("LASTLOGIN"), new DateTime(2014, 3, 14, 10, 0, 36));
    }
    
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Min function is correct. Null values should be ignored.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testMin(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().min("PERSONID"), 1);
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().min("AGE"), 21);
        DMLAggregateFunctionsTests.<BigDecimal>assertValues(TypeInformation.BigDecimal, databaseServices, databaseServices.getDMLService().getAggregateFunctions().min("WEIGHT"), new BigDecimal("80.5"));
        DMLAggregateFunctionsTests.<DateTime>assertValues(TypeInformation.get(DateTime.class), databaseServices, databaseServices.getDMLService().getAggregateFunctions().min("LASTLOGIN"), new DateTime(2014, 3, 13, 14, 50, 23));
    }
    
    
    @IterativeTestCase(iteratorType=DMLTestsConfiguration.class)
    @TestDetails(Description="Validates that the behavior of the SQL fragment produced by the Sum function is correct. Null values should be ignored.", TestIssue="679313", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testSum(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        DMLAggregateFunctionsTests.<Integer>assertValues(TypeInformation.Integer, databaseServices, databaseServices.getDMLService().getAggregateFunctions().sum("AGE"), 51);
        DMLAggregateFunctionsTests.<BigDecimal>assertValues(TypeInformation.BigDecimal, databaseServices, databaseServices.getDMLService().getAggregateFunctions().sum("WEIGHT"), new BigDecimal("181.4"));
    }
    
}