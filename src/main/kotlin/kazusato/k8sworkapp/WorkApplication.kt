package kazusato.k8sworkapp

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("/api")
class WorkApplication : Application() {
}