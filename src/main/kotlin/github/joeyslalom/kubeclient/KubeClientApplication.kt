package github.joeyslalom.kubeclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeClientApplication

fun main(args: Array<String>) {
    runApplication<KubeClientApplication>(*args)
}
