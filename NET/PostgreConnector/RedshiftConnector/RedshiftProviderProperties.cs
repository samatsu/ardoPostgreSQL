using ardo.DatabaseProvider.PostgreSQL.ExecutionService;
using ardo.DatabaseProvider.Redshift.IntrospectionService;
using OutSystems.HubEdition.Extensibility.Data;
using OutSystems.HubEdition.Extensibility.Data.IntrospectionService;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ardo.DatabaseProvider.Redshift
{
    public class RedshiftProviderProperties: BaseProviderProperties
    {

        public RedshiftProviderProperties(IDatabaseProvider provider) : base(provider) { }

        public override string DisplayName
        {
            get { return "Redshift"; }
        }
        // what on earth is this?
        public override string DatabaseContainerName
        {
            get { return "Schema"; }
        }

        /*
        public override string ParameterTypeName
        {
            get { return "Npgsql.NpgsqlParameter"; }
        }
         */


        public override bool SupportsMultipleActiveResultSets
        {
            get { return false; }
        }

    }
}
