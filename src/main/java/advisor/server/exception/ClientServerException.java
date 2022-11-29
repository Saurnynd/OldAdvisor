/* Class name: ClientServerException
 * Date: 15.12.21
 * Version 1.0
 * Author: makhlov
 */
package advisor.server.exception;

/**
 * Interaction exceptions between music-advisor and the Spotify API
 */
public class ClientServerException extends Exception {
    public ClientServerException(String message) {
        super(message);
    }

}
