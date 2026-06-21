using System.ComponentModel.DataAnnotations;
using System.Diagnostics.Contracts;

namespace T1_Jara_Fabio.Models
{
    public class Distribuidor
    {
        [Key]

        public int Id { get; set; }

        public string NombreDistribuidor { get; set; }
        public string RazonSocial { get; set; }
        public string telefono { get; set; }
        public string AnioInicioOperacion { get; set; }
        public string contacto { get; set; }

    }
}
