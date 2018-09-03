package github.joeyslalom

import io.kubernetes.client.apis.CoreV1Api
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption


@ShellComponent
class K8sCommands(private val api: CoreV1Api) {

    @ShellMethod("get pods")
    fun pods(@ShellOption(defaultValue = "default") namespace: String): List<String> {
        val podList = api.listNamespacedPod(namespace, null, null, null,
                null, null, null, null,
                null, null)

        return podList.items.map { it.metadata.name }
    }

}