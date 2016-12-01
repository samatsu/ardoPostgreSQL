/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.configurationservice.metaconfiguration;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.configurationservice.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.configurationservice.AdvancedConfiguration;
import outsystems.hubedition.extensibility.data.configurationservice.IIntegrationDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.configurationservice.ParameterRegion;



public class AdvancedConnectionStringParam implements IUserDefinedParameter {
    public static final TypeInformation<AdvancedConnectionStringParam> TypeInfo = TypeInformation.get(AdvancedConnectionStringParam.class);
    
    private IIntegrationDatabaseConfiguration configuration;
    
    public AdvancedConnectionStringParam(IIntegrationDatabaseConfiguration configuration){
        this.configuration = configuration;
    }
    
    public final boolean isVisible()
    {
        return true;
    }
    
    public final String getLabel()
    {
        return configuration.getAdvancedConfiguration().getAdvancedConnectionStringFieldLabel();
    }
    
    public final String getExample()
    {
        return configuration.getAdvancedConfiguration().getAdvancedConnectionStringFieldHelp();
    }
    
    public final boolean isMandatory()
    {
        return true;
    }
    
    public final int getOrder()
    {
        return 1;
    }
    
    public final EnumSet<ParameterRegion> getRegion()
    {
        return EnumSet.of(ParameterRegion.Advanced);
    }
    
    public final boolean isPassword()
    {
        return false;
    }
    
    
    public final Class<?> getType()
    {
        return String.class;
    }
    
    public final String getName()
    {
        return "AdvancedConnectionStringField";
    }
    
    public final void set(String value) {
        configuration.getAdvancedConfiguration().setAdvancedConnectionStringField( value );
    }
    
    public final String get() {
        return configuration.getAdvancedConfiguration().getAdvancedConnectionStringField();
    }
    
    public final boolean isReadOnly()
    {
        return false;
    }
    
    public final boolean isMultiline()
    {
        return true;
    }
    
    public final String getAutoCompleteExpression()
    {
        return null;
    }
    
    
    public final boolean isEncrypt()
    {
        return false;
    }
    
    public final boolean isPersist()
    {
        return true;
    }
}