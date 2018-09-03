package github.joeyslalom

import io.kubernetes.client.apis.CoreV1Api
import io.kubernetes.client.util.Config
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class K8sConfig {

    init {
        Config.defaultClient().also {
            io.kubernetes.client.Configuration.setDefaultApiClient(it)
        }
    }

    @Bean
    fun k8sCoreV1Api(): CoreV1Api = CoreV1Api()
}