package packageProyecto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cifrar {

    public static String cifrarContrasena(String contrasena) {
        try {
            MessageDigest Mdigest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = Mdigest.digest(contrasena.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al cifrar la contraseña", e);
        }
    }

    public static boolean verificar(String contrasena, String contrasenaCifrada) {
        return cifrarContrasena(contrasena).equals(contrasenaCifrada);
    }
}
