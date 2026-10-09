package registry;

import prototype.Personaje;
import java.util.HashMap;
import java.util.Map;

public class RegistroPrototipos {
    private Map<String, Personaje> prototipos = new HashMap<>();

    public void registrarPrototipo(String clave, Personaje personaje) {
        prototipos.put(clave, personaje);
    }

    public Personaje obtenerCopia(String clave) {
        Personaje prototipo = prototipos.get(clave);
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}