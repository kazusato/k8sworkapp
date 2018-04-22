package kazusato.k8sworkapp

import java.net.InetAddress
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hostver")
class HostVersionResource {

    @GET
    fun getHostVersion(): String {
        return String.format("%-20s %-20s %-20s",
                "HOST_VERSION",
                InetAddress.getLocalHost().hostName,
                "v2")
    }

}
