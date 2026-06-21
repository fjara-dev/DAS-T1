using Microsoft.AspNetCore.Mvc;
using T1_Jara_Fabio.Datos;
using T1_Jara_Fabio.Models;

namespace T1_Jara_Fabio.Controllers
{
    public class DistribuidorController : Controller
    {
        private readonly ApplicationDbContext _db;

        public DistribuidorController(ApplicationDbContext db)
        {
            _db = db;
        }
        public IActionResult Index()
        {
            IEnumerable<Distribuidor> lista = _db.Distribuidor;
            return View();
        }
    }
}
