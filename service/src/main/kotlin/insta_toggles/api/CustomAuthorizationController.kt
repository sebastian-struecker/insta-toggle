package insta_toggles.api

import io.quarkus.security.spi.runtime.AuthorizationController
import jakarta.annotation.Priority
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Alternative
import jakarta.interceptor.Interceptor
import org.eclipse.microprofile.config.inject.ConfigProperty

@Alternative
@Priority(Interceptor.Priority.LIBRARY_AFTER)
@ApplicationScoped
class CustomAuthorizationController(
    @ConfigProperty(name = "api.authorization.enable", defaultValue = "true")
    val authorizationEnabled: Boolean
) : AuthorizationController() {

    override fun isAuthorizationEnabled(): Boolean {
        return authorizationEnabled
    }
}